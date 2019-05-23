<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'teacher_thisStudent.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="teacher_title.jsp" %>
	
	<s:fielderror></s:fielderror>
	
    <s:form theme="simple" method="post" action="changeScoreAction.action">
    	<s:hidden name="thisStu.id"></s:hidden>
    	<!--  
    	<s:text name="学号："></s:text><s:text name="thisStu.student.stuNo"></s:text><br/>
	    <s:text name="姓名："></s:text><s:text name="thisStu.student.stuName"></s:text><br/>
	    -->
	    <s:text name="平时成绩："></s:text><s:textfield name="score1"></s:textfield><br/>
	    <s:text name="理论成绩："></s:text><s:textfield name="score2"></s:textfield><br/>
	    <s:text name="期末考核："></s:text><s:textfield name="score3"></s:textfield><br/>
	    <input type="submit" value=确认提交><br/>
    </s:form>
	
  </body>
</html>
