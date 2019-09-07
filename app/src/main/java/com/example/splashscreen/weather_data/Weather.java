package com.example.splashscreen.weather_data;

public class Weather {
    String temperature;
    String humidity;
    String weather;

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWeather() {
        return weather;
    }

    public Weather(String temperature, String humidity, String weather) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weather = weather;
    }
}
