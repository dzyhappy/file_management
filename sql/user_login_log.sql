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

 Date: 08/10/2023 16:20:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `user_login_log`;
CREATE TABLE `user_login_log`  (
  `id` int NOT NULL,
  `user_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `details` varchar(1200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_login_log
-- ----------------------------
INSERT INTO `user_login_log` VALUES (455, '1', '{\"accountNonExpired\":true,\"accountNonLocked\":true,\"credentialsNonExpired\":true,\"enabled\":true,\"password\":\"$2a$10$x0fIXpfvacqkxbqIG6HGyOfk/i5kWimES062rJZwowMiQEkJwcu72\",\"permissions\":[\"admin\"],\"user\":{\"authentication\":\"admin\",\"createTime\":1694778137000,\"headerUrl\":\"/upload/avatar/avatar_1.jpg\",\"id\":1,\"password\":\"$2a$10$x0fIXpfvacqkxbqIG6HGyOfk/i5kWimES062rJZwowMiQEkJwcu72\",\"username\":\"wls\"},\"username\":\"wls\"}');

SET FOREIGN_KEY_CHECKS = 1;
