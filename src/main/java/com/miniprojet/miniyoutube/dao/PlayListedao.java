package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.PlayListe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayListedao extends JpaRepository<PlayListe,Long> {

    PlayListe findByRef(String ref);
    int deleteByRef(String ref);

}
