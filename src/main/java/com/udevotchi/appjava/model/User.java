package com.udevotchi.appjava.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String contact_nom;

    private String contact_prenom;

    private String contact_pseudo;

    private String contact_mail;

    private Long contact_mdp;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Historique> historique;

    public List<Historique> getHistorique() {
        return historique;
    }

    public void setHistorique(List<Historique> historique) {
        this.historique = historique;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContact_nom() {
        return contact_nom;
    }

    public void setContact_nom(String contact_nom) {
        this.contact_nom = contact_nom;
    }

    public String getContact_prenom() {
        return contact_prenom;
    }

    public void setContact_prenom(String contact_prenom) {
        this.contact_prenom = contact_prenom;
    }

    public String getContact_pseudo() {
        return contact_pseudo;
    }

    public void setContact_pseudo(String contact_pseudo) {
        this.contact_pseudo = contact_pseudo;
    }

    public String getContact_mail() {
        return contact_mail;
    }

    public void setContact_mail(String contact_mail) {
        this.contact_mail = contact_mail;
    }

    public Long getContact_mdp() {
        return contact_mdp;
    }

    public void setContact_mdp(Long contact_mdp) {
        this.contact_mdp = contact_mdp;
    }

    public User() {
    }

    public User(String contact_nom, String contact_prenom, String contact_pseudo, String contact_mail, Long contact_mdp) {
        this.contact_nom = contact_nom;
        this.contact_prenom = contact_prenom;
        this.contact_pseudo = contact_pseudo;
        this.contact_mail = contact_mail;
        this.contact_mdp = contact_mdp;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", contact_nom='" + contact_nom + '\'' +
                ", contact_prenom='" + contact_prenom + '\'' +
                ", contact_pseudo='" + contact_pseudo + '\'' +
                ", contact_mail='" + contact_mail + '\'' +
                ", contact_mdp=" + contact_mdp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                contact_nom.equals(user.contact_nom) &&
                contact_prenom.equals(user.contact_prenom) &&
                contact_pseudo.equals(user.contact_pseudo) &&
                contact_mail.equals(user.contact_mail) &&
                contact_mdp.equals(user.contact_mdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contact_nom, contact_prenom, contact_pseudo, contact_mail, contact_mdp);
    }
}
