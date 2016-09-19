package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet21")
public class Servlet21 extends HttpGenericServlet{

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    System.out.println("service(HttpServletRequest,HttpServletResponse)");
    
    // HttpServletRequest httpRequest = (HttpServletRequest)request;
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("HTTP 요청 방법: %s\n", request.getMethod());
    
  }  
}
