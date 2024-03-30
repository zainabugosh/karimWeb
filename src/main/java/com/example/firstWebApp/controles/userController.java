package com.example.firstWebApp.controles;

import com.example.firstWebApp.entities.user;
import com.example.firstWebApp.services.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class userController {

    @Autowired
    private userServices userServices;
    @PostMapping("/users/addUser")
    public @ResponseBody user addUser(@RequestBody user u)
    {
        return userServices.addUser(u);
    }

    @GetMapping("/users/getAll")
    public @ResponseBody ArrayList<user> getAll()
    {
        return userServices.getAll();
    }

    @GetMapping("/user/findUserId/{id}")
    public @ResponseBody Optional<user> findUserById(@PathVariable Long id)
    {
        return userServices.findUserById(id);
    }

    @GetMapping("/user/{email}/{password}")
    public Optional<user> login(@RequestParam String email, @RequestParam String password) {
        // Call the login method from userServices
        return Optional.of(Optional.ofNullable(userServices.login(email, password)).orElseThrow());
        /*
        // Check if the user is not null
        if (user != null) {
            // Return OK response with the user object
            return ResponseEntity.ok(user);
        } else {
            // Return bad request response
            return ResponseEntity.badRequest().build();
        }*/
    }

}
