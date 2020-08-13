package org.codejudge.sb.Repository;


import org.codejudge.sb.dto.RegisterDriverRequest;
import org.codejudge.sb.entity.DriverRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author akshaygupta01
 */
@Repository
public interface DriverRepository  extends JpaRepository<DriverRegistration, Integer>
{

}
