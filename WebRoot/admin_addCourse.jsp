<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_addCourse.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>

    <s:fielderror></s:fielderror>
    <s:form method="post" action="admin_addCourseAction" theme="simple">
    	<s:text name="课程名："></s:text><s:textfield name="addName"></s:textfield><br/>
    	<s:text name="学时："></s:text><s:select name="addHour" list="%{#{'32':'32学时', '64':'64学时'}}"></s:select><br/>
    	<s:text name="学分："></s:text><s:select name="addCredit" list="%{#{'1':'1学分', '2':'2学分', '3':'3学分', '4':'4学分'}}"></s:select><br/>
    	<s:submit value="确认提交"></s:submit>
    </s:form>
  </body>
</html>
