package com.example.Lab4.controllers;

import com.example.Lab4.model.Actor;
import com.example.Lab4.model.FilmDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;

@WebServlet(name = "SecondController", value = "/SecondController")
public class SecondController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilmDB filmDB = (FilmDB) getServletContext().getAttribute("DB");
        Actor actor = new Actor(request.getParameter("name").trim());

        HashSet<Actor> result = filmDB.getColleaguesOf(actor);

        request.setAttribute("result", result);
        request.setAttribute("req", request.getParameter("name"));

        request.getRequestDispatcher("/WEB-INF/jsp/result2.jsp").forward(request, response);
    }
}
