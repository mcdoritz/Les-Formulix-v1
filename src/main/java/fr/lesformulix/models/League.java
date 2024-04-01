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
    @Min(value = 1)
    private int users_count;

    @ManyToOne
    @JoinColumn(nullable=false)
    private User owner;

    @OneToMany(mappedBy="league")
    private Set<Prediction> predictions;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Discipline discipline;

    public League(){
    }

    public League(long id, String name, String acronym, Boolean active, int max_users, int users_count, User owner, Set<Prediction> predictions, Discipline discipline) {
        this.id = id;
        this.name = name;
        this.acronym = acronym;
        this.active = active;
        this.max_users = max_users;
        this.users_count = users_count;
        this.owner = owner;
        this.predictions = predictions;
        this.discipline = discipline;
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

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                ", active=" + active +
                ", max_users=" + max_users +
                ", users_count=" + users_count +
                ", owner=" + owner +
                ", predictions=" + predictions +
                ", discipline=" + discipline +
                '}';
    }
}
