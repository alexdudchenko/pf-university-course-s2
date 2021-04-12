package com.example.Coursework.services;

import com.example.Coursework.model.Admin;

public interface IAdminService {

    Admin getByLogin(String login);

    // Admin getById(String id);

    boolean checkPassword(Admin admin, String password);
}
