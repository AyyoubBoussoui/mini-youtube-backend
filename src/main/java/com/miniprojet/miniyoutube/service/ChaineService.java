package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.ChaineDao;
import com.miniprojet.miniyoutube.vo.ChaineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import java.util.List;

@Service
public class ChaineService {
    @Autowired
    private UserService userService;
    @Autowired
    private EntityManager entityManagerger;
    @Autowired
    private ChaineDao chaineDao;


    public Chaine findByRef(String ref) {
        return chaineDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return chaineDao.deleteByRef(ref);
    }

    public List<Chaine> findByUserRef(String ref) {
        return chaineDao.findByUserRef(ref);
    }

    public int deleteByUserRef(String ref) {
        return chaineDao.deleteByUserRef(ref);
    }

    public List<Chaine> findAll() {
        return chaineDao.findAll();
    }

    public void update(Chaine chaine) {
        chaineDao.save(chaine);
    }


    public int save(User user, List<Chaine> chaines) {

        for (Chaine chaine : chaines) {
            chaine.setUser(user);
            chaineDao.save(chaine);

        }
        return 1;
    }

    public List<ChaineVo> SerchByNombreDabonne(ChaineVo chaineVo) {
        String query = "SELECT c FROM Chaine c  where 1=1";
        if (chaineVo.getRef()!= null && !chaineVo.getRef().isEmpty()) {
            query += " AND c.ref='" + chaineVo.getRef() + "' ";
        }
        if (chaineVo.getNombreAbonneeMin() != null) {
            query += " AND c.nombreAbonnee >=" + chaineVo.getNombreAbonneeMin();
        }
        if (chaineVo.getNombreAbonneeMax() != null) {
            query += " AND c.nombreAbonnee <=" + chaineVo.getNombreAbonneeMax();
        }

        return entityManagerger.createQuery(query).getResultList();

    }








}
