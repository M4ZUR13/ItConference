package com.example.sii_zadanie;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public List<User> getUsers(){

        return repository.findAll();
    }

    public void addUser(User user){


        repository.save(user);
    }

    public void updateUser(User user, String newEmail){

        user.setEmail(newEmail);
        repository.save(user);
    }

    public void delete(long id){

        repository.deleteById(id);
    }







}
