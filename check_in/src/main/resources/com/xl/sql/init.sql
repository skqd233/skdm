create table student(
 studentid varchar(40) primary key,
 face_pic varchar(40),
 major varchar(40),
 s_class varchar(40),
 s_id varchar(40),
 s_name varchar(40),
 s_sex varchar(40),
 wxs_name varchar(40)
);

create table teacher(
 teacherid varchar(40) primary key,
 t_college varchar(40),
 t_name varchar(40),
 t_school varchar(40),
 wxt_name varchar(40)
);

create table manager(
 managerid varchar(40) primary key,
 account varchar(40),
 password varchar(40)
);

create table signinfo(
 signid varchar(40) primary key,
 sign_link varchar(40),
 sign_remark varchar(40),
 sign_time varchar(40),
 sign_title varchar(40),
 sign_type varchar(40)
);

create table student_signinfo(
 studentid varchar(40),
 signid varchar(40)
);

create table teacher_signinfo(
 teacherid varchar(40),
 signid varchar(40)
);