<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>显示所有学生信息</title>
    <script type="text/javascript" src="js/js.js" charset="UTF-8"></script>

  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>
	
  	<table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
  		<tr>
  			<td><s:text name="学号"></s:text></td>
  			<td><s:text name="姓名"></s:text></td>
  			<td><s:text name="性别"></s:text></td>
  			<td><s:text name="手机号码"></s:text></td>
  			<td><s:text name="学院"></s:text></td>
  			<td><s:text name="专业"></s:text></td>
  		</tr>
  		<s:iterator value="allStu" status="st" var="as">
  		<tr align="center" >
  			<td><s:property value="#as.stuNo"/></td>
  			<td><s:property value="#as.stuName"/></td>
  			<td><s:property value="#as.stuSex"/></td>
  			<td><s:property value="#as.stuPhone"/></td>
  			<td><s:property value="#as.profession.college.colName"/></td>
			<td><s:property value="#as.profession.proName"/></td>
			<td>
				<!--  
				<a href="javascript:modifyTicket('<s:property value="#ut.id"/>')">修改</a>
				-->
				<a href="javascript:deleteThisStu('<s:property value="#as.id"/>')">删除</a>
			</td>
  		</tr>
  		</s:iterator>
  	</table>
  	<!--  
  	[<a href="admin_allStuAction?pageNo=1">首页</a>]
			<c:choose>
				<c:when test="${currentPage>1}">
					[<a href="admin_allStuAction?pageNo=${currentPage-1}">上一页</a>]
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${currentPage<totalPage}">
					[<a href="admin_allStuAction?pageNo=${currentPage+1}">下一页</a>]
				</c:when>
			</c:choose>
	[<a href="admin_allStuAction?pageNo=${totalPage}">尾页</a>]
	-->
  </body>
</html>
