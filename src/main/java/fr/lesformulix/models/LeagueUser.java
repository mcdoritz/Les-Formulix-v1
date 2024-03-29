package fr.lesformulix.models;

import jakarta.persistence.*;

@Entity
@Table(name="leagues_users")
public class LeagueUser {

    @EmbeddedId
    LeagueUserKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("league_id")
    @JoinColumn(name = "league_id")
    League league;

    private int score;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean admin;
}
