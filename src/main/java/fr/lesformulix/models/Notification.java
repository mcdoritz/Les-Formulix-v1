package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name="notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private Timestamp created_at;

    private Timestamp seen_at;

    @Column(nullable = false)
    private byte notification_type;

    @Size(min = 10, max = 255)
    private String content_preview;

    @Column(nullable = false)
    private String content;

}
