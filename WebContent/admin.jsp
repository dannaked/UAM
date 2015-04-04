<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
</head>
<body>
	<s:form action="admin">
		<s:textfield label="Username" key="userId" ></s:textfield>
		<s:password label="Password" key="password"  ></s:password>
		<s:submit></s:submit>
	</s:form>

</body>
</html>