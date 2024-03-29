package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String firstname;
    @Column(nullable=false)
    private String lastname;

    @Column(nullable=false, columnDefinition = "boolean default false")
    private Boolean driving;

    private byte seasons;
    @Column(nullable=false)
    private Date birthdate;
    @Column(nullable=false, columnDefinition = "text")
    private String notes;

    private Date end_of_contract;

    @OneToMany(mappedBy="driver_lap_record")
    private Set<Track> tracks;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Team team;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Location birthplace;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Country nationality;

}
