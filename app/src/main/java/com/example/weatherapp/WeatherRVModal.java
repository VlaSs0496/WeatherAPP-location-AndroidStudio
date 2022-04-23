package com.example.weatherapp;

public class WeatherRVModal {

    private String time;
    private String temperature;
    private String icon;
    private String windSeed;

    public WeatherRVModal(String time, String temperature, String icon, String windSeed) {
        this.time = time;
        this.temperature = temperature;
        this.icon = icon;
        this.windSeed = windSeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSeed() {
        return windSeed;
    }

    public void setWindSeed(String windSeed) {
        this.windSeed = windSeed;
    }

}
