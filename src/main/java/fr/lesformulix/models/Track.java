package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private float length;

    private byte type;

    @OneToMany(mappedBy="track")
    private Set<Weekend> weekends;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Driver driver_lap_record;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Location location;
}
