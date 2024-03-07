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

 Date: 15/09/2023 17:59:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for type_details
-- ----------------------------
DROP TABLE IF EXISTS `type_details`;
CREATE TABLE `type_details`  (
  `id` int NOT NULL COMMENT '类型id',
  `type_id` int NULL DEFAULT NULL COMMENT '档案类型id，关联档案类型',
  `type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类型名称',
  `storage_age` int NULL DEFAULT NULL COMMENT '保管期限',
  `large_categories` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所属一级大类',
  `overview` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类型描述与备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `typeId`(`type_id` ASC) USING BTREE COMMENT '类型id速查'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type_details
-- ----------------------------
INSERT INTO `type_details` VALUES (1, 101, '规章制度', 10, '综合', '学校、学院有关教学工作的规章制度、实施细则等');
INSERT INTO `type_details` VALUES (2, 102, '计划总结', 10, '综合', '学院改革与发展规划，年度教学工作计划、总结等');
INSERT INTO `type_details` VALUES (3, 103, '会议材料', 999, '综合', '学院党委（党总支）会议、党政联席会议和学术委员会研究教学工作的会议记录以及会议纪要');
INSERT INTO `type_details` VALUES (4, 104, '其他文件', 10, '综合', '暂无');
INSERT INTO `type_details` VALUES (5, 201, '教师教学', 10, '教师队伍', '1.学院在编教师名册；2.学期主讲教师授课情况统计表；3.学期高职称教师为本科生上课情况；4.新开课和开新课教师试讲即审批材料');
INSERT INTO `type_details` VALUES (6, 202, '师德师风', 10, '教师队伍', '1.学院师德师风建设相关材料；2.师德师风优秀典型材料；3.师德师风失范行为处理过程、结果相关材料');
INSERT INTO `type_details` VALUES (7, 203, '教师培养', 10, '教师队伍', '1.教学团队建设相关材料；2.青年教师培养（含导师制）相关材料；3.教师年度国内外进修或培训相关材料');
INSERT INTO `type_details` VALUES (8, 204, '教师获奖', 10, '教师队伍', '1.教师参加各项竞赛、评选以及获奖材料；2.教师指导学生学科竞赛获奖情况相关材料');
INSERT INTO `type_details` VALUES (9, 205, '教师业务档案', 999, '教师队伍', '教师业务档案（学历、学位证书、教师资格证书、职称证书；承担教学任务情况、教研与科研情况，按人立券）');
INSERT INTO `type_details` VALUES (10, 206, '其他文件', 10, '教师队伍', '暂无');

SET FOREIGN_KEY_CHECKS = 1;
