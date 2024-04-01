package fr.lesformulix.models;

import jakarta.persistence.*;

@Entity
@Table(name="team_members")
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private byte role;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Team team;

    public TeamMember(){
    }

    public TeamMember(long id, byte role, Team team) {
        this.id = id;
        this.role = role;
        this.team = team;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getRole() {
        return role;
    }

    public void setRole(byte role) {
        this.role = role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "id=" + id +
                ", role=" + role +
                ", team=" + team +
                '}';
    }
}
