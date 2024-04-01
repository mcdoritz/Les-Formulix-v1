package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="predictions")
public class Prediction {

    @Id
    @ManyToOne
    @JoinColumn(nullable=false)
    User user;

    @Id
    @ManyToOne
    @JoinColumn(nullable=false)
    League league;

    @Id
    @ManyToOne
    @JoinColumn(nullable=false)
    Weekend weekend;

    @Size(min = 2, max = 100)
    String predictions;

    @Size(min = 2, max = 100)
    String scores;

    public Prediction(){
    }

    public Prediction(User user, League league, Weekend weekend, String predictions, String scores) {
        this.user = user;
        this.league = league;
        this.weekend = weekend;
        this.predictions = predictions;
        this.scores = scores;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Weekend getWeekend() {
        return weekend;
    }

    public void setWeekend(Weekend weekend) {
        this.weekend = weekend;
    }

    public String getPredictions() {
        return predictions;
    }

    public void setPredictions(String predictions) {
        this.predictions = predictions;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "user=" + user +
                ", league=" + league +
                ", weekend=" + weekend +
                ", predictions='" + predictions + '\'' +
                ", scores='" + scores + '\'' +
                '}';
    }
}
