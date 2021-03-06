/* 주제 : Refresh 방법
 * => 클라이언트에게 콘텐츠 출력을 완료한 후, 다른 URL로 다시 요청하도록 만드는 방법
 * => 방법 1: HTTP 응답 헤더에 Refresh 정보 삽입.
 * => 방법 2: HTML <meta> 테그에 Refresh 정보 삽입.
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet25_page1")
public class Servlet25_page1 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  // HttpServlet에서 추가한 메서드 중에서 POST 요청에 대한 호출될 메서드를 오버라이딩 하자!
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int age = Integer.parseInt(request.getParameter("age"));

    if (age < 18) {
      response.setHeader("Refresh", "1;url=servlet24_page2");
    } else {
      response.setHeader("Refresh", "1;url=servlet24_page3");
    }
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Refresh 테스트</title>");
    out.println("</head>");
    out.println("<body>");

    if (age < 18) {
      out.printf("<meta http-equiv='Refresh' content='1;url=servlet24_page2>");
    } else {
      out.printf("<meta http-equiv='Refresh' content='1;url=servlet24_page3>");
    }

    out.println("</body>");
    out.println("</html>");

  }

}