package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="drivers")
public class Driver extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, columnDefinition = "boolean default false")
    private Boolean driving;

    private byte seasons;
    @Column(nullable=false)
    private Date birthdate;
    @Column(columnDefinition = "text")
    private String notes;

    private Date end_of_contract;

    @OneToMany(mappedBy="driver_lap_record")
    private Set<Track> tracks;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Team team;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Location birthplace;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Country nationality;

    @OneToMany(mappedBy="driver")
    private Set<Pet> pets;

    @Size(max=255)
    private String nicknames;

    public Driver(){
    }

    public Driver(Long id, String firstname, String lastname, Boolean driving, byte seasons, Date birthdate, String notes, Date end_of_contract, Set<Track> tracks, Team team, Location birthplace, Country nationality, Set<Pet> pets, String nicknames) {
        super(firstname, lastname);
        setId(id);
        setDriving(driving);
        setSeasons(seasons);
        setBirthdate(birthdate);
        setNotes(notes);
        setEnd_of_contract(end_of_contract);
        setTracks(tracks);
        setTeam(team);
        setBirthplace(birthplace);
        setNationality(nationality);
        setPets(pets);
        setNicknames(nicknames);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDriving() {
        return driving;
    }

    public void setDriving(Boolean driving) {
        this.driving = driving;
    }

    public byte getSeasons() {
        return seasons;
    }

    public void setSeasons(byte seasons) {
        this.seasons = seasons;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getEnd_of_contract() {
        return end_of_contract;
    }

    public void setEnd_of_contract(Date end_of_contract) {
        this.end_of_contract = end_of_contract;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Location getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Location birthplace) {
        this.birthplace = birthplace;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public String getNicknames() {
        return nicknames;
    }

    public void setNicknames(String nicknames) {
        this.nicknames = nicknames;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstname='" + super.getFirstname() + '\'' +
                ", lastname='" + super.getLastname() + '\'' +
                ", driving=" + driving +
                ", seasons=" + seasons +
                ", birthdate=" + birthdate +
                ", notes='" + notes + '\'' +
                ", end_of_contract=" + end_of_contract +
                ", tracks=" + tracks +
                ", team=" + team +
                ", birthplace=" + birthplace +
                ", nationality=" + nationality +
                ", pets=" + pets +
                '}';
    }
}
