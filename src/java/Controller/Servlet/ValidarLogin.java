package Controller.Servlet;

import DAO.UserDAO;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ValidarLogin", urlPatterns = {"/ValidarLogin"})
public class ValidarLogin extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UserDAO usrd = new UserDAO();
        User usr = new User();
        
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        
        ArrayList<User> Lis = usrd.apresentarUser();
        
        for(int i=0; i<Lis.size(); i++){
            if(id.equalsIgnoreCase(Lis.get(i).getId()) && pass.equalsIgnoreCase(Lis.get(i).getPass())){
                response.sendRedirect("AcessoAutorizado.jsp");
            }
        }
        
        
    }

}
