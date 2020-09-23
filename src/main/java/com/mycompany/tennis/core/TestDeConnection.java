package com.mycompany.tennis.core;


import com.mycompany.tennis.core.entity.*;
import com.mycompany.tennis.core.repository.JoueurRepositoryImpl;
import com.mycompany.tennis.core.repository.TournoiRepositoryImpl;
import com.mycompany.tennis.core.service.JoueurService;
import com.mycompany.tennis.core.service.MatchService;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.ArrayList;
import java.util.List;

public class TestDeConnection {
    public static void main(String... args) {
        JoueurService joueurService = new JoueurService();
        Joueur bartoli = joueurService.getJoueur(21L);
        System.out.println(bartoli.getPrenom() + " " + bartoli.getNom());


/*        Joueur noah=new Joueur();
        noah.setNom("Noah");
        noah.setPrenom("Yannick");
        noah.setSexe('H');
        joueurService.createJoueur(noah);
        System.out.println("Id du joueur : "+noah.getId());*/

/*        TournoiRepositoryImpl tournoiRepository=new TournoiRepositoryImpl();
        List<Tournoi> tournois= tournoiRepository.list();
        for (Tournoi tournoi: tournois) {
            System.out.println(tournoi.getId()+" "+tournoi.getNom()+" "+tournoi.getCode());
        }*/

//        TournoiService tournoiService = new TournoiService();
////        Tournoi doha=new Tournoi();
////        doha.setNom("DOHA");
////        doha.setCode("DO");
////        tournoiService.createTournoi(doha);
//        Tournoi doha = tournoiService.getTournoi(5L);
//        System.out.println(doha.getNom()+" "+doha.getCode());

        MatchService matchService = new MatchService();
        Match match = new Match();
        Score score = new Score();
        score.setSet1((byte) 3);
        score.setSet2((byte) 4);
        score.setSet3((byte) 6);
        match.setScore(score);
        score.setMatch(match);
        Joueur federer = new Joueur();
        federer.setId(32L);
        Joueur murray = new Joueur();
        murray.setId(34L);
        match.setVainqueur(federer);
        match.setFinaliste(murray);
        Epreuve epreuve=new Epreuve();
        epreuve.setId(10L);
        match.setEpreuve(epreuve);

        matchService.enregitrerNouveauMatch(match);
//        Tournoi doha = tournoiService.getTournoi(5L);
        System.out.println("Id du match : " + match.getId());


    }
}

