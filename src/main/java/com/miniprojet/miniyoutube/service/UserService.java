package com.miniprojet.miniyoutube.service;


import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.UserDao;
import com.miniprojet.miniyoutube.vo.Videovo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserService {
    @Transactional



    public int deleteByRef(String ref) {
        System.out.println("ref = " + ref);
        int deleteByUserRef = chaineService.deleteByUserRef(ref);
        int deleteByRef = userDao.deleteByRef(ref);
        return deleteByUserRef + deleteByRef;
    }



    public void update(User user) {
        userDao.save(user);
    }


    public int save(User user) {
        if (findByRef(user.getRef()) != null) {
            return -1;
        } else {
            userDao.save(user);
            chaineService.save(user, user.getChaines());
            return 1;
        }
    }

    public User findByLogin (String login ){
        return userDao.findByLogin(login);
    }

    public User findByRef(String ref) {
        return userDao.findByRef(ref);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public int connecter(String login , String password){
        User us = findByLogin(login);
        if(us == null){
            return  -1 ;

        }else if (!us.getPassword().equals(password)){
            return -2;
        }else {return  1;}
    }


    @Autowired

    private UserDao userDao;
    @Autowired
    private ChaineService chaineService;


}