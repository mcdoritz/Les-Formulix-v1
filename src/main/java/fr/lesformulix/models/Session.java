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
    @JoinColumn(nullable=false)
    private User user;
    @Id
    @Column(nullable=false)
    private Timestamp connection_date_hour;

    //Data collected :
    @Size(max=50)
    private String ip;
    private String browser;
    private String os;

    public Session(){
    }

    public Session(User user, Timestamp connection_date_hour, String ip, String browser, String os) {
        this.user = user;
        this.connection_date_hour = connection_date_hour;
        this.ip = ip;
        this.browser = browser;
        this.os = os;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getConnection_date_hour() {
        return connection_date_hour;
    }

    public void setConnection_date_hour(Timestamp connection_date_hour) {
        this.connection_date_hour = connection_date_hour;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user +
                ", connection_date_hour=" + connection_date_hour +
                ", ip='" + ip + '\'' +
                ", browser='" + browser + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
