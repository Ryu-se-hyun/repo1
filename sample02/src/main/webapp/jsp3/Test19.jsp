<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>


<%
ArrayList<String> names = new ArrayList<String>();
names.add("홍길동");
names.add("임꺽정");
names.add("유관순");
names.add("안중근");

pageContext.setAttribute("names", names);
%>



(* 달러 기호 앞에 역슬래시가 붙으면 EL 명령으로 해석하지 않는다.)
\${names}: ${names}
\${names[1]} : ${names[1]}
