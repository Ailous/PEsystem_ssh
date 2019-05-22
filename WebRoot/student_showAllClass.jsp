<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'student_showAllClass.jsp' starting page</title>
    <script type="text/javascript" src="js/js.js" charset="UTF-8"></script>  <!-- 注意引用javasrript的路径 -->

  </head>
  
  <body>
  <%@ include file="student_title.jsp" %>
  
    <table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
		<tr>
			<th>开课班编号</th>
			<th>课程名</th>
			<th>授课教师</th>
			<th>上课地点</th>
			<th>上课时间</th>
			<th>是否选课</th>
		</tr>
		<s:iterator value="allClass" status="st" var="ac">
		<tr align="center" >
			<td><s:property value="#ac[0]"/></td>
			<td><s:property value="#ac[1]"/></td>
			<td><s:property value="#ac[2]"/></td>
			<td><s:property value="#ac[3]"/></td>
			<td><s:property value="#ac[4]"/></td>
			<td>
				<a href="javascript:chooseClass('<s:property value="#ac[0]"/>')">选课</a>
			</td>
		</tr>
		</s:iterator>
	</table>
	<!--  
	[<a href="student_showAllClassAction?pageNo=1">首页</a>]
			<c:choose>
				<c:when test="${currentPage>1}">
					[<a href="student_showAllClassAction?pageNo=${currentPage-1}">上一页</a>]
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${currentPage<totalPage}">
					[<a href="student_showAllClassAction?pageNo=${currentPage+1}">下一页</a>]
				</c:when>
			</c:choose>
	[<a href="student_showAllClassAction?pageNo=${totalPage}">尾页</a>]
	-->
  </body>
</html>
