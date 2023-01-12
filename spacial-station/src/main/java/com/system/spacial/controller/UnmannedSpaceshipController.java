package com.system.spacial.controller;


import com.system.spacial.model.ShuttleVehicle;
import com.system.spacial.model.UnmannedSpaceship;
import com.system.spacial.service.ShuttleVehicleService;
import com.system.spacial.service.UnmannedSpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/unmannedSpaceship")
@CrossOrigin("*")
public class UnmannedSpaceshipController {

    @Autowired
    private UnmannedSpaceshipService unmannedSpaceshipService;

    @PostMapping("/")
    public UnmannedSpaceship saveUnmannedSpaceship(@RequestBody UnmannedSpaceship unmannedSpaceship) throws Exception{
        UnmannedSpaceship unmannedSpaceshipNew = new UnmannedSpaceship();
        unmannedSpaceshipNew.setName(unmannedSpaceship.getName());
        unmannedSpaceshipNew.setDescription(unmannedSpaceship.getDescription());
        unmannedSpaceshipNew.setImg(unmannedSpaceship.getImg());
        return unmannedSpaceshipService.saveUnmannedSpaceship(unmannedSpaceshipNew);
    }
    @GetMapping("/{id}")
    public Optional<UnmannedSpaceship> GetUnmannedSpaceship(@PathVariable("id") Long id){
        System.out.println(id);
        return unmannedSpaceshipService.getByIdUnmannedSpaceship(id);

    }

    @DeleteMapping("/{id}")
    public void deleteUnmannedSpaceship(@PathVariable("id")Long id ){
        unmannedSpaceshipService.deleteByIdUnmannedSpaceship(id);
    }
    @GetMapping("/")
    public List<UnmannedSpaceship> getAllUnmannedSpaceship(){
        return unmannedSpaceshipService.getAllUnmannedSpaceship();
    }


}
