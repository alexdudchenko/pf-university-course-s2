package com.example.Lab4.controllers;

import com.example.Lab4.model.FilmDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import static com.example.Lab4.service.TestService.*;

@WebServlet(name = "FrontController", value = "/FrontController")
public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FilmDB filmDB = createTestBD();

        getServletContext().setAttribute("DB", filmDB);

        String param = request.getParameter("a");


        if (param != null) {
            switch (param) {
                case "1": request.getRequestDispatcher("/FirstController").forward(request, response); break;
                case "2": request.getRequestDispatcher("/WEB-INF/jsp/enterActorPage.jsp").forward(request, response); break;
                case "3": request.getRequestDispatcher("/ThirdController").forward(request, response); break;
                default: request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

}
