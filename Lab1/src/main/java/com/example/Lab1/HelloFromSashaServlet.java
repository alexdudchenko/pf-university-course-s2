package com.example.Lab1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "sashaServlet", value = "/hello-from-sasha-servlet")
public class HelloFromSashaServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello from Sasha!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html><title>Page</title><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<img src=\"https://i.imgur.com/TbjpuK2_d.webp?maxwidth=1520&fidelity=grand\" width=35% alt = \"no image\"/><br>");
            out.println("<br><hr><a href=\"hello-from-marina-servlet\">Marina's Page</a>");
            out.println("<a href=\"hello-from-vanya-servlet\">Vanya's Page</a>");
            out.println("</body></html>");
        }
    }

    public void destroy() {
    }
}