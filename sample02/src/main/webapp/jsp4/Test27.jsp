<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
[c:set]
-변수를 만드는 태그
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="name" value="임꺽정" scope="page"/>
<c:set var="name2" value="유관순"/>
<c:set var="name3">윤봉길</c:set>
${pageScope.name}, ${name},
${pageScope.name2},
${pageScope.name3},

