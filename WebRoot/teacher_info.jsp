<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>My JSP 'student_info.jsp' starting page</title>
	<script type="text/javascript" src="js/js.js" charset="UTF-8"></script>  <!-- 注意引用javasrript的路径 -->
	
  </head>
  
  <body>
  	<%@ include file="teacher_title.jsp" %>
  	
  	<s:iterator value="teacherInfo" status="st" var="si">
  	<table>
  		<tr>
  			<td><s:text name="工号"></s:text></td>
  			<td><s:property value="#si.teaNo"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="姓名"></s:text></td>
  			<td><s:property value="#si.teaName"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="性别"></s:text></td>
  			<td><s:property value="#si.teaSex"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="手机电话"></s:text></td>
  			<td><s:property value="#si.teaPhone"/></td>
  			<td>
  				<a href="javascript:teaChangePhone('<s:property value="#si.teaNo"/>')">更新电话</a>
  			</td>
  		</tr>
  		<tr>
  			<td>密码</td>
  			<td>********</td>
  			<td>
  				<a href="javascript:teaChangePwd()">修改密码</a>
  			</td>
  		</tr>
  	</table>
    </s:iterator>
  </body>
</html>
