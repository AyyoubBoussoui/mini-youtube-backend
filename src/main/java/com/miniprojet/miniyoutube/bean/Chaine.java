package com.miniprojet.miniyoutube.bean;

import javax.persistence.*;

@Entity
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String titre;
    private Long nombreAbonnee;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public Long getNombreAbonnee() {
        return nombreAbonnee;
    }

    public void setNombreAbonnee(Long nombreAbonnee) {
        this.nombreAbonnee = nombreAbonnee;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
