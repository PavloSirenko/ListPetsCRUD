package com.psi.common;

import com.psi.dao.ListDB;
import com.psi.service.Pet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MainServlet", urlPatterns = {"/index"})
public class MainServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Pet> names = ListDB.list();

            request.setAttribute("petNames", names);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/client/notfound.jsp").forward(request, response);
        }
    }
}
