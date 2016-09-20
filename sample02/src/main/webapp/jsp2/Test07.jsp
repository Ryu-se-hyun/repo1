<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%-- 객체를 생성해주는 태그
id : 객체의 레퍼런스 이름
class : 객체를 생성할 때 사용할 전체 클래스명(패키지명 포함; Fully-qualified class name; FQName; QName)
 --%>
<jsp:useBean id="board" class="vo.Board"></jsp:useBean>

<jsp:useBean id="board2" class="vo.Board">
  <jsp:setProperty name="board2" property="no" value="1"/>
  <jsp:setProperty name="board2" property="title" value="하하하"/>
  <jsp:setProperty name="board2" property="contents" value="내용입니다"/>
  <jsp:setProperty name="board2" property="viewCount" value="100"/>
</jsp:useBean>


<jsp:useBean id="board3" class="vo.Board"></jsp:useBean>
  <jsp:setProperty name="board3" property="no" value="2"/>
  <jsp:setProperty name="board3" property="title" value="하하하2"/>
  <jsp:setProperty name="board3" property="contents" value="내용입니다2"/>
  <jsp:setProperty name="board3" property="viewCount" value="200"/>

board: <%=board%>
board2: <%=board2%>
board3: <%=board3%>
