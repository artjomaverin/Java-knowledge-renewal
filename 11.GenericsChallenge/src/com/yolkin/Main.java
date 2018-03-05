package com.yolkin;

import java.util.Collections;

/**
 * Created by Admin on 23.01.2018.
 */
public class Main {
    public static void main(String[] args) {
        VolleyballPlayer alicja = new VolleyballPlayer("Alicja", "29");
        VolleyballPlayer anna = new VolleyballPlayer("Anna", "26");
        VolleyballPlayer alina = new VolleyballPlayer("Alina", "21");
        VolleyballPlayer lara = new VolleyballPlayer("Lara", "29");
        VolleyballPlayer kate = new VolleyballPlayer("Kate", "29");
        VolleyballPlayer sveta = new VolleyballPlayer("Sveta", "29");
        VolleyballPlayer oksana = new VolleyballPlayer("Oksana", "29");

        FootballPlayer ruslan = new FootballPlayer("Ruslan", "33");

        Team<VolleyballPlayer> albatros = new Team<>("Albatros");
        albatros.addPlayer(alicja);
        Team<VolleyballPlayer> bnb = new Team<>("BNB");
        bnb.addPlayer(anna);
        Team<VolleyballPlayer> kva = new Team<>("KVA");
        kva.addPlayer(alina);
        Team<VolleyballPlayer> deSpuyt = new Team<>("De Spuyt");
        deSpuyt.addPlayer(lara);
        Team<VolleyballPlayer> pijp = new Team<>("Pijp");
        pijp.addPlayer(kate);
        Team<VolleyballPlayer> volamos = new Team<>("Volamos");
        volamos.addPlayer(sveta);
        Team<VolleyballPlayer> oven = new Team<>("Oven");
        oven.addPlayer(oksana);

        Team<FootballPlayer> broken = new Team<>("Broken");
        broken.addPlayer(ruslan);

        League<Team<VolleyballPlayer>> fourthClass = new League("4th class");
        fourthClass.addTeam(albatros);
        fourthClass.addTeam(bnb);
        //fourthClass.addTeam(broken);
        fourthClass.addTeam(kva);
        fourthClass.addTeam(deSpuyt);
        fourthClass.addTeam(deSpuyt);
        fourthClass.addTeam(pijp);
        fourthClass.addTeam(volamos);
        fourthClass.addTeam(oven);
        //fourthClass.addTeam(broken);

        albatros.matchResult(bnb, 14, 25);
        albatros.matchResult(kva, 8, 25);
        albatros.matchResult(deSpuyt, 27, 25);
        albatros.matchResult(pijp, 25, 13);
        albatros.matchResult(volamos, 25, 21);
        albatros.matchResult(oven, 29, 27);
        bnb.matchResult(kva, 11, 25);
        bnb.matchResult(deSpuyt, 3, 25);
        bnb.matchResult(pijp, 27, 25);
        bnb.matchResult(volamos, 25, 18);
        bnb.matchResult(oven, 23, 25);
        kva.matchResult(deSpuyt, 25, 18);
        kva.matchResult(pijp, 25, 13);
        kva.matchResult(volamos, 11, 25);
        kva.matchResult(oven, 21, 25);
        deSpuyt.matchResult(pijp, 25, 23);
        deSpuyt.matchResult(volamos, 9, 25);
        deSpuyt.matchResult(oven, 25, 17);
        pijp.matchResult(volamos, 20, 25);
        pijp.matchResult(oven, 25, 22);
        volamos.matchResult(oven, 25, 19);

        Collections.sort(fourthClass.getTeamList());

        System.out.println("");

        for(int i = 0; i<fourthClass.getTeamList().size(); i++) {
            System.out.println("com.yolkin.Team " + fourthClass.getTeamList().get(i).getName() + " has rank " + fourthClass.getTeamList().get(i).getRank());
        }

        for(Team t : fourthClass.getTeamList()) {
            System.out.println(t.getName() + " : " + t.getRank());
        }





























    }
}
