/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : file_management

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 18/11/2023 21:37:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for supervisor_assessment
-- ----------------------------
DROP TABLE IF EXISTS `supervisor_assessment`;
CREATE TABLE `supervisor_assessment`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '课程名称',
  `teacher_id` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师编号',
  `cls` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '听课班级',
  `date` date NOT NULL COMMENT '听课日期',
  `order` tinyint(0) UNSIGNED NOT NULL COMMENT '第几节课',
  `address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '听课地点',
  `should_total` smallint(0) UNSIGNED NOT NULL COMMENT '应到人数',
  `have_total` smallint(0) UNSIGNED NOT NULL COMMENT '实到人数',
  `late_total` smallint(0) UNSIGNED NOT NULL COMMENT '迟到人数',
  `shool` varchar(127) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '开课学院',
  `year` year NOT NULL COMMENT '年份',
  `score` tinyint(0) UNSIGNED NOT NULL COMMENT '综合评分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of supervisor_assessment
-- ----------------------------
INSERT INTO `supervisor_assessment` VALUES (1, '大学计算机软件应用', '10256', '新闻传播2103、播音2101', '2022-03-16', 6, '公共楼324', 47, 32, 0, '计算机学院', 2022, 66);
INSERT INTO `supervisor_assessment` VALUES (2, '程序设计语言', '10658', '机械大类1801', '2019-02-28', 3, '综合楼210', 30, 30, 0, '计算机学院', 2019, 85);

SET FOREIGN_KEY_CHECKS = 1;
