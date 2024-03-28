package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.security.Timestamp;

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


}
