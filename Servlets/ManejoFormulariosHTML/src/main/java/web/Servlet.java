package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;chartset-UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");
        
        out.print("<html><head><title>ResultadoServlet</title><body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'");
        out.print("<tr><td>Usuario</td><td>"+ usuario +"</td></tr>");
        out.print("<tr><td>Password</td><td>"+ password +"</td></tr>");
        
        out.print("<tr><td>Tecnologías</td><td>");
        for(String tecnologia: tecnologias){
            out.print(tecnologia + " / ");
        }
        out.print("</td></tr>");

        out.print("<tr><td>Género</td><td>"+ genero +"</td></tr>");
        out.print("<tr><td>Ocupación</td><td>"+ ocupacion +"</td></tr>");
        
        for(String musicas: musica){
            out.print("<tr><td>Música</td><td>"+ musicas + " / " +"</td></tr>");
        }
        
        out.print("<tr><td>Comentario</td><td>"+ comentario +"</td></tr>");
        out.print("</table></body></head></html>");
    }
}
