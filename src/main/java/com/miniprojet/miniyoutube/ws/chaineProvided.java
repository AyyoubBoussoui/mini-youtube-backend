package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.dao.ChaineDao;
import com.miniprojet.miniyoutube.service.ChaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("chaine-youtube/chaine")
public class chaineProvided {



    @GetMapping("/ref/{ref}")
    public Chaine findByRef(@PathVariable String ref) {
        return chaineService.findByRef(ref);
    }

    @DeleteMapping("/Id/{Id}")
    public int deleteByRef(@PathVariable String ref) {
        return chaineService.deleteByRef(ref);
    }
    @GetMapping("/")
    public List<Chaine> findAll() {
        return chaineService.findAll();
    }
    @GetMapping("/id/{id}")
    public Chaine getOne(@PathVariable Long aLong) {
        return chaineService.getOne(aLong);
    }
    @PostMapping("/")
    public int save(@RequestBody Chaine chaine) {
        return chaineService.save(chaine);
    }

    @Autowired
    private ChaineService chaineService;




}
