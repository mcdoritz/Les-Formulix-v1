package fr.lesformulix.models;

import jakarta.persistence.*;

@Entity
@Table(name="team_members")
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private byte role;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Team team;

}
