package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date creation_date;

    @Column(columnDefinition = "tinyint default 0")
    private byte titles;

    @OneToMany(mappedBy="team")
    private Set<Driver> drivers;

    @OneToMany(mappedBy="team")
    private Set<TeamMember> teamMembers;
}
