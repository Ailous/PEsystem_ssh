create database PEsystem_ssh
use PEsystem_ssh

create table College(             --学院
	id int identity(1,1) primary key,             --id
	colName nvarchar(15) not null   --学院名称
)

insert into College values('计算机学院')
insert into College values('商学院')
insert into College values('航空学院')
insert into College values('信息学院')
insert into College values('外国语学院')
insert into College values('工业自动化学院')
insert into College values('设计与艺术学院')
insert into College values('材料与环境学院')
insert into College values('会计与金融学院')
select * from College

create table Profession(          --专业
	id int identity(1,1) primary key,             --id(3位数）
	col_id int,                      --外键 学院College的id
	proName nvarchar(15) not null,  --专业名称
	constraint ProfessionFK1 foreign key(col_id) references College(id)
)

insert into Profession values(1, '软件工程')
insert into Profession values(1, '数字媒体技术')
insert into Profession values(1, '网络工程')
insert into Profession values(1, '计算机科学与技术')
insert into Profession values(2, '市场营销')
insert into Profession values(2, '物流管理')
insert into Profession values(3, '飞行技术')
insert into Profession values(3, '交通运输')
insert into Profession values(4, '通信工程')
insert into Profession values(4, '信息工程')
insert into Profession values(4, '自动化')
insert into Profession values(4, '电气工程及其自动化')
insert into Profession values(5, '商务英语')
insert into Profession values(5, '英语')
insert into Profession values(5, '日语')
insert into Profession values(5, '翻译')
insert into Profession values(6, '机械电子工程')
insert into Profession values(6, '车辆工程')
insert into Profession values(6, '交通工程')
insert into Profession values(6, '工业工程')
insert into Profession values(7, '环境设计')
insert into Profession values(7, '服装与服饰设计')
insert into Profession values(7, '产品设计')
insert into Profession values(7, '工艺美术')
insert into Profession values(7, '数字媒体艺术')
insert into Profession values(8, '环境工程')
insert into Profession values(8, '生物工程')
insert into Profession values(8, '应用化学')
insert into Profession values(8, '安全工程')
insert into Profession values(9, '会计学')
insert into Profession values(9, '财务管理')
insert into Profession values(9, '金融工程')
insert into Profession values(9, '审计学')
select * from Profession

create table Student(              --学生
	id int identity(1,1) primary key,              --id
	pro_id int,                       --外键 专业Profession的id
	stuNo nvarchar(9),              --学号 2016 001 00001  【为了方便，你插入数据的时候就是年级+id  2016  00001 -》9位数字就好了】
	stuName nvarchar(30) not null,    --姓名
	stuSex nvarchar(4) not null,      --性别
	stuPhone nvarchar(12),            --联系电话
	stuPassword nvarchar(20) not null,--密码
	constraint StudentFK1 foreign key(pro_id) references Profession(id)
)

insert into Student values(1, '201600001', '黄泽彬', '男', '13134567890', '1234')
insert into Student values(1, '201600002', '胡文瀚', '男', '13134567891', '1234')
insert into Student values(1, '201600003', '熊君', '男', '13134567892', '1234')
insert into Student values(1, '201600004', '张小娟', '女', '13134567893', '1234')
insert into Student values(1, '201600005', '张露', '女', '13134567894', '1234')
insert into Student values(1, '201600006', '喻自强', '男', '13134567895', '1234')
insert into Student values(1, '201600007', '刘凤', '女', '13134567896', '1234')
insert into Student values(1, '201600008', '高代鹏', '男', '13134567897', '1234')
insert into Student values(1, '201600009', '张晓梅', '女', '13134567898', '1234')
insert into Student values(1, '201600010', '陈辉', '男', '13134567899', '1234')
insert into Student values(1, '201600011', '张良', '男', '13134567880', '1234')
insert into Student values(2, '201600012', '李虹冰', '女', '13134567881', '1234')
insert into Student values(2, '201600013', '韩福平', '男', '13134567882', '1234')
insert into Student values(2, '201600014', '杨奕东', '男', '13134567883', '1234')
insert into Student values(2, '201600015', '刘杰', '男', '13134567884', '1234')
insert into Student values(2, '201600016', '何镇宇', '男', '13134567885', '1234')
insert into Student values(2, '201600017', '林婉霞', '女', '13134567886', '1234')
insert into Student values(2, '201600018', '连曙辉', '男', '13134567887', '1234')
insert into Student values(2, '201600019', '赖锦涛', '男', '13134567888', '1234')
insert into Student values(2, '201600020', '廖俊杰', '男', '13134567889', '1234')
insert into Student values(3, '201600021', '黄彦豪', '男', '13134567870', '1234')
insert into Student values(3, '201600022', '吴静璇', '女', '13134567871', '1234')
insert into Student values(3, '201600023', '杨芷珊', '女', '13134567872', '1234')
insert into Student values(3, '201600024', '简浩然', '男', '13134567873', '1234')
insert into Student values(3, '201600025', '陈靖杰', '男', '13134567874', '1234')
insert into Student values(3, '201600026', '邵梦涵', '女', '13134567875', '1234')
insert into Student values(3, '201600027', '钟伟涛', '男', '13134567876', '1234')
insert into Student values(3, '201600028', '孙竞轩', '男', '13134567877', '1234')
insert into Student values(3, '201600029', '韩梓娴', '女', '13134567878', '1234')
insert into Student values(3, '201600030', '刘思廷', '女', '13134567879', '1234')
insert into Student values(4, '201600031', '张婉贞', '女', '13134567860', '1234')
insert into Student values(4, '201600032', '杜沛昂', '男', '13134567861', '1234')
insert into Student values(4, '201600033', '李佳浩', '男', '13134567862', '1234')
insert into Student values(4, '201600034', '姚洁', '女', '13134567863', '1234')
insert into Student values(4, '201600035', '江佳玟', '女', '13134567864', '1234')
insert into Student values(4, '201600036', '谢泳基', '男', '13134567865', '1234')
insert into Student values(4, '201600037', '焦曼淇', '女', '13134567866', '1234')
insert into Student values(4, '201600038', '黄睿', '男', '13134567867', '1234')
insert into Student values(4, '201600039', '关颖梅', '女', '13134567868', '1234')
insert into Student values(4, '201600040', '陈若磊', '男', '13134567869', '1234')
insert into Student values(5, '201600041', '王光泽', '男', '13134567850', '1234')
insert into Student values(5, '201600042', '陈慧欣', '女', '13134567851', '1234')
insert into Student values(5, '201600043', '杨丽珍', '女', '13134567852', '1234')
insert into Student values(5, '201600044', '梁煦昊', '男', '13134567853', '1234')
insert into Student values(5, '201600045', '梅妍', '女', '13134567854', '1234')
insert into Student values(5, '201600046', '张佳琳', '女', '13134567855', '1234')
insert into Student values(5, '201600047', '余柯菲', '女', '13134567856', '1234')
insert into Student values(5, '201600048', '李友添', '男', '13134567857', '1234')
insert into Student values(5, '201600049', '冯晓靖', '女', '13134567858', '1234')
insert into Student values(5, '201600050', '汪悦', '男', '13134567859', '1234')
insert into Student values(5, '201600051', '胡鹏', '男', '13134565978', '1234')

select * from Student

create table Teacher(             --教师
	id int identity(1,1) primary key,
	teaNo nvarchar(5),   --工号  00001
	teaName nvarchar(30) not null,    --姓名
	teaSex nvarchar(4) not null,      --性别
	teaPhone nvarchar(12),            --联系电话
	teaPassword nvarchar(20) not null --密码
)
insert into Teacher values('00001', '张老师', '男', '13145689899', '1234')
insert into Teacher values('00002', '陈老师', '男', '13145689898', '1234')
insert into Teacher values('00003', '刘老师', '男', '13145689897', '1234')
insert into Teacher values('00004', '王老师', '男', '13145689896', '1234')
insert into Teacher values('00005', '赵老师', '男', '13145689896', '1234')

select * from Teacher

create table Course(              --课程
	id int identity(1,1) primary key,
	couName nvarchar(30)  not null,   --课程名
	couHour int not null,             --课时
	couCredit int not null            --学分
)

insert into Course values('乒乓球', 32, 2)
insert into Course values('轮滑', 32, 2)
insert into Course values('散打', 32, 2)
insert into Course values('网球', 32, 2)
insert into Course values('篮球', 32, 2)

select* from Course

create table StartClass(               --开课班
	id int identity(1,1) primary key,--id
	cou_id int,                  --课程号(外键）
	tea_id int,                  --工号(外键）
	claLocation nvarchar(50),            --上课地点
	claTime nvarchar(50),                --上课时间
	constraint StartClassFK1 foreign key(tea_id) references Teacher(id),
	constraint StartClassFK2 foreign key(cou_id) references Course(id)
)

insert into StartClass values(1, 4, '35栋楼下', '第1-16周星期三第3-4节')
insert into StartClass values(2, 1, '轮滑场', '第1-16周星期三第3-4节')
insert into StartClass values(3, 3, '休闲健身教室（体育部游泳池一层）', '第1-16周星期三第3-4节')
insert into StartClass values(4, 2, '网球场', '第1-16周星期三第3-4节')
insert into StartClass values(5, 5, '篮球场', '第1-16周星期三第3-4节')

select * from StartClass

create table Score(               --成绩
	id int identity(1,1) primary key,
	cla_id int,           --开课班号（外键）
	stu_id int,               --学号（外键）
	score1 int,                     --平时成绩
	score2 int,                     --理论成绩
	score3 int,                     --期末考核
	total int,                   --总成绩
	constraint ScoreFK1 foreign key(stu_id) references Student(id),
	constraint ScoreFK2 foreign key(cla_id) references StartClass(id)
)
/*  暂时不执行 注意cla_id与stu_id
insert into Score values(1, 1, 80, 85, 90, 86)
insert into Score values(2, 1, 70, 82, 75, 75)
insert into Score values(3, 2, 85, 90, 90, 89)
insert into Score values(4, 3, 75, 78, 70, 73)
insert into Score values(5, 4, 85, 84, 75, 80)
insert into Score values(6, 5, NULL, NULL, NULL, NULL)
insert into Score values(7, 5, NULL, NULL, NULL, NULL)
insert into Score values(8, 1, NULL, NULL, NULL, NULL)
insert into Score values(9, 1, NULL, NULL, NULL, NULL)
insert into Score values(10, 2, NULL, NULL, NULL, NULL)
insert into Score values(11, 1, 70, 90, 80, 79)
insert into Score values(12, 2, 60, 90, 65, 69)
insert into Score values(13, 2, 82, 86, 76, 80)
insert into Score values(14, 3, 76, 86, 84, 82)
insert into Score values(15, 4, 75, 76, 75, 75)
insert into Score values(16, 5, NULL, NULL, NULL, NULL)
insert into Score values(17, 5, NULL, NULL, NULL, NULL)
insert into Score values(18, 2, NULL, NULL, NULL, NULL)
insert into Score values(19, 2, NULL, NULL, NULL, NULL)
insert into Score values(20, 2, NULL, NULL, NULL, NULL)
insert into Score values(21, 1, 65, 90, 75, 75)
insert into Score values(22, 2, 76, 80, 85, 81)
insert into Score values(23, 2, 84, 86, 86, 85)
insert into Score values(24, 3, 73, 76, 88, 81)
insert into Score values(25, 3, 84, 86, 78, 81)
insert into Score values(26, 3, NULL, NULL, NULL, NULL)
insert into Score values(27, 4, NULL, NULL, NULL, NULL)
insert into Score values(28, 5, NULL, NULL, NULL, NULL)
insert into Score values(29, 5, NULL, NULL, NULL, NULL)
insert into Score values(30, 3, NULL, NULL, NULL, NULL)
insert into Score values(31, 1, 86, 84, 80, 83)
insert into Score values(32, 2, 60, 76, 83, 75)
insert into Score values(33, 3, 90, 80, 85, 86)
insert into Score values(34, 3, 76, 84, 80, 80)
insert into Score values(35, 4, 80, 80, 76, 78)
insert into Score values(36, 4, NULL, NULL, NULL, NULL)
insert into Score values(37, 5, NULL, NULL, NULL, NULL)
insert into Score values(38, 5, NULL, NULL, NULL, NULL)
insert into Score values(39, 4, NULL, NULL, NULL, NULL)
insert into Score values(40, 4, NULL, NULL, NULL, NULL)
insert into Score values(41, 1, 90, 84, 80, 84)
insert into Score values(42, 1, 68, 88, 76, 76)
insert into Score values(43, 2, 84, 68, 76, 77)
insert into Score values(44, 2, 73, 80, 80, 78)
insert into Score values(45, 3, 84, 94, 80, 84)
insert into Score values(46, 4, NULL, NULL, NULL, NULL)
insert into Score values(47, 4, NULL, NULL, NULL, NULL)
insert into Score values(48, 5, NULL, NULL, NULL, NULL)
insert into Score values(49, 5, NULL, NULL, NULL, NULL)
insert into Score values(50, 5, NULL, NULL, NULL, NULL)
*/
select * from StartClass
select * from Score
select * from Student

create table t_User(  --管理员
	id int identity(1,1) primary key,
	loginName nvarchar(12),
	loginPassword nvarchar(20)
)
insert into t_User values('admin', 'admin')
select * from t_User
