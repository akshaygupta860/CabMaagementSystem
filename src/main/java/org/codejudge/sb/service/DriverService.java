package org.codejudge.sb.service;

import org.codejudge.sb.dto.SuccessDto;
import org.codejudge.sb.entity.DriverLocation;
import org.codejudge.sb.entity.DriverRegistration;

import java.util.List;

public interface DriverService
{
    public DriverRegistration onBoardDriver(DriverRegistration driverRegistration);

    public SuccessDto sendDriverLocation(DriverLocation location);

    public boolean isValidDriverRegistration(DriverRegistration request);

    public List<DriverLocation> findAllDrivers();

    public DriverRegistration findRegisteredDriverById(Integer id);
}
