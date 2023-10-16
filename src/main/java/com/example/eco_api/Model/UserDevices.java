package com.example.eco_api.Model;

public class UserDevices {
    private int time;

    private int volt_in_hour;

    private String name;

    private int volt_in_day;

    public UserDevices(int time, int volt_in_hour, String name) {
        this.time = time;
        this.volt_in_hour = volt_in_hour;
        this.name = name;
    }

    public UserDevices() {}

    public int getVolt_in_day() {
        return this.volt_in_day;
    }

    public void setVolt_in_day(int volt_in_day) {
        this.volt_in_day = volt_in_day;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getVolt_in_hour() {
        return this.volt_in_hour;
    }

    public void setVolt_in_hour(int volt_in_hour) {
        this.volt_in_hour = volt_in_hour;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
