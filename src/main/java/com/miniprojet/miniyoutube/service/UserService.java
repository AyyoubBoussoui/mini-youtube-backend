package com.miniprojet.miniyoutube.service;


import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {


    public int save(User user) {
        if (findByLogin(user.getLogin()) != null) {
            return -1;
        } else {
            userDao.save(user);
            return 1;
        }
    }




    @Autowired

    private UserDao userDao;

    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    public int deleteByLogin(String login) {
        return userDao.deleteByLogin(login);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}