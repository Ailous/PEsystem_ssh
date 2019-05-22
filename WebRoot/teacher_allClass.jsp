<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'teacher_allClass.jsp' starting page</title>
    <script type="text/javascript" src="js/js.js" charset="UTF-8"></script>  <!-- 注意引用javasrript的路径 -->

  </head>
  
  <body>
    <%@ include file="teacher_title.jsp" %>
  	<table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
  		<tr>
  			<td><s:text name="开课班编号"></s:text></td>
  			<td><s:text name="课程名称"></s:text></td>
  			<td><s:text name="授课教师"></s:text></td>
  			<td><s:text name="时间"></s:text></td>
  		</tr>
  		<s:iterator value="allClass" status="st" var="ac">
  		<tr align="center" >
  			<td><s:property value="#ac.id"/></td>
  			<td><s:property value="#ac.course.couName"/></td>
  			<td><s:property value="#ac.teacher.teaName"/></td>
  			<td><s:property value="#ac.claTime"/></td>
  			<td>
				<a href="javascript:classDetail('<s:property value="#ac.id"/>')">进入班级学生成绩信息</a>
			</td>
  		</tr>
  		</s:iterator>
  	</table>
  </body>
</html>
