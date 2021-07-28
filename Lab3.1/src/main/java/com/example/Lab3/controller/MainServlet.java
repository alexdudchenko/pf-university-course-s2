package com.example.Lab3.controller;

import com.example.Lab3.model.Calculation;
import com.example.Lab3.model.ResultDataRow;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "mainServlet", value = "/main-servlet")
public class MainServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            ParamData paramData = new ParamParser().parseParameters(request);
            ArrayList<ResultDataRow> resultDataRows = new Calculation().calculate(paramData);

            request.setAttribute("result", resultDataRows);
            request.setAttribute("input", paramData);
            request.getRequestDispatcher("WEB-INF/jsp/result.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("WEB-INF/jsp/error.jsp").forward(request, response);
        }
    }
}