package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User,Long> {

    List <User>findByChaineId(Long Id);
    int  deleteByChaine(String Id);


}