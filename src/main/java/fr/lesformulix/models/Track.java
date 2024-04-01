package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(min = 3, max = 100)
    @Column(nullable=false)
    private String name;
    @Size(min = 2, max = 100)
    private float length;
    @Column(nullable=false, columnDefinition = "tinyint default 0")
    private byte type;

    @OneToMany(mappedBy="track")
    private Set<Weekend> weekends;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Driver driver_lap_record;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Location location;

    public Track(){
    }

    public Track(long id, String name, float length, byte type, Set<Weekend> weekends, Driver driver_lap_record, Location location) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.type = type;
        this.weekends = weekends;
        this.driver_lap_record = driver_lap_record;
        this.location = location;
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

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public Set<Weekend> getWeekends() {
        return weekends;
    }

    public void setWeekends(Set<Weekend> weekends) {
        this.weekends = weekends;
    }

    public Driver getDriver_lap_record() {
        return driver_lap_record;
    }

    public void setDriver_lap_record(Driver driver_lap_record) {
        this.driver_lap_record = driver_lap_record;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", type=" + type +
                ", weekends=" + weekends +
                ", driver_lap_record=" + driver_lap_record +
                ", location=" + location +
                '}';
    }
}
