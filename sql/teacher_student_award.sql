CREATE TABLE teacher_student_award (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '唯一标识',
    sequence VARCHAR(50) NOT NULL COMMENT '序列号',
    college VARCHAR(100) NOT NULL COMMENT '学院',
    competition_name VARCHAR(100) NOT NULL COMMENT '竞赛名称',
    entry_name VARCHAR(100) NOT NULL COMMENT '参赛作品名称',
    supervisor VARCHAR(100) NOT NULL COMMENT '指导老师',
    contact_number VARCHAR(20) NOT NULL COMMENT '联系电话',
    level VARCHAR(50) NOT NULL COMMENT '荣誉级别',
    honor_level VARCHAR(50) NOT NULL COMMENT '荣誉等级',
    organizing_unit VARCHAR(100) NOT NULL COMMENT '主办单位',
    competition_category VARCHAR(50) NOT NULL COMMENT '竞赛类别',
    award_date DATE NOT NULL COMMENT '获奖时间',
    project_leader VARCHAR(100) NOT NULL COMMENT '项目负责人',
    student_id VARCHAR(20) NOT NULL COMMENT '学号',
    leader_contact_number VARCHAR(20) NOT NULL COMMENT '负责人电话',
    team_members TEXT COMMENT '团队成员',
    remarks TEXT COMMENT '备注'
) COMMENT '教师带领学生获奖表';

INSERT INTO teacher_student_award (sequence, college, competition_name, entry_name, supervisor, contact_number, level, honor_level, organizing_unit, competition_category, award_date, project_leader, student_id, leader_contact_number, team_members, remarks)
VALUES ('1', '计算机学院', '第九届“大唐杯”全国大学生新一代信息通信技术大赛', '信息通信技术赛', '刘丰年，李长云', '15673322185', '国家级', '二等奖', '工业和信息化部人才交流中心、中国通信企业协会', 'Ⅲ类', '2022-07-01', '唐家骏', '19408200056', '15673918989', '赵鹏钜', '');