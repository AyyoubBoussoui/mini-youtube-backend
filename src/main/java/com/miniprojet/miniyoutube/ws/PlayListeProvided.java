package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.PlayListe;
import com.miniprojet.miniyoutube.service.PlayListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.transaction.Transactional;

@RestController
@RequestMapping("application/PlayListe")
public class PlayListeProvided {
	  @Autowired
	    private PlayListeService pls ;
	    
	    
	    
	    public void update(PlayListe playst) {
			pls.update(playst);
		}
	@GetMapping("/chaine/reference/{reference}")
		public List<PlayListe> findByChaineRef(@PathVariable String ref) {
			return pls.findByChaineRef(ref);
		}
	@Transactional @DeleteMapping("/ref/{ref}")
		public int deleteByChaineRef(@PathVariable String ref) {
			return pls.deleteByChaineRef(ref);
		}

		@GetMapping("/ref/{ref}")
	    public PlayListe findByRef(@PathVariable String ref) {
	        return pls.findByRef(ref);
	    }
	@PostMapping("/")
	    public int save(@RequestBody PlayListe playliste) {
	         pls.save(playliste);
	    return 1;
	    }

	    @Transactional @DeleteMapping("/ref/{ref}")
	    public int deleteByRef(@PathVariable String ref) {
	        return pls.deleteByRef(ref);
	    }
	}
