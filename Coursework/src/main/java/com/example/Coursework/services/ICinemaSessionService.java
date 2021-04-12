package com.example.Coursework.services;

import com.example.Coursework.model.CinemaSession;
import com.example.Coursework.model.Place;

import java.util.Collection;

public interface ICinemaSessionService {

    Collection<CinemaSession> getAllCinemaSessions();

    CinemaSession getCinemaSessionById(int id);

    //Collection<CinemaSession> getCinemaSessionByFilm(String title);

    void book(CinemaSession cinemaSession, int place);

    void cancelPlace(CinemaSession cinemaSession, int place);

    Collection<Place> getPlaces(CinemaSession session);

    void removeSession(int id);

    void createSession(CinemaSession cinemaSession);

    void update(CinemaSession cinemaSession);

    void checkBooking(String[] places, CinemaSession cinemaSession);
}
