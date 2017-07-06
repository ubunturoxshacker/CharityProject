<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg}
<form:form method="POST" action="userWelcome">
  <table> 
   <tr>
      <td> <form:label path="UserName"> UserName:</form:label> </td>
      <td> <form:input path="UserName"/></td>
   </tr>
   <tr></tr>
    <tr> 
       <td><form:label path="Password">Password:</form:label></td>  
       <td> <form:input path="Password"/></td>
    </tr>
     <tr></tr>
     <tr>
        <td><form:input type="submit" value="Log in" /></td>   
     </tr>
  </table>
</form:form>

</body>
</html>