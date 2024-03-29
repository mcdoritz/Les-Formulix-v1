package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String name;

    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String specie;
}
