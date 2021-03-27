package com.example;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "resultServlet", value = "/result-servlet")
public class ResultServlet extends HttpServlet {

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

            try (PrintWriter out = response.getWriter()) {
                ServletContext context = getServletContext();
                out.println("<!DOCTYPE html><head><title>Result</title></head><body>");
                out.printf("<p>The result of entered parameters is %s</p>", context.getAttribute("res"));
                if (Double.isNaN(ActionServlet.res)) {
                    out.println("<p>Please, check the parameter set and try again</p>");
                }
                out.println("<a href='index.jsp'>Go back</a>");
                out.printf("</body></html>");
            }
    }

    public void destroy() {
    }
}