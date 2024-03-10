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

 Date: 09/03/2024 15:47:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student_assessment
-- ----------------------------
DROP TABLE IF EXISTS `student_assessment`;
CREATE TABLE `student_assessment`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `teacher_id` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师编号',
  `course_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '课程名称',
  `average_score` float UNSIGNED NOT NULL COMMENT '平均分',
  `sample_total` int UNSIGNED NOT NULL COMMENT '样本数',
  `participation_rate` int UNSIGNED NOT NULL COMMENT '参评率',
  `year` year NOT NULL COMMENT '开始年份',
  `term` tinyint UNSIGNED NOT NULL COMMENT '上下学期',
  `school` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '开课学院',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_assessment
-- ----------------------------
INSERT INTO `student_assessment` VALUES (1, '10702', '单片机与接口技术', 92.66, 41, 100, 2022, 1, '计算机学院');
INSERT INTO `student_assessment` VALUES (2, '10717', '面向过程程序设计(C语言)', 90.98, 62, 88, 2022, 1, '科技处');

SET FOREIGN_KEY_CHECKS = 1;
