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

 Date: 09/03/2024 15:47:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teachers_works
-- ----------------------------
DROP TABLE IF EXISTS `teachers_works`;
CREATE TABLE `teachers_works`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '作品id',
  `teacher_id` int NOT NULL COMMENT '教师id',
  `work_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '著作论文名称',
  `work_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '内容',
  `work_direction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '方向',
  `work_file` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '附件',
  `work_status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '1' COMMENT '状态',
  `publish_time` datetime NULL DEFAULT NULL COMMENT '发表时间',
  `record_time` datetime NULL DEFAULT NULL COMMENT '记录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teachers_works
-- ----------------------------
INSERT INTO `teachers_works` VALUES (1, 1, 'Mui Sum Wing', 'sYmOVioBmH', 'X182IHcSOb', '5lQVtKc4zS', '1', '2003-03-23 14:34:25', '2004-08-17 01:33:44');
INSERT INTO `teachers_works` VALUES (3, 1, 'aaa', 'vvv', 'ccc', 'voluptate', '1', '2012-04-03 01:18:34', '1997-01-07 17:07:45');

SET FOREIGN_KEY_CHECKS = 1;
