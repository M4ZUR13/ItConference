package com.example.sii_zadanie.Service;

import com.example.sii_zadanie.Repository.UserRepository;
import com.example.sii_zadanie.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

   public void delete(long id){

        repository.deleteById(id);
    }

    public List<User> specificUser(String login){

        return repository.findByLogin(login);

    }


    public List<User> numberOfUsers(long idPre){
        return repository.findByIdPrelekcji(idPre);
    }











}
