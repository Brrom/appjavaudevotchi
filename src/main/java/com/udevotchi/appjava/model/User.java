package com.udevotchi.appjava;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String contact_nom;

    private String contact_prenom;

    private String contact_pseudo;

    private String contact_mail;

    private Long contact_mdp;
}
