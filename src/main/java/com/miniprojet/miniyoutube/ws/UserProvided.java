package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.Chaine;
import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping(value = "user-youtube/user")
public class UserProvided {

    @PostMapping("/")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/ref/{ref}")
    public User findByRef(@PathVariable String ref) {
        return userService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return userService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }


    @PutMapping("/")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @GetMapping("/login/{login}")
    public User findByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }

@GetMapping("/login/{login}/password/{password}")
    public int connecter(@PathVariable String login, @PathVariable String password) {
        return userService.connecter(login, password);
    }

    @Autowired
    private UserService userService;


}
