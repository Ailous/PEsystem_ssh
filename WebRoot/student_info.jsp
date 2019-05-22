<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>My JSP 'student_info.jsp' starting page</title>
	<script type="text/javascript" src="js/js.js" charset="UTF-8"></script>  <!-- 注意引用javasrript的路径 -->
	
  </head>
  
  <body>
  	<%@ include file="student_title.jsp" %>
  	<s:iterator value="studentInfo" status="st" var="si">
  	<table>
  		<tr>
  			<td><s:text name="学号"></s:text></td>
  			<td><s:property value="#si[0]"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="姓名"></s:text></td>
  			<td><s:property value="#si[1]"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="性别"></s:text></td>
  			<td><s:property value="#si[2]"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="手机电话"></s:text></td>
  			<td><s:property value="#si[3]"/></td>
  			<td>
  				<a href="javascript:stuChangePhone('<s:property value="#si[0]"/>')">更新电话</a>
  			</td>
  		</tr>
  		<tr>
  			<td><s:text name="学院"></s:text></td>
  			<td><s:property value="#si[4]"/></td>
  		</tr>
  		<tr>
  			<td><s:text name="专业"></s:text></td>
  			<td><s:property value="#si[5]"/></td>
  		</tr>
  		<tr>
  			<td>密码</td>
  			<td>********</td>
  			<td>
  				<a href="javascript:stuChangePwd()">修改密码</a>
  			</td>
  		</tr>
  	</table>
    </s:iterator>
  </body>
</html>
