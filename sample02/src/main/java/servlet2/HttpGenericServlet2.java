package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpGenericServlet2 extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    System.out.println("service(ServletRequest,ServletResponse)");

    HttpServletRequest httpRequest = (HttpServletRequest)request;
    HttpServletResponse httpResponse = (HttpServletResponse)response;

    service(httpRequest, httpResponse);
  }

  protected void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    switch (request.getMethod()) {
    case "GET": doGet(request,response); break;
    case "POST": doPost(request,response); break;
    case "HEAD": doHead(request,response); break;
    case "TRACE": doTrace(request,response); break;
    case "DELETE": doDelete(request,response); break;
    case "PUT": doPut(request,response); break;
    default:
      doDefault(request, response);    
    }
  }

  private void doDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>오류!</title></head>");
    out.println("<body>");
    out.println("<h1>오류!</h1>");
    out.println("<p>요구하신 HTTP 요청 메서드를 지원하지 않습니다</p>");
    out.println("</body></html>");
  }

  protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);    
  }

  protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);
  }

  protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);
  }

  protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doDefault(request, response);
  }
}
