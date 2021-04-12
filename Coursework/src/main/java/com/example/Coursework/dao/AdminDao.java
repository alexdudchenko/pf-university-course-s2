package com.example.Coursework.dao;

import com.example.Coursework.model.Admin;
import com.example.Coursework.model.CinemaSession;

public interface AdminDao extends AbstractDao<Admin> {

    Admin getByLogin(String login);

    //void addSession(CinemaSession cinemaSession, int Id);

    //void deleteSession(int Id);
}
