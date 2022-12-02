<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.spring.board.BoardDAO, com.spring.board.BoardVO"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<%--<%
	BoardDAO boardDAO = new BoardDAO();
	String id=request.getParameter("id");	
	BoardVO u=boardDAO.getBoard(Integer.parseInt(id));
%>--%>

<h1>Edit Form</h1>
<form:form modelAttribute="boardVO" method="post" action="../editok">
<form:hidden path="seq"/>
<table id="edit">
<tr><td>Title:</td><td><form:input path="title"/></td></tr>
<tr><td>Writer:</td><td><form:input path="writer"/></td></tr>
<tr><td>Content:</td><td><form:textarea cols="50" rows="5" path="content"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form:form>
</body>
</html>