package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
public class Initials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable=false, unique=true)
    @Size(min = 3, max = 3)
    private String initials;

    @ManyToMany
    private Set<Driver> drivers;

    public Initials(){
    }

    public Initials(long id, String initials, Set<Driver> drivers) {
        this.id = id;
        this.initials = initials;
        this.drivers = drivers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Initials{" +
                "id=" + id +
                ", initials='" + initials + '\'' +
                ", drivers=" + drivers +
                '}';
    }
}
