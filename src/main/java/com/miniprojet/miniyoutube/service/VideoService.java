package com.miniprojet.miniyoutube.service;

import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.bean.Video;
import com.miniprojet.miniyoutube.dao.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoDao videoDao;
    @Autowired
    private PlayListeService playListeService;
    public Video findByRef(String ref) {
        return videoDao.findByRef(ref);
    }
    @Transactional
    public int deleteByRef(String ref) {
        videoDao.deleteByRef(ref);
        return 1;
    }


    public List<Video> findAll() {
        return videoDao.findAll();
    }

   /*public Video getOne(Long id) {
        return videoDao.getOne(id);
    }*/

    public int addVidToPlyLst(Video vid){
        if(vid.getRef() == null){
        return -1;}
        PlayListe plylst=playListeService.findByRef(vid.getPlayListe().getRef());
        vid.setPlayListe(plylst);
        if (plylst==null){
           // PlayListe plsL=new PlayListe();
            return -2;
        }
        else {
            playListeService.update(plylst);
            return 1;
        }
    }
    public int save(Video vid) {
        if (findByRef(vid.getRef())!=null){
            return -1;}
        if((vid.getDislikes()+vid.getLikes())>vid.getTotalVue()){return -2;}
        else if (vid.getRef().startsWith("ref")){
        videoDao.save(vid);
        return 1;
        }
        else{return -3;}
    }
  public int update(Video vide){
        if (findByRef(vide.getRef())!=null){
         /*  String ref=vide.getRef();
          int i= videoDao.deleteByRef(ref);*/
        videoDao.save(vide);
        return 1;}
        else{videoDao.save(vide);
        return 2;}
    }

    public List<Video> findByPlayListeRef(String ref) {
        return videoDao.findByPlayListeRef(ref);
    }

    public int deleteByPlayListeRef(String ref) {
        return videoDao.deleteByPlayListeRef(ref);
    }
}