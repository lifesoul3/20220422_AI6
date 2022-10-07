<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		#lineid{
			width:50px;
			margin:0;
			float:left;
		}

	</style>
</head>
<body>
	<c:forEach var="item" items="${list}">
			<h1>${item }</h1>
		</div>
		
		
	</c:forEach>
</body>
</html>