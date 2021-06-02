package com.example.sii_zadanie.Repository;



import com.example.sii_zadanie.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByLogin(String login);
    List<User> findByEmail(String email);
    List<User> findByIdPrelekcji(long id_prelekcji);




}

