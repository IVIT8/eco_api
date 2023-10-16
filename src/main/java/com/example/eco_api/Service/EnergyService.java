package com.example.eco_api.Service;

import com.example.eco_api.Model.UserDevices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyService {
    public List<UserDevices> GetEnergy(List<UserDevices> devices) {
        for (UserDevices d : devices)
            d.setVolt_in_day(d.getVolt_in_hour() * d.getTime());
        return devices;
    }
}