package fr.lesformulix.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
public class SessionId implements Serializable {

    private User user;
    private Timestamp connection_date_hour;

}
