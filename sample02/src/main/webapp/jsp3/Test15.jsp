<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<jsp:useBean id="board" class="vo.Board" scope="reqest"/>
<jsp:setProperty name="" property="no" value="10"/>
<jsp:setProperty name="" property="title" value="제목입니다."/>
<jsp:setProperty name="" property="contents" value="내용입니다."/>
<jsp:setProperty name="" property="viewCount" value="15"/>

게시물: <%=board%>
JspContext: ${pageScope.board}
ServletRequest: ${requestScope.board}
HttpSession: ${sessionScope.board}
ServletContext: ${applicationScope.board}

저장소(범위)를 지정하는 객체 이름을 생략하면 다음 순서대로 찾는다.
pageContext --> requestScope --> sessionScope --> applicationScope
=> ${board}


