package com.example.sii_zadanie.Controller;


import com.example.sii_zadanie.User.User;
import com.example.sii_zadanie.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor

public class Controller {

    private UserService userService;


    @GetMapping("/users")
    public List<User> getUsers(){

        return userService.getUsers();

    }

    @PostMapping("/users")
    private void addUser(@RequestBody User user) throws FileNotFoundException {
        File plik= new File("powiadomienie.txt");
        PrintWriter zapis=new PrintWriter("powiadomienie.txt");
        Date data= new Date();
        zapis.println(data.toString());
        zapis.println(user.getEmail());
        zapis.println("Zostales poprawnie zapisany na prelekcje!");
        zapis.close();

        if ((userService.numberOfUsers(user.getIdPrelekcji()).size()) != 5 && user.getIdPrelekcji()>0 && user.getIdPrelekcji()<4)
                userService.addUser(user);



    }


    @DeleteMapping("users/{id}")
    public void deleteStudent(@PathVariable ("id") long id){

        userService.delete(id);
    }

    @GetMapping ("users/{login}")
    public List<User> findUser(@PathVariable String login){

        return userService.specificUser(login);
    }











}