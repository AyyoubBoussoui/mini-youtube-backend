package com.miniprojet.miniyoutube.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ref;
    private String titre;
    private String description;
    private String tags;
    private String dateUpload;
    private double likes;
    private double dislikes;
    private double totalVue;
    private String url;
    private String path;
    private String refPlayList;
    public long getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public String getDateUpload() {
        return dateUpload;
    }

    public double getLikes() {
        return likes;
    }

    public double getDislikes() {
        return dislikes;
    }

    public double getTotalVue() {
        return totalVue;
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public String getRefPlayList() {
        return refPlayList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setDateUpload(String dateUpload) {
        this.dateUpload = dateUpload;
    }

    public void setLikes(double likes) {
        this.likes = likes;
    }

    public void setDislikes(double dislikes) {
        this.dislikes = dislikes;
    }

    public void setTotalVue(double totalVue) {
        this.totalVue = totalVue;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setRefPlayList(String refPlayList) {
        this.refPlayList = refPlayList;
    }
}
