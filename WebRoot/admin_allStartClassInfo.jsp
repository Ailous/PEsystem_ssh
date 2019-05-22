<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_allStartClassInfo.jsp' starting page</title>
	<script type="text/javascript" src="js/js.js" charset="UTF-8"></script>
	
  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>
    
    <table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
		<tr>
			<th>开课班编号</th>
			<th>课程名称</th>
			<th>授课教师</th>
			<th>上课地点</th>
			<th>上课时间</th>
		</tr>
		<s:iterator value="allStartClassInfo" status="st" var="ut">
		<tr align="center" >
			<td><s:property value="#ut.id"/></td>
			<td><s:property value="#ut.course.couName"/></td>
			<td><s:property value="#ut.teacher.teaName"/></td>
			<td><s:property value="#ut.claLocation"/></td>
			<td><s:property value="#ut.claTime"/></td>
			<td>
				<a href="javascript:deleteThisStartClass('<s:property value="#ut.id"/>')">删除</a>
			</td>
		</tr>
		</s:iterator>
	</table>
  </body>
</html>
