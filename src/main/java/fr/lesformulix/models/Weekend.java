package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.security.Timestamp;
import java.util.Set;

@Entity
@Table(name="weekends")
public class Weekend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(max = 50)
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, columnDefinition = "tinyint default 0")
    private byte status;

    private int api_meeting_key;
    @Column(nullable = false)
    private Timestamp scheduled_p1_time;

    private Timestamp scheduled_p2_time;

    private Timestamp scheduled_p3_time;

    private Timestamp scheduled_shootout_time;

    private Timestamp scheduled_sprint_time;
    @Column(nullable = false)
    private Timestamp scheduled_qualification_time;
    @Column(nullable = false)
    private Timestamp scheduled_race_time;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Track track;

    @OneToMany(mappedBy="weekend")
    private Set<Prediction> predictions;

    public Weekend() {
    }

    public Weekend(long id, String name, byte status, int api_meeting_key, Timestamp scheduled_p1_time, Timestamp scheduled_p2_time, Timestamp scheduled_p3_time, Timestamp scheduled_shootout_time, Timestamp scheduled_sprint_time, Timestamp scheduled_qualification_time, Timestamp scheduled_race_time, Track track, Set<Prediction> predictions) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.api_meeting_key = api_meeting_key;
        this.scheduled_p1_time = scheduled_p1_time;
        this.scheduled_p2_time = scheduled_p2_time;
        this.scheduled_p3_time = scheduled_p3_time;
        this.scheduled_shootout_time = scheduled_shootout_time;
        this.scheduled_sprint_time = scheduled_sprint_time;
        this.scheduled_qualification_time = scheduled_qualification_time;
        this.scheduled_race_time = scheduled_race_time;
        this.track = track;
        this.predictions = predictions;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getApi_meeting_key() {
        return api_meeting_key;
    }

    public void setApi_meeting_key(int api_meeting_key) {
        this.api_meeting_key = api_meeting_key;
    }

    public Timestamp getScheduled_p1_time() {
        return scheduled_p1_time;
    }

    public void setScheduled_p1_time(Timestamp scheduled_p1_time) {
        this.scheduled_p1_time = scheduled_p1_time;
    }

    public Timestamp getScheduled_p2_time() {
        return scheduled_p2_time;
    }

    public void setScheduled_p2_time(Timestamp scheduled_p2_time) {
        this.scheduled_p2_time = scheduled_p2_time;
    }

    public Timestamp getScheduled_p3_time() {
        return scheduled_p3_time;
    }

    public void setScheduled_p3_time(Timestamp scheduled_p3_time) {
        this.scheduled_p3_time = scheduled_p3_time;
    }

    public Timestamp getScheduled_shootout_time() {
        return scheduled_shootout_time;
    }

    public void setScheduled_shootout_time(Timestamp scheduled_shootout_time) {
        this.scheduled_shootout_time = scheduled_shootout_time;
    }

    public Timestamp getScheduled_sprint_time() {
        return scheduled_sprint_time;
    }

    public void setScheduled_sprint_time(Timestamp scheduled_sprint_time) {
        this.scheduled_sprint_time = scheduled_sprint_time;
    }

    public Timestamp getScheduled_qualification_time() {
        return scheduled_qualification_time;
    }

    public void setScheduled_qualification_time(Timestamp scheduled_qualification_time) {
        this.scheduled_qualification_time = scheduled_qualification_time;
    }

    public Timestamp getScheduled_race_time() {
        return scheduled_race_time;
    }

    public void setScheduled_race_time(Timestamp scheduled_race_time) {
        this.scheduled_race_time = scheduled_race_time;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Set<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(Set<Prediction> predictions) {
        this.predictions = predictions;
    }

    @Override
    public String toString() {
        return "Weekend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", api_meeting_key=" + api_meeting_key +
                ", scheduled_p1_time=" + scheduled_p1_time +
                ", scheduled_p2_time=" + scheduled_p2_time +
                ", scheduled_p3_time=" + scheduled_p3_time +
                ", scheduled_shootout_time=" + scheduled_shootout_time +
                ", scheduled_sprint_time=" + scheduled_sprint_time +
                ", scheduled_qualification_time=" + scheduled_qualification_time +
                ", scheduled_race_time=" + scheduled_race_time +
                ", track=" + track +
                ", predictions=" + predictions +
                '}';
    }
}
