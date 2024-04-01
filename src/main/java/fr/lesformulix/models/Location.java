package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 3, max = 100)
    @Column(nullable=false)
    private String name;

    @Column(nullable = false, columnDefinition = "tinyint default 0")
    private byte timezone;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Country country;

    @OneToMany(mappedBy="location")
    private Set<Track> tracks;

    @OneToMany(mappedBy="birthplace")
    private Set<Driver> drivers;

    public Location(){
    }

    public Location(long id, String name, byte timezone, Country country, Set<Track> tracks, Set<Driver> drivers) {
        this.id = id;
        this.name = name;
        this.timezone = timezone;
        this.country = country;
        this.tracks = tracks;
        this.drivers = drivers;
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

    public byte getTimezone() {
        return timezone;
    }

    public void setTimezone(byte timezone) {
        this.timezone = timezone;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timezone=" + timezone +
                ", country=" + country +
                ", tracks=" + tracks +
                ", drivers=" + drivers +
                '}';
    }
}
