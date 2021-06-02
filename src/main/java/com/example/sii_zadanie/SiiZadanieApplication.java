package com.example.sii_zadanie;

import com.example.sii_zadanie.Conference.ConferenceInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SiiZadanieApplication {

    public static void main(String[] args) {


        List<ConferenceInfo> lista=new ArrayList<>(3);
        ConferenceInfo prelekcja1= new ConferenceInfo(1,"Prelekcja nr 1. Początek o godzinie 10:00, koniec o godzinie 11:45.");
        ConferenceInfo prelekcja2= new ConferenceInfo(2,"Prelekcja nr 2. Początek o godzinie 12:00, koniec o godzinie 13:45.");
        ConferenceInfo prelekcja3= new ConferenceInfo(3,"Prelekcja nr 3. Początek o godzinie 14:00, koniec o godzinie 15:45.");
        lista.add(prelekcja1);
        lista.add(prelekcja2);
        lista.add(prelekcja3);
        for(int i=0; i<lista.size(); i++){
            System.out.println("" +lista.get(i).getOpis() +" Id prelekcji: " +lista.get(i).getId());
        }


        SpringApplication.run(SiiZadanieApplication.class, args);

    }


}
