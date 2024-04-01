package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 100)
    @Column(nullable=false)
    private String name;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Continent continent;

    @OneToMany(mappedBy="country")
    private Set<Location> locations;

    @OneToMany(mappedBy="nationality")
    private Set<Driver> drivers;

    public Country(){

    }

    public Country(int id, String name, Continent continent, Set<Location> locations, Set<Driver> drivers) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.locations = locations;
        this.drivers = drivers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", continent=" + continent +
                ", locations=" + locations +
                ", drivers=" + drivers +
                '}';
    }
}
