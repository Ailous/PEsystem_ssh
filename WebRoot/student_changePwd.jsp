<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'student_changePwd.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="student_title.jsp" %>
    
    <s:fielderror></s:fielderror>
    <s:form method="post" action="student_changePwdAction" theme="simple">
    	<s:text name="旧密码"></s:text><s:password name="oldPwd"></s:password><br/>
    	<s:text name="新密码"></s:text><s:password name="newPwd1"></s:password><br/>
    	<s:text name="确认新密码"></s:text><s:password name="newPwd2"></s:password><br/>
    	<s:submit value="确认提交"></s:submit>
    </s:form>
  </body>
</html>
