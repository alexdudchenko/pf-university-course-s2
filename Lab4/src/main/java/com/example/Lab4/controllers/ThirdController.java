package com.example.Lab4.controllers;

import com.example.Lab4.model.Film;
import com.example.Lab4.model.FilmDB;
import com.example.Lab4.model.NoFilmsException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ThirdController", value = "/ThirdController")
public class ThirdController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        FilmDB filmDB = (FilmDB) getServletContext().getAttribute("DB");

        ArrayList<Film> result;

        try {
            result = filmDB.getTheBiggestFilm();
            request.setAttribute("result", result);

            request.getRequestDispatcher("/WEB-INF/jsp/result3.jsp").forward(request, response);
        } catch (NoFilmsException e) {
            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
            e.printStackTrace();
        }


    }
}
