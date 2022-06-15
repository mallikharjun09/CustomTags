<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/taglibs/mycustomtags.tld" prefix="mine"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <mine:Loop max="10" msg="Welcome to Custom Tags" />
   <mine:Loop max="5" msg="Red Text" color="red"/>
   <mine:Loop max="5" msg="Red Text" color="blue"/>
   <mine:Loop min="100" max="150" msg="nums" color="green" step="5"/>
</body>
</html>