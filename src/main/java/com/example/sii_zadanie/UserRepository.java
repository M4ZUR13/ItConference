package com.example.sii_zadanie;



import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByLogin(String login);
    

}

