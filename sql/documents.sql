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

 Date: 08/10/2023 16:20:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for documents
-- ----------------------------
DROP TABLE IF EXISTS `documents`;
CREATE TABLE `documents`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '档案id',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案名称',
  `type_id` int NULL DEFAULT NULL COMMENT '档案类型id，使用去掉JX的纯数字代码',
  `file_location` varchar(16001) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '存储路径',
  `overview` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '档案概述及备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `quick_name`(`name` ASC) USING BTREE COMMENT '档案名速查'
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of documents
-- ----------------------------
INSERT INTO `documents` VALUES (1, '计算机学院教师信息表', 201, 'abcdefg', '计算机学院教师信息表');
INSERT INTO `documents` VALUES (2, '计算机学院竞赛奖励汇总', 602, 'asdasdasd', '计算机学院竞赛奖励汇总（2021.11-2022.10）');
INSERT INTO `documents` VALUES (3, '教师培养汇总', 203, 'dfdsgfhgjhgj', '教师培养汇总（2014-2023）');
INSERT INTO `documents` VALUES (4, '2023版本科人才培养方案-软件工程', 301, 'ewrwtyghdfghgdf', '2023版本科人才培养方案-软件工程');
INSERT INTO `documents` VALUES (5, '2023上课计算机学院情况统计表', 201, 'dsfffdggggg', '2021级');
INSERT INTO `documents` VALUES (6, 'hahaha', 105, 'sadsafsdfg', 'hahaha');
INSERT INTO `documents` VALUES (9, '状百人元必', 8798, 'commodo ullamco ut', 'anim consequat sed irure sit');

SET FOREIGN_KEY_CHECKS = 1;
