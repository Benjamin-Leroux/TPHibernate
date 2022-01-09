package org.imt.nordeurope.tpHibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByName(String name);

    @Query(value = "SELECT *\n" +
            "FROM country_regions\n" +
            "WHERE country_regions.regions_id IN\n" +
            "(SELECT temperature.region\n" +
            "FROM temperature, region\n" +
            "WHERE temperature.temperature_value > 12)",
            nativeQuery = true
    )
    List<Long> findCountriesWhereRegionsTemperatureGreaterThan12();
}
