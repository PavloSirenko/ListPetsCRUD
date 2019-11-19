package com.psi.common;

import com.psi.dao.ListDB;
import com.psi.service.Pet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateServlet", urlPatterns = {"/create"})
public class CreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String type = request.getParameter("type");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            Pet pet = new Pet(type, name, age);
            ListDB.add(pet);

            request.setAttribute("petName", name);
            doGet(request, response);
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/client/notfound.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/client/create.jsp").forward(request, response);
    }
}
