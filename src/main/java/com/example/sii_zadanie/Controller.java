package com.example.sii_zadanie;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

        userService.addUser(user);

    }


    @DeleteMapping("users/{id}")
    public void deleteStudent(@PathVariable ("id") long id){

        userService.delete(id);
    }








}