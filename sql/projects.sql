/*
 Navicat Premium Data Transfer

 Source Server         : doucmnet
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : doucment

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 20/11/2023 20:07:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for projects
-- ----------------------------
DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects`  (
  `id` int(11) NOT NULL COMMENT '项目id',
  `project_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '项目名字',
  `description` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '项目描述',
  `start_date` date NULL DEFAULT NULL COMMENT '项目开始时间',
  `end_date` date NULL DEFAULT NULL COMMENT '项目结束时间',
  `teacher_id` int(11) NOT NULL COMMENT '项目负责人ID, 外键关联到教师表',
  `level` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '项目等级',
  `award` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '项目获取奖项',
  `software_works` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '项目软著情况',
  `software_works_photo` mediumtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL COMMENT '项目软著材料',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_ProjectLeader`(`teacher_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of projects
-- ----------------------------
INSERT INTO `projects` VALUES (1, '档案管理知识图谱系统', '基于知识图谱技术', '2023-11-20', NULL, 1, '国家级', '现无', '现无', '无');

SET FOREIGN_KEY_CHECKS = 1;
