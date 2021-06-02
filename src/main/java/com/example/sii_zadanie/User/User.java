package com.example.sii_zadanie.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String email;
    private String sciezka;
    private long idPrelekcji;

    public long getIdPrelekcji() {
        return idPrelekcji;
    }

    public void setIdPrelekcji(long idPrelekcji) {
        this.idPrelekcji = idPrelekcji;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSciezka() {
        return sciezka;
    }

    public void setSciezka(String sciezka) {
        this.sciezka = sciezka;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User (String login, String email, String sciezka, long idPrelekcji){
        this.login=login;
        this.email=email;
        this.sciezka=sciezka;
        this.idPrelekcji=idPrelekcji;
    }


}
