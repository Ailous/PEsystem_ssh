<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_addTeacher.jsp' starting page</title>

  </head>
  
  <body>
  	<%@ include file="admin_title.jsp" %>
    
    <s:fielderror></s:fielderror>
    
    <s:form method="post" action="admin_addTeaAction" theme="simple">
    	<s:text name="姓名："></s:text><s:textfield name="addName"></s:textfield><br/>
    	<s:text name="性别："></s:text><s:select name="addSex" list="%{#{'男':'男', '女':'女'}}"></s:select><br/>
    	<s:submit value="确认提交"></s:submit>
    </s:form>
  </body>
</html>
