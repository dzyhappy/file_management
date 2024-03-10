/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : file_management

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 09/03/2024 15:47:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teacher_student_award
-- ----------------------------
DROP TABLE IF EXISTS `teacher_student_award`;
CREATE TABLE `teacher_student_award`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '唯一标识',
  `sequence` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '序列号',
  `college` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学院',
  `competition_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '竞赛名称',
  `entry_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '参赛作品名称',
  `supervisor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '指导老师',
  `contact_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '联系电话',
  `level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '荣誉级别',
  `honor_level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '荣誉等级',
  `organizing_unit` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主办单位',
  `competition_category` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '竞赛类别',
  `award_date` date NOT NULL COMMENT '获奖时间',
  `project_leader` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目负责人',
  `student_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学号',
  `leader_contact_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人电话',
  `team_members` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '团队成员',
  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 408184858 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '教师带领学生获奖表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher_student_award
-- ----------------------------
INSERT INTO `teacher_student_award` VALUES (1, '1', '计算机学院', '第九届“大唐杯”全国大学生新一代信息通信技术大赛', '信息通信技术赛', '刘丰年，李长云', '15673322185', '国家级', '二等奖', '工业和信息化部人才交流中心、中国通信企业协会', 'Ⅲ类', '2022-07-01', '唐家骏', '19408200056', '15673918989', '赵鹏钜', '');
INSERT INTO `teacher_student_award` VALUES (2, '2', 'sd', 'sd', 'sds', 'sd', '1225', 'asd', 'sd', 'asd', 'asdas', '2024-03-08', 'asd', '5', '545', 'sa', NULL);
INSERT INTO `teacher_student_award` VALUES (408184857, '55555555', '计算机学院', '第九届“大唐杯”全国大学生新一代信息通信技术大赛', '信息通信技术赛', '刘丰年，李长云', '15673322185', '国家级', '一等奖', '工业和信息化部人才交流中心、中国通信企业协会', 'Ⅲ类', '2022-07-01', '唐家骏', '19408200056', '15673918989', '赵鹏钜111', '');

SET FOREIGN_KEY_CHECKS = 1;
