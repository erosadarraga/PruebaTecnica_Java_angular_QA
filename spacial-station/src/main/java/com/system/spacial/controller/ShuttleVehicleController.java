package com.system.spacial.controller;


import com.system.spacial.model.ShuttleVehicle;
import com.system.spacial.service.ShuttleVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shuttleVehicle")
@CrossOrigin("*")
public class ShuttleVehicleController {

    @Autowired
    private ShuttleVehicleService shuttleVehicleService;

    @PostMapping("/")
    public ShuttleVehicle saveMannedSpacecraft(@RequestBody ShuttleVehicle shuttleVehicle) throws Exception{
        ShuttleVehicle shuttleVehicleNew = new ShuttleVehicle();
        shuttleVehicleNew.setName(shuttleVehicle.getName());
        shuttleVehicleNew.setDescription(shuttleVehicle.getDescription());
        shuttleVehicleNew.setImg(shuttleVehicle.getImg());
        return shuttleVehicleService.saveShuttleVehicle(shuttleVehicleNew);
    }
    @GetMapping("/{id}")
    public Optional<ShuttleVehicle> GetShuttleVehicle(@PathVariable("id") Long id){
        System.out.println(id);
        return shuttleVehicleService.getByIdShuttleVehicle(id);

    }

    @DeleteMapping("/{id}")
    public void deleteMannedSpacecraft(@PathVariable("id")Long id ){
        shuttleVehicleService.deleteByIdShuttleVehicle(id);
    }
    @GetMapping("/")
    public List<ShuttleVehicle> getAllMannedSpacecraft(){
        return shuttleVehicleService.getAllShuttleVehicle();
    }


}
