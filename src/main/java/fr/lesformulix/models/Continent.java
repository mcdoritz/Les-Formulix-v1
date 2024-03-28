package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte id;

    @OneToMany(mappedBy="continent")
    private Set<Country> countries;
}
