package org.codejudge.sb.service;

/**
 * @author akshaygupta01
 */
public interface DistanceCalculationService
{
    Boolean isWithingFourKilometer(Double lat1, Double lon1,
                                   Double lat2, Double lon2);
}
