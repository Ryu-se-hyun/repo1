package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet24_page1")
public class Servlet24_page1 extends HttpServlet{

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    int age = Integer.parseInt(request.getParameter("age"));

    if (age < 18) {
      response.setHeader("Refresh", "1;url=servlet24_page2");
    } else {
      response.setHeader("Refresh", "1;url=servlet24_page3");
    }

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Refresh 테스트</title>");
    out.println("</head>");
    out.println("<body>");
    
    if (age < 19) {
      out.println("미성년입니다.");
    } else {
      out.println("성년입니다.");
    }
    
    out.println("</body>");
    out.println("</html>");

  }  
}