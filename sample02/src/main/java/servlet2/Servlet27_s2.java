
package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet27/s2")
public class Servlet27_s2 extends HttpServlet { 

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    PrintWriter out = response.getWriter();
    out.println("두 번째 서블릿 : Servlet27_s2......");

    RequestDispatcher rd = request.getRequestDispatcher("/servlet27/s3");

    rd.forward(request, response);
  }
}