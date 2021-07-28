package com.example.Lab4.controllers;

import com.example.Lab4.model.FilmDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FirstController", value = "/FirstController")
public class FirstController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FilmDB filmDB = (FilmDB) getServletContext().getAttribute("DB");

        String result = filmDB.isActorLoser();

        request.setAttribute("result", result);

        request.getRequestDispatcher("/WEB-INF/jsp/result1.jsp").forward(request, response);
    }
}
