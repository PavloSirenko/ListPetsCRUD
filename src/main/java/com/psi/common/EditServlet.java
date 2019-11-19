package com.psi.common;

import com.psi.dao.ListDB;
import com.psi.service.Pet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditServlet", urlPatterns = {"/edit"})
public class EditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String type = request.getParameter("type");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            ListDB.update(id, new Pet(type, name, age));

            response.sendRedirect(request.getContextPath() + "/index");
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/client/notfound.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            ListDB petList = ListDB.getInstance();
            Pet pet = petList.getPet(id);

            request.setAttribute("pet", pet);
            getServletContext().getRequestDispatcher("/client/edit.jsp").forward(request, response);
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/client/notfound.jsp").forward(request, response);
        }
    }
}
