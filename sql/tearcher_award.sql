/*
Navicat MySQL Data Transfer

Source Server         : whr
Source Server Version : 80032
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80032
File Encoding         : 65001

Date: 2024-03-07 21:58:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tearcher_award
-- ----------------------------
DROP TABLE IF EXISTS `tearcher_award`;
CREATE TABLE `tearcher_award` (
  `teacher_id` int NOT NULL,
  `award_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tearcher_award
-- ----------------------------
