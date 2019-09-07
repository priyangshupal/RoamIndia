package com.example.splashscreen.Adapters;

import android.content.Context;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.splashscreen.R;
import com.example.splashscreen.main.Places_Main;
import com.example.splashscreen.weather_data.Utils;
import com.example.splashscreen.weather_data.Weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Adapter_Main extends ArrayAdapter {

    public Adapter_Main(Context context, List objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.main_adapter_view, parent, false);
        }

        Places_Main places_main = (Places_Main) getItem(position);
        ImageView imageHeader = listItemView.findViewById(R.id.image_header);
        imageHeader.setImageResource(places_main.getImageLoc());

        DownloadWeatherData downloadWeatherData = new DownloadWeatherData(
                (TextView) listItemView.findViewById(R.id.temperature),
                (TextView)listItemView.findViewById(R.id.humidity),
                (ImageView) listItemView.findViewById(R.id.weather_icon),
                (TextView)listItemView.findViewById(R.id.weather_description));
        downloadWeatherData.execute(places_main.getLink());

        return listItemView;
    }

    private class DownloadWeatherData extends AsyncTask<String, Void, Weather> {

        TextView temperature;
        TextView humidity;
        ImageView imageView;
        TextView weather_description;

        private DownloadWeatherData(TextView temperature, TextView humidity, ImageView imageView, TextView weather_description) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.imageView = imageView;
            this.weather_description = weather_description;
        }

        @Override
        protected Weather doInBackground(String... urls) {
            return Utils.fetchWeatherData(urls[0]);
        }

        @Override
        protected void onPostExecute(Weather weather) {
            int temp = ((int) Double.parseDouble(weather.getTemperature())) - 273;
            temperature.setText(temp + "ºC");
            humidity.setText(weather.getHumidity() + "%");
            weather_description.setText(weather.getWeather());

            Date today = new Date();
            SimpleDateFormat format = new SimpleDateFormat("HH");
            String dateToStr = format.format(today);
            int time = Integer.parseInt(dateToStr);

            switch(weather.getWeather()) {
                case "Clouds":
                    imageView.setImageResource(R.drawable.clouds);
                    break;
                case "Dust":
                    imageView.setImageResource(R.drawable.dust);
                    break;
                case "Haze":
                    imageView.setImageResource(R.drawable.haze);
                    break;
                case "Rain":
                    imageView.setImageResource(R.drawable.rain);
                    break;
                case "Thunderstorm":
                    imageView.setImageResource(R.drawable.thunderstorm);
                    break;
                case "Mist":
                    if(time < 18)
                        imageView.setImageResource(R.drawable.mist);
                    else
                        imageView.setImageResource(R.drawable.mist_night);
                    break;
                case "Clear":
                    if(time < 18)
                        imageView.setImageResource(R.drawable.sun);
                    else
                        imageView.setImageResource(R.drawable.moon);
                    break;
                default:
                    imageView.setImageResource(R.drawable.sun);
            }
        }
    }
}