package org.imt.nordeurope.tpHibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

     Temperature findByRegion(Region region);
     Temperature findTemperatureByRegion_Name(String name);

}

