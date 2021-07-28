package com.example.Lab4.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FilmDB {

    private final HashSet<Actor> listOfActors;
    private final HashSet<Film> listOfFilms;

    public FilmDB(HashSet<Actor> listOfActors, HashSet<Film> listOfFilms) {
        this.listOfActors = listOfActors;
        this.listOfFilms = listOfFilms;
    }

    public String isActorLoser() {
        boolean isLoser = false;
        for (Actor listOfActor : listOfActors) {
            if (listOfActor.getListOfFilms().isEmpty()) {
                isLoser = true;
                break;
            }
        }
        if (isLoser) {
            return ("Есть актеры, не сыгравшие ни в одном фильме \uD83D\uDE1E" + "\n");
        } else {
            return ("Нет актеров, не сыгравших ни в одном фильме" + "\n");
        }
    }

    public HashMap<Actor, HashSet<Actor>> getColleagueList() {
        HashMap<Actor, HashSet<Actor>> map = new HashMap<>();

        for (Actor actor : listOfActors) {
            HashSet<Actor> colleagueList = new HashSet<>();
            for (Film film: actor.getListOfFilms()) {
                colleagueList.addAll(film.getListOfActors());
            }
            colleagueList.remove(actor);
            map.put(actor, colleagueList);
        }
        return map;
    }

    public HashSet<Actor> getColleaguesOf(Actor actor) {
        HashMap<Actor, HashSet<Actor>> map = this.getColleagueList();
        HashSet<Actor> set = map.get(actor);
        return set;
    }


    public ArrayList<Film> getTheBiggestFilm() throws NoFilmsException {
        int countOfActors = 0;

        if (listOfFilms.size() == 0)
            throw new NoFilmsException("I'm sorry... There are no films!");

        for (Film f : listOfFilms) {
            if (countOfActors <= f.getListOfActors().size()) {
                countOfActors = f.getListOfActors().size();
            }
        }

        ArrayList<Film> films = new ArrayList<>();

        for (Film f : listOfFilms) {
            if (f.getListOfActors().size() == countOfActors) {
                films.add(f);
            }
        }
        return films;
    }
}