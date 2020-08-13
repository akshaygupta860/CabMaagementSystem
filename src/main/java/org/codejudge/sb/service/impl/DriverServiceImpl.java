package org.codejudge.sb.service.impl;

import org.codejudge.sb.Repository.DriverLocationRepository;
import org.codejudge.sb.Repository.DriverRepository;
import org.codejudge.sb.constant.Status;
import org.codejudge.sb.dto.SuccessDto;
import org.codejudge.sb.entity.DriverLocation;
import org.codejudge.sb.entity.DriverRegistration;
import org.codejudge.sb.service.DriverService;
import org.codejudge.sb.validator.impl.DriverValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author akshaygupta01
 */
@Service
public class DriverServiceImpl implements DriverService
{
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverLocationRepository driverLocationRepository;


    @Override
    public DriverRegistration onBoardDriver(DriverRegistration request) {
        return driverRepository.save(request);
    }

    @Override
    public SuccessDto sendDriverLocation(DriverLocation location) {
        driverLocationRepository.save(location);
        SuccessDto successDto = new SuccessDto();
        successDto.setStatus(Status.success.toString());
        return successDto;
    }

    @Override
    public boolean isValidDriverRegistration(DriverRegistration request) {
        DriverValidatorImpl validator = new DriverValidatorImpl();
        return validator.isValid(request);
    }

    @Override
    public List<DriverLocation> findAllDrivers() {
        return driverLocationRepository.findAll();
    }

    @Override
    public DriverRegistration findRegisteredDriverById(Integer id) {
        return driverRepository.findOne(id);
    }
}
