<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_addStartClass.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>

    <s:fielderror></s:fielderror>
    <s:form method="post" action="admin_addStartClassAction" theme="simple">
    	<s:text name="课程id："></s:text><s:textfield name="addCourseId"></s:textfield><br/>
    	<s:text name="教师工号："></s:text><s:textfield name="addTeacherNo"></s:textfield><br/>
    	<s:text name="上课地点："></s:text><s:textfield name="addLocation"></s:textfield><br/>
    	<s:text name="上课时间："></s:text><s:textfield name="addTime"></s:textfield><br/>
    	<s:submit value="确认提交"></s:submit>
    </s:form>
  </body>
</html>
