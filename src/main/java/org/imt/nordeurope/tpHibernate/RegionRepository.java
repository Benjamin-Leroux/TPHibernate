package org.imt.nordeurope.tpHibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByName(String name);
    List<Region> findRegionByCountry_Name(String name);

    List<Region> findRegionsByTemperature_ValueGreaterThan(Integer limit);


}


