package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name="leagues")
public class League {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Size(min=3, max=100)
    @Column(nullable=false, unique=true)
    private String name;
    @Size(min=3, max=5)
    @Column(nullable=false)
    private String acronym;
    @Column(nullable=false, columnDefinition = "boolean default true")
    private Boolean active;

    @Max(value = 1000)
    @Min(value = 1)
    private int max_users;

    @ManyToOne
    @JoinColumn(nullable=false)
    private User owner;

    @OneToMany(mappedBy="league")
    private Set<Prediction> predictions;

    //Fetch permet ici de charger les disciplines en même temps que la ligue
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Discipline> disciplines;

    @Transient
    private int users_count;

    public League(){
    }

    public League(long id, String name, String acronym, Boolean active, int max_users, int users_count, User owner, Set<Prediction> predictions, Set<Discipline> disciplines) {
        setId(id);
        setName(name);
        setAcronym(acronym);
        setActive(active);
        setMax_users(max_users);
        setUsers_count(users_count);
        setOwner(owner);
        setPredictions(predictions);
        setDisciplines(disciplines);
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

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getMax_users() {
        return max_users;
    }

    public void setMax_users(int max_users) {
        this.max_users = max_users;
    }

    public int getUsers_count() {
        return users_count;
    }

    public void setUsers_count(int users_count) {
        this.users_count = users_count;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Set<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(Set<Prediction> predictions) {
        this.predictions = predictions;
    }

    public Set<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", acronym='" + getAcronym() + '\'' +
                ", active=" + getActive() +
                ", max_users=" + getMax_users() +
                ", users_count=" + getUsers_count() +
                ", owner=" + getOwner().getUsername() +
                ", disciplines=" + getDisciplines().toString() +
                '}';
    }
}
