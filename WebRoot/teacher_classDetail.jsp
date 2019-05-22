<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'teacher_classDetail.jsp' starting page</title>
    <script type="text/javascript" src="js/js.js" charset="UTF-8"></script>  <!-- 注意引用javasrript的路径 -->

  </head>
  
  <body>
    <%@ include file="teacher_title.jsp" %>
    
    <table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>平时成绩</th>
			<th>理论成绩</th>
			<th>期末考核成绩</th>
			<th>总成绩</th>
		</tr>
		<s:iterator value="myClassStudent" status="st" var="mcs">
		<tr align="center" >
			<td><s:property value="#mcs.student.stuNo"/></td>
			<td><s:property value="#mcs.student.stuName"/></td>
			<td><s:property value="#mcs.student.stuSex"/></td>
			<td><s:property value="#mcs.score1"/></td>
			<td><s:property value="#mcs.score2"/></td>
			<td><s:property value="#mcs.score3"/></td>
			<td><s:property value="#mcs.total"/></td>
			<td>
				<a href="javascript:refreshScore('<s:property value="#mcs.student.stuNo"/>', '<s:property value="#mcs.startClass.id"/>')">给该学生添加成绩</a>
			</td>
		</tr>
		</s:iterator>
	</table>
  </body>
</html>
