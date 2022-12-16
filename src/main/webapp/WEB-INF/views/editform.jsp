<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.spring.diary.DiaryDAO, com.spring.diary.DiaryVO"%>
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
<form:form modelAttribute="diaryVO" method="post" action="../editok">
<form:hidden path="seq"/>
<table id="edit">
 <tr><td>Writer:</td><td><form:input path="writer"/></td></tr>
 <tr><td>Content:</td><td><form:textarea cols="50" rows="5" path="content"/></td></tr>
 <tr><td>Mood:</td><td><form:input path="mood"/></td></tr>
 <tr><td>Goal:</td><td><form:input path="goal"/></td></tr>
 <tr><td>Wakeup:</td><td><form:input path="wakeup"/></td></tr>
 <tr><td>Payment:</td><td><form:input path="payment"/></td></tr>
 <tr><td>Exercise:</td><td><form:input path="exercise"/></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form:form>
</body>
</html>