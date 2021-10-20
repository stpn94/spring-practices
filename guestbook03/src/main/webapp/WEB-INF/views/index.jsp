<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>​
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>​
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/add" method="post">
		<table border=1 width=500>
			<tr>
				<td>이름</td>
				<td>
					<input type="text" name="name">
				</td>
				<td>비밀번호</td>
				<td>
					<input type="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan=4>
					<textarea name="message" cols=60 rows=5></textarea>
				</td>
			</tr>
			<tr>
				<td colspan=4 align=right>
					<input type="submit" VALUE="등록">
				</td>
			</tr>
		</table>
	</form>
	<br>


	<table width=510 border=1>
		<c:forEach var="vo" items="${list}">

			<tr>
				<td>1</td>
				<td>${vo.no}</td>
				<td>${vo.name}</td>
				<td>
					<a href="${pageContext.request.contextPath}/delete/${vo.no}">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan=4>
					<pre>${vo.message}</pre>
				</td>
			</tr>


		</c:forEach>
	</table>
</body>

</html>