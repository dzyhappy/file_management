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

 Date: 15/09/2023 17:58:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for documents
-- ----------------------------
DROP TABLE IF EXISTS `documents`;
CREATE TABLE `documents`  (
  `id` int NOT NULL COMMENT '档案id',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案名称',
  `type_id` int NULL DEFAULT NULL COMMENT '档案类型id，使用去掉JX的纯数字代码',
  `file_location` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '存储路径',
  `overview` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案概述及备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `quick_name`(`name` ASC) USING BTREE COMMENT '档案名速查'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of documents
-- ----------------------------
INSERT INTO `documents` VALUES (1, '计算机学院教师信息表', 201, '保存路径', '计算机学院教师信息表');
INSERT INTO `documents` VALUES (2, '计算机学院竞赛奖励汇总', 602, '', '计算机学院竞赛奖励汇总（2021.11-2022.10）');
INSERT INTO `documents` VALUES (3, '教师培养汇总', 203, NULL, '教师培养汇总（2014-2023）');
INSERT INTO `documents` VALUES (4, '2023版本科人才培养方案-软件工程', 301, NULL, '2023版本科人才培养方案-软件工程');

SET FOREIGN_KEY_CHECKS = 1;
