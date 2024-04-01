package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String name;

    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String specie;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Driver driver;

    public Pet(){
    }

    public Pet(long id, String name, String specie, Driver driver) {
        this.id = id;
        this.name = name;
        this.specie = specie;
        this.driver = driver;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                ", driver=" + driver +
                '}';
    }
}
