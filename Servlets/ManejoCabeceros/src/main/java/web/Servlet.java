package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html><head><title>Headers HTTP</title></head>");
        out.print("<body><h1>Headers HTTP</h1>");
        out.print("Metodo HTTP: " + metodoHttp );
        String uri = request.getRequestURI();
        out.print("</br>URI solicitada: " + uri );
        
        //imprimimos todos los cabeceros disponibles
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = cabeceros.nextElement().toString();
            out.print("<b>" + nombreCabecero + "</b>: "); 
            out.print(request.getHeader(nombreCabecero));
            out.print("</br>");
        }
        
        out.print("</body></head></html>");
        
    }
}
