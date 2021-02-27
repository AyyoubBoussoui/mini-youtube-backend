package com.miniprojet.miniyoutube.service;

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

   /* public Video getOne(Long id) {
        return videoDao.getOne(id);
    }*/

   /* public int addVidToPlyLst(Video vid){
        if(vid.getRefPlayList()!=null){
        return -1;}
        else {
            return 1;
        }
    }*/
    public int save(Video vid) {
        if (findByRef(vid.getRef())!=null){return -1;}
       else{videoDao.save(vid);
        return 1; }
    }

}
