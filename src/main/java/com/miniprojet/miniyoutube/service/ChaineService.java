package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.ChaineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.ChaineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChaineService {
    @Autowired
    private UserService userService;


    public Chaine findByRef(String ref) {
        return chaineDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return chaineDao.deleteByRef(ref);
    }

    public List<Chaine> findByUserId(Long Id) {
        return chaineDao.findByUserId(Id);
    }

    public List<Chaine> findAll() {
        return chaineDao.findAll();
    }
    public void update(Chaine chaine){
        chaineDao.save(chaine);
    }

    @Autowired
    private ChaineDao chaineDao;



    public int save(Chaine chaine) {
        if (findByRef(chaine.getRef()) != null) {
            return -1;
        }
        User user = userService.findByLogin(chaine.getUser().getLogin());
        chaine.setUser(user);
        if (user == null) {
            return -2;
        }else {
            chaineDao.save(chaine);
            return 1;
        }

    }

}