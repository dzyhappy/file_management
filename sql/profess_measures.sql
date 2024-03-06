/*
Navicat MySQL Data Transfer

Source Server         : whr
Source Server Version : 80032
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80032
File Encoding         : 65001

Date: 2023-12-13 16:48:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for profess_measures
-- ----------------------------
DROP TABLE IF EXISTS `profess_measures`;
CREATE TABLE `profess_measures` (
  `id` int NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '教师姓名',
  `teacher_id` int NOT NULL COMMENT '教师的工号',
  `file_id` int NOT NULL DEFAULT '1' COMMENT '文档id',
  `file_location` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '文档地址',
  `ad_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '优点的内容',
  `uad_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '缺点的内容',
  `create_time` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `update_time` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `profess_measures_t_improve_id_fk` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='培养措施路径存储';

-- ----------------------------
-- Records of profess_measures
-- ----------------------------
INSERT INTO `profess_measures` VALUES ('1', '旅人', '10086', '1', '#####', '写得很好', '下次不要再写了', '2023-12-12 20:23:52', '2023-12-13 16:03:13');
INSERT INTO `profess_measures` VALUES ('2', '旅人', '10086', '1', '#####', '非常好', '不是很好', '2023-12-13 16:43:09', '2023-12-13 16:43:11');
