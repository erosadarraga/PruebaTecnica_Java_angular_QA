package com.system.spacial.service.impl;

import com.system.spacial.model.UnmannedSpaceship;
import com.system.spacial.repository.UnmannedSpaceshipRepository;
import com.system.spacial.service.UnmannedSpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnmannedSpaceshipServiceImpl implements UnmannedSpaceshipService {

    @Autowired
    UnmannedSpaceshipRepository unmannedSpaceshipRepository;
    @Override
    public UnmannedSpaceship saveUnmannedSpaceship(UnmannedSpaceship unmannedSpaceship) {
        return unmannedSpaceshipRepository .save(unmannedSpaceship);
    }

    @Override
    public Optional<UnmannedSpaceship> getByIdUnmannedSpaceship(Long unmannedSpaceship) {
        return unmannedSpaceshipRepository.findById(unmannedSpaceship);
    }

    @Override
    public void deleteByIdUnmannedSpaceship(Long unmannedSpaceshipId) {
        unmannedSpaceshipRepository.deleteById(unmannedSpaceshipId);
    }

    @Override
    public List<UnmannedSpaceship> getAllUnmannedSpaceship() {
        return unmannedSpaceshipRepository.findAll();
    }
}
