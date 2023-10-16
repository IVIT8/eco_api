package com.example.eco_api.Controller;

import com.example.eco_api.Model.Device;
import com.example.eco_api.Model.UserDevices;
import com.example.eco_api.Service.EnergyService;
import com.example.eco_api.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/devices"})
public class EnergyController {
    private final EnergyService energyService;

    private final TestRepository testRepository;

    @Autowired
    public EnergyController(EnergyService energyService, TestRepository testRepository) {
        this.energyService = energyService;
        this.testRepository = testRepository;
    }

    @PostMapping(value = {"/energy"}, consumes = {"application/json"}, produces = {"application/json"})
    public List<UserDevices> GetEnergy(@RequestBody List<UserDevices> userDevices) {
        return this.energyService.GetEnergy(userDevices);
    }

    @GetMapping(value = {"/all"}, produces = {"application/json"})
    @ResponseBody
    public Iterable<Device> GetDevices() {
        return this.testRepository.findAll();
    }
}

