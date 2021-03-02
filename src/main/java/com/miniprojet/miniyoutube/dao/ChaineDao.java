package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChaineDao extends JpaRepository<Chaine,Long > {

    Chaine findByRef(String ref);
    int deleteByRef(String ref);
    List<Chaine> findByUserId(Long Id);
}
