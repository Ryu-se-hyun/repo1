package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet34/p2")
public class Servlet34_p2 extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();

    request.setCharacterEncoding("UTF-8");
    session.setAttribute("name", request.getParameter("name")); 

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>p1</title></head>");
    out.println("<body>");
    out.println("<form action='p3' method='post'>");
    out.println("연세:<input type='text' name='age'><br>");
    out.println("<button>다음</button>");
    out.println("</form>");
    out.println("</body></html>");
  }  
}

