package Controller.Servlet;

import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        UserDAO usrd = new UserDAO();
        User us = new User();
        
        us.setId(request.getParameter("id"));
        us.setPass(request.getParameter("pass"));
        
        usrd.adicionarUser(us);
        
        response.sendRedirect("index.jsp");
        
    }

}
