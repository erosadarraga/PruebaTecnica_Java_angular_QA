
package com.system.spacial.service;

import com.system.spacial.model.ShuttleVehicle;

import java.util.List;
import java.util.Optional;

public interface ShuttleVehicleService {

    public ShuttleVehicle saveShuttleVehicle(ShuttleVehicle shuttleVehicle);
    public Optional<ShuttleVehicle> getByIdShuttleVehicle(Long shuttleVehicleId);

    public void deleteByIdShuttleVehicle(Long shuttleVehicleId);

    public List<ShuttleVehicle> getAllShuttleVehicle();


}
