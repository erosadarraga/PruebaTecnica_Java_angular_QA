package com.system.spacial.controller;

import com.system.spacial.model.MannedSpacecraft;
import com.system.spacial.service.MannedSpacecraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mannedSpacecraft")
@CrossOrigin("*")
public class MannedSpacecraftController {

    @Autowired
    private MannedSpacecraftService mannedSpacecraftService;

    @PostMapping("/")
    public MannedSpacecraft saveMannedSpacecraft(@RequestBody MannedSpacecraft mannedSpacecraft) throws Exception{
        MannedSpacecraft mannedSpacecraftNew = new MannedSpacecraft();
        mannedSpacecraftNew.setName(mannedSpacecraft.getName());
        mannedSpacecraftNew.setDescription(mannedSpacecraft.getDescription());
        mannedSpacecraftNew.setImg(mannedSpacecraft.getImg());
        return mannedSpacecraftService.saveMannedSpacecraft(mannedSpacecraftNew);
    }
    @GetMapping("/{id}")
    public Optional<MannedSpacecraft> GetmannedSpacecraft(@PathVariable("id") Long id){
        return mannedSpacecraftService.getByIdMannedSpacecraft(id);

    }

    @DeleteMapping("/{id}")
    public void deleteMannedSpacecraft(@PathVariable("id")Long id ){
        mannedSpacecraftService.deleteByIdMannedSpacecraft(id);
    }
    @GetMapping("/")
    public List<MannedSpacecraft> getAllMannedSpacecraft(){
       return mannedSpacecraftService.getAllMannedSpacecraft();
    }


}
