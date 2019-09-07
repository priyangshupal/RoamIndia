package com.example.splashscreen.main;

public class Places_Main {
    private int imageLoc;               // Header-image Location
    private String link;                // Link for Weather Data download

    public Places_Main(int imageLoc, String link) {
        this.imageLoc = imageLoc;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public int getImageLoc() {
        return imageLoc;
    }
}
