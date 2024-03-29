package fr.lesformulix.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LeagueUserKey implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "league_id")
    private long league_id;
    @Column(name = "user_id")
    private long user_id;

}
