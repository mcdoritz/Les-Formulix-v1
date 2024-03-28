package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="leagues")
public class League {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

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

}
