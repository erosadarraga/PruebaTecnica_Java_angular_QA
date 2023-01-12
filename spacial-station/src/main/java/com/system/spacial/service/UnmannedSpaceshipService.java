
package com.system.spacial.service;
import com.system.spacial.model.UnmannedSpaceship;

import java.util.List;
import java.util.Optional;

public interface UnmannedSpaceshipService {

    public UnmannedSpaceship saveUnmannedSpaceship(UnmannedSpaceship unmannedSpaceship);
    public Optional<UnmannedSpaceship> getByIdUnmannedSpaceship(Long unmannedSpaceshipId);

    public void deleteByIdUnmannedSpaceship(Long unmannedSpaceshipId);

    public List<UnmannedSpaceship> getAllUnmannedSpaceship();


}
