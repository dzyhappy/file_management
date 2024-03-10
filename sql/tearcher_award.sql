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

 Date: 09/03/2024 15:47:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tearcher_award
-- ----------------------------
DROP TABLE IF EXISTS `tearcher_award`;
CREATE TABLE `tearcher_award`  (
  `teacher_id` int NOT NULL,
  `award_id` int NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tearcher_award
-- ----------------------------
INSERT INTO `tearcher_award` VALUES (1, 1);
INSERT INTO `tearcher_award` VALUES (1, 2);
INSERT INTO `tearcher_award` VALUES (1, 408184857);
INSERT INTO `tearcher_award` VALUES (2, 408184857);

SET FOREIGN_KEY_CHECKS = 1;
