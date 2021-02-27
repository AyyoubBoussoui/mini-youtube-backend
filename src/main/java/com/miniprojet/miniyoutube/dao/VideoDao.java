package com.miniprojet.miniyoutube.dao;


import com.miniprojet.miniyoutube.bean.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoDao extends JpaRepository<Video,Long> {

    Video findByRef(String ref);
    int deleteByRef(String ref);
   // Video getOne(Long id);
}
