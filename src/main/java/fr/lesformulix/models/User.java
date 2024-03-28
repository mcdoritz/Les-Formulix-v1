package fr.lesformulix.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity()
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(nullable=false, unique=true)
    @Size(min=6, max=100)
    private String email;
    @Column(nullable=false)
    @Size(min=6, max=30)
    private String password;
    @Column(nullable=false, unique=true)
    @Size(min=2, max=50)
    private String username;
    @Size(min=2, max=50)
    private String firstname;
    @Size(min=2, max=50)
    private String lastname;
    @Column(columnDefinition = "boolean default true")
    private Boolean active;
    @Column(columnDefinition = "boolean default false")
    private Boolean admin;
    @OneToMany(mappedBy="cart")
    private Set<Session> sessions;
}
