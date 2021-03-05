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
    private PlayListedao pld;
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
    	
         pld.save(playliste);
        return 1;}
    } 
    
    

	public List<PlayListe> findByChaineRef(String ref) {
		return pld.findByChaineRef(ref);
	}

	public int deleteByChaineRef(String ref) {
		return pld.deleteByChaineRef(ref);}
		


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
