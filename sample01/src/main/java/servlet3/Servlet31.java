package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ServletContext servletContext = this.getServletContext();
    String a1 = (String)servletContext.getAttribute("a1");
    
    String r1 = (String)request.getAttribute("r1");
    
    response.setContentType("text/plain);charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("a1=%s\n", a1);
    out.printf("r1=%s\n", r1);
    
  }  
}

