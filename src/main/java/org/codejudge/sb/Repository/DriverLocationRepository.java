package org.codejudge.sb.Repository;

import org.codejudge.sb.entity.DriverLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLocationRepository  extends JpaRepository<DriverLocation, Integer>
{
}
