package com.yolkin;

import java.util.ArrayList;

/**
 * Created by Admin on 23.01.2018.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int rank;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int scored = 0;
    private ArrayList<T> playerList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if(playerList.contains(player)) {
            return false;
        } else {
            System.out.println("com.yolkin.Player " + player.getName() + " added to team " + this.name);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        played++;
        if(ourScore > theirScore) {
            won++;
            scored += ourScore;
            message = " won against ";
        } else if (ourScore < theirScore) {
            lost++;
            scored += ourScore;
            message = " lost to ";
        } else {
            message = " has to play further against ";
        }
        this.rank += won*25 + scored;
        System.out.println(this.name + " rank is now " + rank);
        if(opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getRank() > team.getRank()) {
            return -1;
        } else if(team.getRank() < team.getRank()) {
            return 1;
        } else {
            return 0;
        }
    }



    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getScored() {
        return scored;
    }

    public ArrayList<T> getPlayerList() {
        return playerList;
    }
}
