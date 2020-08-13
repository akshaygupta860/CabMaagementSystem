package org.codejudge.sb.service.impl;

import org.codejudge.sb.service.DistanceCalculationService;
import org.springframework.stereotype.Service;

/**
 * @author akshaygupta01
 */
@Service
public class DistanceCalculationServiceImpl implements DistanceCalculationService
{


    @Override
    public Boolean isWithingFourKilometer(Double lat1, Double lon1, Double lat2, Double lon2) {
            double distance = 4;
            double dLat = Math.toRadians(lat2 - lat1);
            double dLon = Math.toRadians(lon2 - lon1);

            // convert to radians
            lat1 = Math.toRadians(lat1);
            lat2 = Math.toRadians(lat2);

            // apply formulae
            double a = Math.pow(Math.sin(dLat / 2), 2) +
                    Math.pow(Math.sin(dLon / 2), 2) *
                            Math.cos(lat1) *
                            Math.cos(lat2);
            double rad = 6371;
            double c = 2 * Math.asin(Math.sqrt(a));
            return distance>rad * c;
        }
}
