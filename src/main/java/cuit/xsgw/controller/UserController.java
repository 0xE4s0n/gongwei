package cuit.xsgw.controller;

import cuit.xsgw.entity.User;
import cuit.xsgw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list_tnb")
    public List<User> TNBlist() {
        return userService.TNBlist();
    }

    @RequestMapping("/list_gxy")
    public List<User> GXYlist() {
        return userService.GXYlist();
    }

    @RequestMapping("/add")
    public int AddUser(User user) {
        return userService.AddUser(user);
    }

    @RequestMapping("/login{id}{password}")
    public int login(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {
        return userService.login(id,password);
    }
}