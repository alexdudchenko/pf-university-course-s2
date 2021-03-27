package com.example.Lab1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "marinaServlet", value = "/hello-from-marina-servlet")
public class HelloFromMarinaServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello from Marina!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html><title>Page</title><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<img src=\"https://i.imgur.com/QId1DpZ_d.webp?maxwidth=760&fidelity=grand\" alt = \"no image\"/><br>");
            out.println("<br><hr><a href=\"hello-from-sasha-servlet\">Sasha's Page</a>");
            out.println("<a href=\"hello-from-vanya-servlet\">Vanya's Page</a>");
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}
