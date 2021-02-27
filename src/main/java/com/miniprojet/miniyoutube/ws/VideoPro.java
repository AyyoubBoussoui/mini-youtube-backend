package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.Video;
import com.miniprojet.miniyoutube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("gestion-video/video")
public class VideoPro {
    @Autowired
    private VideoService videoservice;

    @GetMapping("/ref/{ref}")
    public Video findByRef(@PathVariable String ref) {
        return videoservice.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
         videoservice.deleteByRef(ref);
        return 1;
    }

    @GetMapping("/")
    public List<Video> findAll() {
        return videoservice.findAll();
    }

    @GetMapping("/id/{id}")
    public Video getOne(@PathVariable Long id) {
        return videoservice.getOne(id);
    }

    @PostMapping("/")
    public int save(@RequestBody Video vid) {
        return videoservice.save(vid);
    }


}
