package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.dao.PlayListedao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class PlayListeService {
    @Autowired
    private PlayListedao playListedao;
    @Autowired
    private ChaineService chaineservice;
       

    public int save(PlayListe playliste) {
    	if(findByRef(playliste.getRef())!=null) {
    	return -1;}
    	
    	Chaine chaine=chaineservice.findByRef(playliste.getChaine().getRef());
    	playliste.setChaine(chaine);
    	if(chaine==null) {
    		return-2;}
    	else {
    		chaineservice.update(chaine);

            playListedao.save(playliste);
        return 1;}
    } 
    
    

	public List<PlayListe> findByChaineRef(String ref) {
		return playListedao.findByChaineRef(ref);
	}

	public int deleteByChaineRef(String ref) {
		return playListedao.deleteByChaineRef(ref);}
		


    public PlayListe findByRef(String ref) {
        return playListedao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return playListedao.deleteByRef(ref);
    }

    public void update(PlayListe playst){
        playListedao.save(playst);
    }
}
