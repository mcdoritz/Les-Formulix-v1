package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date creation_date;

    @Column(columnDefinition = "tinyint default 0")
    private byte titles;

    @OneToMany(mappedBy="team")
    private Set<Driver> drivers;

    @OneToMany(mappedBy="team")
    private Set<TeamMember> teamMembers;

    public Team(){
    }

    public Team(long id, String name, Date creation_date, byte titles, Set<Driver> drivers, Set<TeamMember> teamMembers) {
        this.id = id;
        this.name = name;
        this.creation_date = creation_date;
        this.titles = titles;
        this.drivers = drivers;
        this.teamMembers = teamMembers;
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

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public byte getTitles() {
        return titles;
    }

    public void setTitles(byte titles) {
        this.titles = titles;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Set<TeamMember> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creation_date=" + creation_date +
                ", titles=" + titles +
                ", drivers=" + drivers +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
