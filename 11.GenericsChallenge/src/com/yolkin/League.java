package com.yolkin;

import java.util.ArrayList;

/**
 * Created by Admin on 23.01.2018.
 */
public class League<L extends Team> {

    private String name;
    private ArrayList<L> teamList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<L> getTeamList() {
        return teamList;
    }

    public League(String name) {

        this.name = name;
    }

    public ArrayList<L> addTeam(L team){
        if(teamList.contains(team)) {
            System.out.println("com.yolkin.Team " + team.getName() + " is already in the league");
        } else {
            System.out.println("com.yolkin.Team " + team.getName() + " was added to league " + this.getName());
            teamList.add(team);
        }
        return teamList;
    }

//    public ArrayList<L> sortTeamlist() {
 //       Collections.sort(this.teamList);
  //      return this.teamList;
    // }
}
