package com.system.spacial.service.impl;


import com.system.spacial.model.ShuttleVehicle;

import com.system.spacial.repository.ShuttleVehicleRepository;
import com.system.spacial.service.ShuttleVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShuttleVehicleIServiceImpl implements ShuttleVehicleService {

    @Autowired
    ShuttleVehicleRepository shuttleVehicleRepository;
    @Override
    public ShuttleVehicle saveShuttleVehicle(ShuttleVehicle shuttleVehicle) {
        return shuttleVehicleRepository.save(shuttleVehicle);
    }

    @Override
    public Optional<ShuttleVehicle> getByIdShuttleVehicle(Long shuttleVehicleId) {
        return shuttleVehicleRepository.findById(shuttleVehicleId);
    }

    @Override
    public void deleteByIdShuttleVehicle(Long shuttleVehicleId) {
        shuttleVehicleRepository.deleteById(shuttleVehicleId);
    }

    @Override
    public List<ShuttleVehicle> getAllShuttleVehicle() {
        return shuttleVehicleRepository.findAll();
    }
}
