package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.service.PlayListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("application/PlayListe")
public class PlayListeProvided {
    @Autowired
    private PlayListeService pls ;
    @GetMapping("/ref/{ref}")
    public PlayListe findByRef(@PathVariable String ref) {
        return pls.findByRef(ref);
    }

    public int save(PlayListe playliste) {
         pls.save(playliste);
    return 1;
    }

    @Transactional @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return pls.deleteByRef(ref);
    }
}
