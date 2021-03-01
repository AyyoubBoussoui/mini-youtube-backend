package com.miniprojet.miniyoutube.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayListe {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String ref;
    private String titre;
    private String description;
    private  String tags;
    private String refChaine;


    public String getRefChaine() {
        return refChaine;
    }

    public void setRefChaine(String refChaine) {
        this.refChaine = refChaine;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

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




}
