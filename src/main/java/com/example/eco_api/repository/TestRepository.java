package com.example.eco_api.repository;

import com.example.eco_api.Model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Device, Long> {}
