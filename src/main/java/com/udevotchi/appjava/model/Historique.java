package com.udevotchi.appjava.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Historique")
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type_action;


    @ManyToOne
    @JoinColumn (name="id_User")
    @JsonBackReference
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType_action() {
        return type_action;
    }

    public void setType_action(String type_action) {
        this.type_action = type_action;
    }

    public Historique() {
    }

    public Historique(String type_action) {
        this.type_action = type_action;
    }

    @Override
    public String toString() {
        return "Historique{" +
                "id=" + id +
                ", type_action='" + type_action + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historique that = (Historique) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type_action, that.type_action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type_action);
    }
}
