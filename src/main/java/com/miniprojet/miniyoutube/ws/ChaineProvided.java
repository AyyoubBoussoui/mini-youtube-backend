package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.dao.ChaineDao;
import com.miniprojet.miniyoutube.service.ChaineService;
import com.miniprojet.miniyoutube.vo.ChaineVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
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

    @GetMapping("/user-ref/ref/{ref}")
    public List<Chaine> findByUserRef(@PathVariable String ref) {
        return chaineService.findByUserRef(ref);
    }

    @GetMapping("/")
    public List<Chaine> findAll() {
        return chaineService.findAll();
    }


    @PutMapping("/")
    public void update(@RequestBody Chaine chaine) {
        chaineService.update(chaine);
    }
    @DeleteMapping("/user-ref/ref/{ref}")
    public int deleteByUserRef(@PathVariable String ref) {
        return chaineService.deleteByUserRef(ref);
    }

    @PostMapping("/search")
    public List<ChaineVo> SerchByNombreDabonne(@RequestBody ChaineVo chaineVo) {
        return chaineService.SerchByNombreDabonne(chaineVo);
    }

    @Autowired
    private ChaineService chaineService;


}
