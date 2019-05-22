<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'admin_addStu.jsp' starting page</title>

  </head>
  
  <body>
    <%@ include file="admin_title.jsp" %>
    
    <!-- 如何将allPro转为下拉框  ？？？ -->
    
    <s:fielderror></s:fielderror>
    <s:form method="post" action="admin_addStuAction" theme="simple">
    	<s:text name="姓名："></s:text><s:textfield name="addName"></s:textfield><br/>
    	<s:text name="性别："></s:text><s:select name="addSex" list="%{#{'男':'男', '女':'女'}}"></s:select><br/>
    	<s:text name="年级："></s:text><s:select name="addYear" list="%{#{'2016':'2016级', '2017':'2017级', '2018':'2018级', '2019':'2019级', '2020':'2020级', '2021':'2021级', '2022':'2022级', '2023':'2023级', '2024':'2024级', '2025':'2025级', '2026':'2026级', '2027':'2027级', '2028':'2028级'}}"></s:select><br/>
    	<s:text name="专业："></s:text><s:textfield name="addProfession"></s:textfield><br/>
    	<s:submit value="确认提交"></s:submit>
    </s:form>
  </body>
</html>
