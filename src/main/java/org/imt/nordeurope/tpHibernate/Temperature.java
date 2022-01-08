package org.imt.nordeurope.tpHibernate;

import javax.persistence.*;

@Entity
@Table(name="TEMPERATURE")
public class Temperature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="REGION")
    private Region region;


    public Integer getTemperatureValue() {
        return value;
    }


    @Column(name="TEMPERATURE_VALUE")
    private Integer value;

    public void setId(Long id) {
        this.id = id;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Region getRegion() {
        return region;
    }

    public Integer getValue() {
        return value;
    }
}
