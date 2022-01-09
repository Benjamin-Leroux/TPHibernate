package org.imt.nordeurope.tpHibernate;

import javax.persistence.*;

@Entity
public class Region {

    @Column(unique=true)
    private String name;

    @ManyToOne
    private Country country;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Temperature temperature;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
