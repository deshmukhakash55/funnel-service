package com.xperphile.funnelservice.controller;

import com.xperphile.funnelservice.model.User;
import com.xperphile.funnelservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }

    @RequestMapping(value = "/current_user", method = RequestMethod.POST)
    public ResponseEntity getCurrentUser(Principal principal){
        Map<String, String> map = Collections.singletonMap("username", "" + principal.getName());
        ResponseEntity responseEntity = new ResponseEntity(map, HttpStatus.ACCEPTED);
        return responseEntity;
    }

}
