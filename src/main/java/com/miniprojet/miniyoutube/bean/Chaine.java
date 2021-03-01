package com.miniprojet.miniyoutube.bean;

import javax.persistence.*;

@Entity
public class Chaine {
    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String titre;
    private String descreption;
    private Long nombreAbonnee;
    private String login;
    private String password;
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

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public Long getNombreAbonnee() {
        return nombreAbonnee;
    }

    public void setNombreAbonnee(Long nombreAbonnee) {
        this.nombreAbonnee = nombreAbonnee;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
