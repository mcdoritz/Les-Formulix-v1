package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    @Size(min = 3, max = 100)
    @Column(nullable=false)
    private String name;

    @OneToMany(mappedBy="continent")
    private Set<Country> countries;

    public Continent() {

    }

    public Continent(byte id, String name, Set<Country> countries) {
        this.id = id;
        this.name = name;
        this.countries = countries;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
