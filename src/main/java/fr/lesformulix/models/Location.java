package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Country country;

    @OneToMany(mappedBy="location")
    private Set<Track> tracks;

    @OneToMany(mappedBy="birthplace")
    private Set<Driver> drivers;

}
