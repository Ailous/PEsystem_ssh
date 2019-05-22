<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_allTeacherInfo.jsp' starting page</title>
    <script type="text/javascript" src="js/js.js" charset="UTF-8"></script>

  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>
    
    <table border="1" width="60%"  border="0" cellpadding="3" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px;margin-top:8px;">
		<tr>
			<th>工号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>手机号码</th>
		</tr>
		<s:iterator value="allTeacherInfo" status="st" var="ut">
		<tr align="center" >
			<td><s:property value="#ut.teaNo"/></td>
			<td><s:property value="#ut.teaName"/></td>
			<td><s:property value="#ut.teaSex"/></td>
			<td><s:property value="#ut.teaPhone"/></td>
			<td>
				<!--  
				<a href="javascript:modifyTicket('<s:property value="#ut.id"/>')">修改</a>
				-->
				<a href="javascript:deleteThisTeacher('<s:property value="#ut.id"/>')">删除</a>
			</td>
		</tr>
		</s:iterator>
	</table>
	<!--  
	[<a href="admin_allTeaAction?pageNo=1">首页</a>]
			<c:choose>
				<c:when test="${currentPage>1}">
					[<a href="admin_allTeaAction?pageNo=${currentPage-1}">上一页</a>]
				</c:when>
			</c:choose>
			<c:choose>
				<c:when test="${currentPage<totalPage}">
					[<a href="admin_allTeaAction?pageNo=${currentPage+1}">下一页</a>]
				</c:when>
			</c:choose>
	[<a href="admin_allTeaAction?pageNo=${totalPage}">尾页</a>]
	-->
  </body>
</html>
