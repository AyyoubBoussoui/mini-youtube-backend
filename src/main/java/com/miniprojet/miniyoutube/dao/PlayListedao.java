package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.PlayListe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayListedao extends JpaRepository<PlayListe,Long> {

    PlayListe findByRef(String ref);
    int deleteByRef(String ref);
    List<PlayListe> findByChaineRef(String ref);
    int deleteByChaineRef(String ref );

}
