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
public class ChaineProvided {

    @GetMapping("/ref/{ref}")
    public Chaine findByRef(@PathVariable String ref) {
        return chaineService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return chaineService.deleteByRef(ref);
    }
    @GetMapping("/UserId/Id/{id}")
    public List<Chaine> findByUserId(@PathVariable Long Id) {
        return chaineService.findByUserId(Id);
    }
    @GetMapping("/")
    public List<Chaine> findAll() {
        return chaineService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Chaine chaine) {
        return chaineService.save(chaine);
    }


    @Autowired
    private ChaineService chaineService;




}
