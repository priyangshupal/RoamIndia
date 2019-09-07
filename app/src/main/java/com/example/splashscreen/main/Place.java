package com.example.splashscreen.main;

public class Place {
    private String imageSrc;
    private String name;
    private String location;

    public Place(String name) {
        this.name = name;
    }

    public Place(String imageSrc, String name, String location) {
        this.imageSrc = imageSrc;
        this.name = name;
        this.location = location;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
