package com.example;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "actionServlet", value = "/action-servlet")
public class ActionServlet extends HttpServlet {
    static double res;

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");
            String dParam = request.getParameter("d");

            Cookie cookie1 = new Cookie("ParA", request.getParameter("a"));
            Cookie cookie2 = new Cookie("ParB", request.getParameter("b"));
            Cookie cookie3 = new Cookie("ParC", request.getParameter("c"));
            Cookie cookie4 = new Cookie("ParD", request.getParameter("d"));

            cookie1.setMaxAge(172800);
            cookie2.setMaxAge(172800);
            cookie3.setMaxAge(172800);
            cookie4.setMaxAge(172800);

            double a = Double.parseDouble(aParam);
            double b = Double.parseDouble(bParam);
            double c = Double.parseDouble(cParam);
            double d = Double.parseDouble(dParam);

            res = BusinessLogic.evaluate(a, b, c, d);

            ServletContext context = getServletContext();
            context.setAttribute("res", String.format("%.3f", res));

            response.addCookie(cookie1);
            response.addCookie(cookie2);
            response.addCookie(cookie3);
            response.addCookie(cookie4);

            response.sendRedirect("result-servlet");
        } catch (Exception e) {
            response.sendRedirect("Error.html");
        }
    }

    public void destroy() {
    }
}