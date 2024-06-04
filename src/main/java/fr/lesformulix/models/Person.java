package fr.lesformulix.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

@MappedSuperclass
public abstract class Person {
    @Size(min=2, max=75)
    private String firstname;
    @Size(min=2, max=75)
    private String lastname;

    public Person() {
    }

    public Person(String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);
    }

    // getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
