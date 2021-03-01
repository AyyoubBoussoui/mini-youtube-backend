package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.Chaine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaineDao extends JpaRepository<Chaine,Long > {

    Chaine findByRef(String ref);
    int deleteByRef(String ref);

}