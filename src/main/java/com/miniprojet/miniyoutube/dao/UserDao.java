package com.miniprojet.miniyoutube.dao;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User,Long> {

    User findByLogin(String login);
    int deleteByLogin(String login);


}