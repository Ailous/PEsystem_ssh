<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'student_scoreInfo.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="student_title.jsp" %>
	如果表格为空，则表示教师还没有录入成绩<br/>
  	<table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
  		<tr>
  			<td><s:text name="课程名"></s:text></td>
  			<td><s:text name="课程id编号"></s:text></td>
  			<td><s:text name="授课老师"></s:text></td>
  			<td><s:text name="平时成绩"></s:text></td>
  			<td><s:text name="理论成绩"></s:text></td>
  			<td><s:text name="期末考核"></s:text></td>
  			<td><s:text name="总成绩"></s:text></td>
  		</tr>
  		<s:iterator value="myScore" status="st" var="ms">
  		<tr align="center" >
  			<td><s:property value="#ms.startClass.course.couName"/></td>
  			<td><s:property value="#ms.startClass.course.id"/></td>
  			<td><s:property value="#ms.startClass.teacher.teaName"/></td>
  			<td><s:property value="#ms.score1"/></td>
			<td><s:property value="#ms.score2"/></td>
			<td><s:property value="#ms.score3"/></td>
			<td><s:property value="#ms.total"/></td>
  		</tr>
  		</s:iterator>
  	</table>
  </body>
</html>
