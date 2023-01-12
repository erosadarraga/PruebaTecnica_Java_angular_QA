package com.system.spacial.service.impl;

import com.system.spacial.model.MannedSpacecraft;
import com.system.spacial.repository.MannedSpacecraftRepository;
import com.system.spacial.service.MannedSpacecraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MannedSpacecraftServiceImpl implements MannedSpacecraftService {

    @Autowired
    private MannedSpacecraftRepository mannedSpacecraftRepository;

    @Override
    public MannedSpacecraft saveMannedSpacecraft(MannedSpacecraft mannedSpacecraft) {
        return mannedSpacecraftRepository.save(mannedSpacecraft);
    }

    @Override
    public Optional<MannedSpacecraft> getByIdMannedSpacecraft(Long mannedSpacecraftId) {
        return mannedSpacecraftRepository.findById(mannedSpacecraftId);
    }

    @Override
    public void deleteByIdMannedSpacecraft(Long mannedSpacecraftId) {
        mannedSpacecraftRepository.deleteById(mannedSpacecraftId);
    }

    @Override
    public List<MannedSpacecraft> getAllMannedSpacecraft() {
        return mannedSpacecraftRepository.findAll();
    }

}
