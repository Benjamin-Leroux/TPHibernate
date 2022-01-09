package org.imt.nordeurope.tpHibernate;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.util.List;
import org.imt.nordeurope.tpHibernate.Region;

@Entity
@Table(name="COUNTRY")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="COUNTRY_NAME",unique=true)
    private String name;

    @Column(name="President")
    private String president;

    @Column
    private double averageTemperature;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Region> regions;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPresident() {
        return president;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region){
        regions.add(region);
    }
    public void removeRegion(Region region){
        regions.remove(region);
    }
}
