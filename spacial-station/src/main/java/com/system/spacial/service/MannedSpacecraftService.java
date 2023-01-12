package com.system.spacial.service;

import com.system.spacial.model.MannedSpacecraft;

import java.util.List;
import java.util.Optional;

public interface MannedSpacecraftService {

    public MannedSpacecraft saveMannedSpacecraft(MannedSpacecraft mannedSpacecraft);
    public Optional<MannedSpacecraft> getByIdMannedSpacecraft(Long mannedSpacecraftId);

    public void deleteByIdMannedSpacecraft(Long mannedSpacecraftId);

    public List<MannedSpacecraft> getAllMannedSpacecraft();


}
