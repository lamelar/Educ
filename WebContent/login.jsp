<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
<h1>ログイン画面</h1>
<s:form action="Login">
<s:textfield name="name"/>
<s:password name="password"/>
<s:submit type="button"/>
</s:form>
</body>
</html>