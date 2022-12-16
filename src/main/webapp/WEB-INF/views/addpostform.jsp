<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Diary</h1>
<form action="addok" method="post">
<table id="edit">
<tr><td>Writer:</td><td><input type="text" name="writer"/></td></tr>
<tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
<tr><td>Mood:</td><td><input type="text" name="mood"></td></tr>
<tr><td>Goal:</td><td><input type="text" name="goal"></td></tr>
<tr><td>Wakeup:</td><td><input type="text" name="wakeup"/></td></tr>
<tr><td>Payment:</td><td><input type="text" name="payment"/></td></tr>
<tr><td>Exercise:</td><td><input type="text" name="exercise"/></td></tr>
<tr><td><a href="list">View All Records</a></td><td align="right"><input type="submit" value="Add Post"/></td></td><td align="right"><input type="reset" value="Reset"></td></tr>
</table>
</form>

</body>
</html>