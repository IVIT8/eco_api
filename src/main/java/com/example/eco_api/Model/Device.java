package com.example.eco_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    private Long id;

    private int time;

    private int volt_in_hour;

    private String name;

    public Device() {}

    public Device(int volt_in_hour, int time, String name) {
        this.volt_in_hour = volt_in_hour;
        this.time = time;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getvolt_in_hour() {
        return this.volt_in_hour;
    }

    public void setvolt_in_hour(int volt_in_hour) {
        this.volt_in_hour = volt_in_hour;
    }

    public int gettime() {
        return this.time;
    }

    public void settime(int time) {
        this.time = time;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public Long getid() {
        return this.id;
    }
}