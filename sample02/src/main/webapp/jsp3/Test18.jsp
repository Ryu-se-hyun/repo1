<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>


<%
pageContext.setAttribute("names", new String[]{"홍길동","임꺽정","유관순","안중근"});
%>



(* 달러 기호 앞에 역슬래시가 붙으면 EL 명령으로 해석하지 않는다.)
\${names}: ${names}
\${names[2]} : ${names[2]}
