package servlet3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet30")
public class Servlet30 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ServletContext servletContext = this.getServletContext();
    servletContext.setAttribute("a1", "hello");
    
    request.setAttribute("r1", "world");
    
    RequestDispatcher rd = request.getRequestDispatcher("/servlet31");
    rd.forward(request, response);
  }  
}

