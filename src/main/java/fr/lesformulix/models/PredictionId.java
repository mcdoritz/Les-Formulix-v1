package fr.lesformulix.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PredictionId implements Serializable {

    private User user;

    private League league;

    private Weekend weekend;
}
