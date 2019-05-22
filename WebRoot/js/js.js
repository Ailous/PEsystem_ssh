//student

//student 更新电话 
function stuChangePhone(stuNo){
	location.href="student_changePhone.jsp?stuNo="+stuNo;
}

//student 修改密码  
function stuChangePwd(){
	location.href="student_changePwd.jsp";
}

//选课
function chooseClass(cId){
	if(confirm("你确定选中该门课吗?")){
		location.href="chooseClassAction?startClassId="+cId;
	}
}

///////////////////////////////////


//Teacher

//teacher 更新电话 
function teaChangePhone(teaNo){
	location.href="teacher_changePhone.jsp?teaNo="+teaNo;
}



//teacher 修改密码  
function teaChangePwd(){
	location.href="teacher_changePwd.jsp";
}

//班级里的学生信息
function classDetail(classId){
	location.href="classDetailAction?classId="+classId;
}

//修改某个学生的成绩
function refreshScore(stuNo, classId){
	location.href="refreshStuScoreAction?stuNo="+stuNo+"&startClassId="+classId;
}
///////////////////////////////////


//admin
//删除某个学生信息
function deleteThisStu(stuId){
	if(confirm("你确定删除该学生吗?如果该学生已经选课将会操作失败")){
		location.href="admin_deleteThisStuAction?stuId="+stuId;
	}
}

//admin 删除某一个老师
function deleteThisTeacher(teaId){
	if(confirm("你确定删除该教师吗?")){
		location.href="admin_deleteThisTeaAction?teaId="+teaId;
	}
}

//删除某一门课程
function deleteThisCourse(couId){
	if(confirm("你确定删除该课程吗?如果有已有开课班将会操作失败，请进一步联系数据库管理员!")){
		location.href="admin_deleteThisCouAction?couId="+couId;
	}
}

//删除某一开课班
function deleteThisStartClass(startClassId){
	if(confirm("你确定删除该课程吗?如果有已有学生选课将会操作失败，请进一步联系数据库管理员!")){
		location.href="admin_deleteThisStartClassAction?startClassId="+startClassId;
	}
}
///////////////////////////////////
