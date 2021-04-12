package com.example.Coursework.services;

import com.example.Coursework.model.CinemaSession;

public interface IValidator {
    void validatePlaces(String[] places, ICinemaSessionService cinemaSessionService, CinemaSession cinemaSession);

    void validateAdminForm(String idString, String durationString, String priceString, String[] places);

    void validateAdminFormCreate(String idString, String durationString, String priceString);

    void validateLogin(String login);

}
