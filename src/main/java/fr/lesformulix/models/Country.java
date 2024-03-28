package fr.lesformulix.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Continent continent;

    @OneToMany(mappedBy="country")
    private Set<Location> locations;

}
