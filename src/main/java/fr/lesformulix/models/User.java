package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity()
@Table(name="users")
public class User extends Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(nullable=false, unique=true)
    @Size(min=6, max=100)
    private String email;
    @Column(nullable=false)
    @Size(min=6)
    private String password;
    @Column(nullable=false, unique=true)
    @Size(min=2, max=50)
    private String username;
    @Column(columnDefinition = "boolean default true")
    private Boolean active;
    @Column(columnDefinition = "boolean default false")
    private Boolean admin;
    @OneToMany(mappedBy="user")
    private Set<Session> sessions;

    @OneToMany(mappedBy="owner")
    private Set<League> leagues;

    @OneToMany(mappedBy="user")
    private Set<Prediction> predictions;
    @OneToMany(mappedBy="user")
    private Set<Notification> notifications;

    public User() {
    }

    /*
    Constructeur pour l'inscription
     */
    public User(String email, String password, String username){
        setEmail(email);
        setPassword(password);
        setUsername(username);
    }

    public User(long id, String email, String password, String username, String firstname, String lastname, Boolean active, Boolean admin, Set<Session> sessions, Set<League> leagues, Set<Prediction> predictions, Set<Notification> notifications) {
        super(firstname, lastname);
        setId(id);
        setEmail(email);
        setPassword(password);
        setUsername(username);
        setActive(active);
        setAdmin(admin);
        setSessions(sessions);
        setLeagues(leagues);
        setPredictions(predictions);
        setNotifications(notifications);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public Set<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    public Set<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(Set<Prediction> predictions) {
        this.predictions = predictions;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", firstname='" + super.getFirstname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", active=" + active +
                ", admin=" + admin +
                ", sessions=" + sessions +
                ", leagues=" + leagues +
                ", predictions=" + predictions +
                ", notifications=" + notifications +
                '}';
    }
}
