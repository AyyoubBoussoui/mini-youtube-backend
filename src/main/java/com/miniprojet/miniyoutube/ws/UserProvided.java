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
    @GetMapping("/Login/{login}")
    public User findByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }
    @DeleteMapping("/Login/{login}")
    public int deleteByLogin(@PathVariable String login) {
        return userService.deleteByLogin(login);
    }
    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }


    @Autowired
    private UserService userService;


}
