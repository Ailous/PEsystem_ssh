<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'student_changePhone.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="student_title.jsp" %>
    
    <s:fielderror></s:fielderror>
    <s:form method="post" action="student_changePhone">
    	<s:text name="请输入新的手机号码   【11位号码！】"></s:text><s:textfield name="newPhoneNumber"></s:textfield>
    	<s:submit value="确认更新"></s:submit>
    </s:form>
  </body>
</html>
