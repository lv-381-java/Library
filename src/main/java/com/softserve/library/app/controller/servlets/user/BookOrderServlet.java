package com.softserve.library.app.controller.servlets.user;

import com.softserve.library.app.enums.patterns.UserJSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 *
 * @author Roman Berezhnov
 */
@WebServlet("/library/book_order")
public class BookOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher(UserJSP.BOOK_ORDER.getPattern());
        dispatcher.forward(req, resp);
    }
}
