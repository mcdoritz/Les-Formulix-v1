package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "nicknames")
public class Nickname {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 2, max = 100)
    @Column(nullable = false)
    private String nickname;

    @ManyToMany
    private Set<Driver> drivers;

    public Nickname(){
    }

    public Nickname(long id, String nickname, Set<Driver> drivers) {
        this.id = id;
        this.nickname = nickname;
        this.drivers = drivers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Nickname{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", drivers=" + drivers +
                '}';
    }
}
