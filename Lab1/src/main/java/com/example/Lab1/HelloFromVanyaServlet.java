package com.example.Lab1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "vanyaServlet", value = "/hello-from-vanya-servlet")
public class HelloFromVanyaServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello from Vanya!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html><title>Page</title><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<img src=\"https://i.imgur.com/Gdic47L_d.webp?maxwidth=760&fidelity=grand\" alt = \"no img\"/><br>");
            out.println("<br><hr><a href=\"hello-from-marina-servlet\">Marina's Page</a>");
            out.println("<a href=\"hello-from-sasha-servlet\">Sasha's Page</a>");
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}
