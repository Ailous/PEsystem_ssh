<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登陆界面</title>
  </head>
  <body>
  	<s:fielderror></s:fielderror>
  	<!-- 用户登陆表单 -->
  	<s:form name="f1" method="post" action="loginAction" theme="simple">
  		<s:text name="用户名" ></s:text><s:textfield name="loginName"></s:textfield><br/>
  		<s:text name="密码" ></s:text><s:password name="loginPassword"></s:password><br/>
  		<input type="radio" name="type" checked="checked" value="1">学生&nbsp;&nbsp;
  		<input type="radio" name="type" value="2">教师&nbsp;&nbsp;
  		<input type="radio" name="type" value="3">管理员<br/>
  		<input type="submit" value="提交"/>&nbsp;<input type="reset" value="重置"/><br/>
  	</s:form>
  </body>
</html>
