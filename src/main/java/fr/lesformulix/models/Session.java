package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name="sessions")
public class Session {

    // Composite key : user_id + timestamp
    @Id
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @Id
    @Column(nullable=false)
    private Timestamp connection_date_hour;

    //Data collected :
    @Size(max=50)
    private String ip;
    private String browser;
    private String os;

}
