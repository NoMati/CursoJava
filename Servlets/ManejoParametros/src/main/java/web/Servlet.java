package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // Leer los parametros del formulario HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        out.print("El parametro usuario es: " + usuario + "<br/>");
        out.print("El parametro password es: " + password);
        out.print("<body/><html/>");
        out.close();
    }
}
