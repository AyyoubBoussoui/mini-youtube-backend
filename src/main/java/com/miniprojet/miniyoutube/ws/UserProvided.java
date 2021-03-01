package com.miniprojet.miniyoutube.ws;

import com.miniprojet.miniyoutube.bean.User;
import com.miniprojet.miniyoutube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="user-youtube/User")
public class UserProvided {
    @PostMapping("/")
    public int save(@RequestBody User user) {
        return userService.save(user);
    }
    @GetMapping("/Id/{Id}")
    public User findById(@PathVariable Long Id) {
        return userService.findById(Id);
    }
    @GetMapping("/chaine/Id/{Id}")
    public List<User> findByChaineId(@PathVariable Long Id) {
        return userService.findByChaineId(Id);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @Autowired
    private UserService userService;


}