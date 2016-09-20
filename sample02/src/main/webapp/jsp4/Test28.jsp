<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
[c:set]
- 기존 객체의 셋터 메서드를 호출할 때 사용할 수 있다.

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="board" class="vo.Board" scope="page"/>

<c:set target="${board}" property="no" value="100"/>
<c:set target="${board}" property="title" value="제목입니다."/>
<c:set target="${board}" property="contents" value="내용입니다."/>
<c:set target="${board}" property="viewCount" value="15"/>

${board.no},
${board.title},
${board.contents},
${board.viewCount},

