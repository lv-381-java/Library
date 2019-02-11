package com.softserve.library.app.controller.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Map<String, String> messages = new HashMap<>();

        if (username == null || username.isEmpty()) {
            messages.put("username", "Please enter username");
        }

        if (password == null || password.isEmpty()) {
            messages.put("password", "Please enter password");
        }

        if (messages.isEmpty()) {

            //todo: search user in db !!!
            //User user = userService.find(username, password);

            /*if (user != null) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect(request.getContextPath() + "/home");
                return;
            } else {
                messages.put("login", "Unknown login, please try again");
            }*/
        }

        request.setAttribute("messages", messages);
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

}
