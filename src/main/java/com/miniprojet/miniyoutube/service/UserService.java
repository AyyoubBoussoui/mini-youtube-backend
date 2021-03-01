package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    public int save(User user) {
        if (findById(user.getId()) != null) {
            return -1;
        } else {
            userDao.save(user);
            return 1;
        }
    }



    public User findById (Long Id){
        return userDao.getOne(Id);
    }

    public List<User> findByChaineId (Long Id){
        return userDao.findByChaineId(Id);
    }

    public int deleteByChaine (String Id){
        return userDao.deleteByChaine(Id);
    }

    public List<User> findAll () {
        return userDao.findAll();
    }



    @Autowired

    private UserDao userDao;

}
