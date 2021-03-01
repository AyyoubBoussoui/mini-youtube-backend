package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.dao.PlayListedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PlayListeService {
    @Autowired
    private PlayListedao pld;

    public int save(PlayListe playliste) {
         pld.save(playliste);
        return 1;
    }

    public PlayListe findByRef(String ref) {
        return pld.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return pld.deleteByRef(ref);
    }
    public void update(PlayListe playst){
        pld.save(playst);
    }
}
