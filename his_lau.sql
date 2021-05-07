/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50641
Source Host           : localhost:3306
Source Database       : his_lau

Target Server Type    : MYSQL
Target Server Version : 50641
File Encoding         : 65001

Date: 2021-05-06 23:33:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for daymoney
-- ----------------------------
DROP TABLE IF EXISTS `daymoney`;
CREATE TABLE `daymoney` (
  `dayid` int(11) NOT NULL AUTO_INCREMENT,
  `daytime` varchar(10) DEFAULT NULL,
  `daymoney` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dayid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of daymoney
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `deid` int(11) NOT NULL AUTO_INCREMENT,
  `dename` varchar(40) DEFAULT NULL,
  `detype` varchar(20) DEFAULT NULL,
  `decategory` varchar(20) DEFAULT '临床',
  PRIMARY KEY (`deid`)
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '门诊风湿免疫科', '内科', '临床');
INSERT INTO `department` VALUES ('2', '门诊血液内科', '内科', '临床');
INSERT INTO `department` VALUES ('3', '门诊肾脏内科', '内科', '临床');
INSERT INTO `department` VALUES ('4', '门诊消化内科', '内科', '临床');
INSERT INTO `department` VALUES ('5', '门诊神经内科', '内科', '临床');
INSERT INTO `department` VALUES ('6', '门诊感染科', '内科', '临床');
INSERT INTO `department` VALUES ('7', '门诊心血管内科', '内科', '临床');
INSERT INTO `department` VALUES ('8', '门诊呼吸与危重症医学', '内科', '临床');
INSERT INTO `department` VALUES ('9', '门诊内分泌科', '内科', '临床');
INSERT INTO `department` VALUES ('10', '门诊肿瘤内科', '内科', '临床');
INSERT INTO `department` VALUES ('11', '门诊骨科', '外科', '临床');
INSERT INTO `department` VALUES ('12', '门诊运动医学科', '外科', '临床');
INSERT INTO `department` VALUES ('13', '门诊胸外科', '外科', '临床');
INSERT INTO `department` VALUES ('14', '门诊神经外科', '外科', '临床');
INSERT INTO `department` VALUES ('15', '门诊烧伤科', '外科', '临床');
INSERT INTO `department` VALUES ('16', '门诊泌尿外科', '外科', '临床');
INSERT INTO `department` VALUES ('17', '门诊血管外科', '外科', '临床');
INSERT INTO `department` VALUES ('18', '门诊普通外科', '外科', '临床');
INSERT INTO `department` VALUES ('19', '门诊肝胆外科', '外科', '临床');
INSERT INTO `department` VALUES ('20', '门诊胰胆外科', '外科', '临床');
INSERT INTO `department` VALUES ('21', '门诊胃肠外科', '外科', '临床');
INSERT INTO `department` VALUES ('22', '门诊器官移植外科', '外科', '临床');
INSERT INTO `department` VALUES ('23', '门诊心脏外科', '外科', '临床');
INSERT INTO `department` VALUES ('24', '门诊整形外科', '外科', '临床');
INSERT INTO `department` VALUES ('25', '甲状腺外科', '外科', '临床');
INSERT INTO `department` VALUES ('26', '门诊肛肠外科', '外科', '临床');
INSERT INTO `department` VALUES ('27', '门诊乳腺科', '外科', '临床');
INSERT INTO `department` VALUES ('28', '胃肠肿瘤外科', '外科', '临床');
INSERT INTO `department` VALUES ('29', '门诊脊柱畸形专科', '外科', '临床');
INSERT INTO `department` VALUES ('30', '神经介入门诊', '外科', '临床');
INSERT INTO `department` VALUES ('31', '介入放射科', '外科', '临床');
INSERT INTO `department` VALUES ('32', '穿刺活检门诊', '外科', '临床');
INSERT INTO `department` VALUES ('33', '著名专家儿科', '著名专家', '临床');
INSERT INTO `department` VALUES ('34', '著名专家中医科', '著名专家', '临床');
INSERT INTO `department` VALUES ('35', '著名专家神经外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('36', '著名专家放射治疗科', '著名专家', '临床');
INSERT INTO `department` VALUES ('37', '著名专家骨科', '著名专家', '临床');
INSERT INTO `department` VALUES ('38', '著名专家胸外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('39', '著名专家肿瘤外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('40', '著名专家眼科', '著名专家', '临床');
INSERT INTO `department` VALUES ('41', '著名专家感染', '著名专家', '临床');
INSERT INTO `department` VALUES ('42', '著名专家消化内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('43', '著名专家血液内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('44', '著名专家核医学', '著名专家', '临床');
INSERT INTO `department` VALUES ('45', '著名专家心脏外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('46', '著名专家神经内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('47', '著名专家妇科', '著名专家', '临床');
INSERT INTO `department` VALUES ('48', '著名专家泌尿外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('49', '著名专家内分泌', '著名专家', '临床');
INSERT INTO `department` VALUES ('50', '著名专家介入血管科', '著名专家', '临床');
INSERT INTO `department` VALUES ('51', '著名专家心血管内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('52', '著名专家整形外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('53', '著名专家皮肤科', '著名专家', '临床');
INSERT INTO `department` VALUES ('54', '著名专家耳鼻喉科', '著名专家', '临床');
INSERT INTO `department` VALUES ('55', '著名专家心理门诊', '著名专家', '临床');
INSERT INTO `department` VALUES ('56', '著名专家肾脏内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('57', '著名专家呼吸内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('58', '著名专家风湿免疫', '著名专家', '临床');
INSERT INTO `department` VALUES ('59', '著名专家普外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('60', '著名专家病理', '著名专家', '临床');
INSERT INTO `department` VALUES ('61', '著名专家放射线科', '著名专家', '临床');
INSERT INTO `department` VALUES ('62', '著名专家超声', '著名专家', '临床');
INSERT INTO `department` VALUES ('63', '著名专家乳腺', '著名专家', '临床');
INSERT INTO `department` VALUES ('64', '著名专家产科', '著名专家', '临床');
INSERT INTO `department` VALUES ('65', '著名专家心功能', '著名专家', '临床');
INSERT INTO `department` VALUES ('66', '著名专家内窥镜', '著名专家', '临床');
INSERT INTO `department` VALUES ('67', '著名专家运动医学', '著名专家', '临床');
INSERT INTO `department` VALUES ('68', '著名专家传染', '著名专家', '临床');
INSERT INTO `department` VALUES ('69', '著名专家介入科', '著名专家', '临床');
INSERT INTO `department` VALUES ('70', '著名专家老年病门诊', '著名专家', '临床');
INSERT INTO `department` VALUES ('71', '著名专家肝胆外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('72', '著名专家胰胆外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('73', '著名专家肿瘤内科', '著名专家', '临床');
INSERT INTO `department` VALUES ('74', '著名专家胃肠肿瘤外科', '著名专家', '临床');
INSERT INTO `department` VALUES ('75', '著名专家心血管超声科', '著名专家', '临床');
INSERT INTO `department` VALUES ('76', '门诊耳鼻喉科', '五官', '临床');
INSERT INTO `department` VALUES ('77', '门诊眼科', '五官', '临床');
INSERT INTO `department` VALUES ('78', '门诊妇科', '妇产科', '临床');
INSERT INTO `department` VALUES ('79', '门诊产科', '妇产科', '临床');
INSERT INTO `department` VALUES ('80', '妇科围绝经期门诊', '妇产科', '临床');
INSERT INTO `department` VALUES ('81', '门诊儿科', '门诊新生儿科', '临床');
INSERT INTO `department` VALUES ('82', '麻醉评估门诊', '其他', '临床');
INSERT INTO `department` VALUES ('83', '门诊康复医学科', '其他', '临床');
INSERT INTO `department` VALUES ('84', '门诊皮肤科', '其他', '临床');
INSERT INTO `department` VALUES ('85', '全科医学科门诊', '其他', '临床');
INSERT INTO `department` VALUES ('86', '健康管理咨询门诊', '其他', '临床');
INSERT INTO `department` VALUES ('87', '肾内科透析门诊', '其他', '临床');
INSERT INTO `department` VALUES ('88', '心理门诊', '其他', '临床');
INSERT INTO `department` VALUES ('89', '门诊中医科', '其他', '临床');
INSERT INTO `department` VALUES ('90', '老年病门诊', '其他', '临床');
INSERT INTO `department` VALUES ('91', '病理科诊断室', '其他', '临床');
INSERT INTO `department` VALUES ('92', '疼痛门诊', '其他', '临床');
INSERT INTO `department` VALUES ('93', '门诊放射治疗科', '其他', '临床');
INSERT INTO `department` VALUES ('94', '营养科门诊', '其他', '临床');
INSERT INTO `department` VALUES ('95', '核医学科门诊诊疗室', '其他', '临床');
INSERT INTO `department` VALUES ('96', '肝病门诊', '其他', '临床');
INSERT INTO `department` VALUES ('97', '关爱诊室', '其他', '临床');
INSERT INTO `department` VALUES ('98', '高压氧舱科', '其他', '临床');
INSERT INTO `department` VALUES ('99', '胃病监控门诊', '其他', '临床');
INSERT INTO `department` VALUES ('100', '营养门诊（孕产）', '其他', '临床');
INSERT INTO `department` VALUES ('101', '整形外科美容门诊', '其他', '临床');
INSERT INTO `department` VALUES ('102', '血液透析通路门诊', '其他', '临床');
INSERT INTO `department` VALUES ('103', '门诊内窥镜', '其他', '临床');
INSERT INTO `department` VALUES ('104', '核酸检测门诊', '核酸检测门诊', '临床');
INSERT INTO `department` VALUES ('105', '门诊老年综合科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('106', '门诊老年消化内科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('107', '门诊老年呼吸感染科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('108', '门诊老年心血管内科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('109', '门诊老年神经内科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('110', '门诊老年内分泌科', '老年医学科', '临床');
INSERT INTO `department` VALUES ('111', '干诊心内科', '干诊', '临床');
INSERT INTO `department` VALUES ('112', '干诊神经内科', '干诊', '临床');
INSERT INTO `department` VALUES ('113', '干诊普通外科', '干诊', '临床');
INSERT INTO `department` VALUES ('114', '干诊普通内科', '干诊', '临床');
INSERT INTO `department` VALUES ('115', '干诊肝胆内科', '干诊', '临床');
INSERT INTO `department` VALUES ('116', '干诊消化内科', '干诊', '临床');
INSERT INTO `department` VALUES ('117', '干诊体检科', '干诊', '临床');
INSERT INTO `department` VALUES ('118', '急诊普通外科', '急诊', '临床');
INSERT INTO `department` VALUES ('119', '急诊普通内科', '急诊', '临床');
INSERT INTO `department` VALUES ('120', '急诊消化科', '急诊', '临床');
INSERT INTO `department` VALUES ('121', '急诊皮肤科', '急诊', '临床');
INSERT INTO `department` VALUES ('122', '卒中科', '卒中', '临床');
INSERT INTO `department` VALUES ('123', '管理科', '管理', '非临床');
INSERT INTO `department` VALUES ('124', '收费科', '收费', '临床');
INSERT INTO `department` VALUES ('125', '药房科', '药房', '临床');

-- ----------------------------
-- Table structure for diagnosis
-- ----------------------------
DROP TABLE IF EXISTS `diagnosis`;
CREATE TABLE `diagnosis` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(10) DEFAULT NULL,
  `dpinyin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of diagnosis
-- ----------------------------
INSERT INTO `diagnosis` VALUES ('1', '高血压', 'GXY');
INSERT INTO `diagnosis` VALUES ('2', '高血脂', 'GXZ');
INSERT INTO `diagnosis` VALUES ('3', '二尖瓣关闭不全', 'EJBGBBQ');
INSERT INTO `diagnosis` VALUES ('4', '偏头痛', 'PTT');
INSERT INTO `diagnosis` VALUES ('5', '胃癌', 'WA');
INSERT INTO `diagnosis` VALUES ('6', '便秘', 'BM');
INSERT INTO `diagnosis` VALUES ('7', '脂肪肝', 'ZFG');
INSERT INTO `diagnosis` VALUES ('8', '甲亢', 'JK');
INSERT INTO `diagnosis` VALUES ('9', '肺癌', 'FA');
INSERT INTO `diagnosis` VALUES ('10', '艾滋病', 'AZB');
INSERT INTO `diagnosis` VALUES ('11', '前列腺炎', 'QLXY');
INSERT INTO `diagnosis` VALUES ('12', '贫血', 'PX');
INSERT INTO `diagnosis` VALUES ('13', '乳腺癌', 'RXA');
INSERT INTO `diagnosis` VALUES ('14', '新生儿黄疸', 'XSEHD');
INSERT INTO `diagnosis` VALUES ('15', '白癜风', 'BDF');
INSERT INTO `diagnosis` VALUES ('16', '颈椎病', 'ZZB');
INSERT INTO `diagnosis` VALUES ('17', '口腔溃疡', 'ZQKY');
INSERT INTO `diagnosis` VALUES ('18', '白内障', 'BNZ');
INSERT INTO `diagnosis` VALUES ('19', '尖锐湿疣', 'ZRSY');
INSERT INTO `diagnosis` VALUES ('20', '痤疮', 'CC');
INSERT INTO `diagnosis` VALUES ('21', '红斑狼疹', 'HBLZ');
INSERT INTO `diagnosis` VALUES ('22', '过敏', 'GM');
INSERT INTO `diagnosis` VALUES ('23', '脂溢性皮炎', 'ZYXPY');
INSERT INTO `diagnosis` VALUES ('24', '冠心病', 'GXB');
INSERT INTO `diagnosis` VALUES ('25', '糖尿病', 'TNB');
INSERT INTO `diagnosis` VALUES ('26', '哮喘', 'XC');
INSERT INTO `diagnosis` VALUES ('27', '乙肝', 'YG');
INSERT INTO `diagnosis` VALUES ('28', '胆结石', 'DJS');
INSERT INTO `diagnosis` VALUES ('29', '小儿肺炎', 'XRFY');
INSERT INTO `diagnosis` VALUES ('30', '手足口病', 'SZKB');
INSERT INTO `diagnosis` VALUES ('31', '牛皮癣', 'NPX');
INSERT INTO `diagnosis` VALUES ('32', '湿疹', 'SZ');
INSERT INTO `diagnosis` VALUES ('33', '类风湿关节炎', 'LFSGJY');
INSERT INTO `diagnosis` VALUES ('34', '腰间盘突出', 'YJPTC');
INSERT INTO `diagnosis` VALUES ('35', '神经性皮炎', 'SJXPY');
INSERT INTO `diagnosis` VALUES ('36', '激素依赖性皮炎', 'JSYLXPY');
INSERT INTO `diagnosis` VALUES ('37', '皮肤发育不良', 'PFFYBL');
INSERT INTO `diagnosis` VALUES ('38', '小儿支气管炎', 'XRZQGY');
INSERT INTO `diagnosis` VALUES ('39', '小儿贫血', 'XRPX');
INSERT INTO `diagnosis` VALUES ('40', '小儿腹泻', 'XRFX');
INSERT INTO `diagnosis` VALUES ('41', '自闭症', 'ZBZ');
INSERT INTO `diagnosis` VALUES ('42', '血液病', 'XYB');
INSERT INTO `diagnosis` VALUES ('43', '产后出血', 'CHCX');
INSERT INTO `diagnosis` VALUES ('44', '感冒', 'GM');
INSERT INTO `diagnosis` VALUES ('45', '中暑', 'ZS');
INSERT INTO `diagnosis` VALUES ('46', '支气管扩张', 'ZQGKZ');
INSERT INTO `diagnosis` VALUES ('47', '肺炎', 'FY');
INSERT INTO `diagnosis` VALUES ('48', '胸膜炎', 'XMY');
INSERT INTO `diagnosis` VALUES ('49', 'POEMS综合症', 'POEMSZHZ');
INSERT INTO `diagnosis` VALUES ('50', '支气管炎', 'ZQGY');
INSERT INTO `diagnosis` VALUES ('51', '肥胖症', 'FPZ');
INSERT INTO `diagnosis` VALUES ('52', '心绞痛', 'XJT');
INSERT INTO `diagnosis` VALUES ('53', '动脉导管未闭', 'ZMDGWB');
INSERT INTO `diagnosis` VALUES ('54', '肺动脉高压', 'FDMGY');
INSERT INTO `diagnosis` VALUES ('55', '心脏神经官能症', 'XZSJGNZ');
INSERT INTO `diagnosis` VALUES ('56', '慢性阻塞性肺病', 'MXZSXFB');
INSERT INTO `diagnosis` VALUES ('57', '内伤发热', 'NSFR');
INSERT INTO `diagnosis` VALUES ('58', '农民肺', 'NMF');
INSERT INTO `diagnosis` VALUES ('59', 'COVID-19', 'COVID-19');
INSERT INTO `diagnosis` VALUES ('60', '内脏利什曼病', 'NZLSMB');
INSERT INTO `diagnosis` VALUES ('61', '气单胞菌肺炎', 'QDPJFY');
INSERT INTO `diagnosis` VALUES ('62', '蛔虫性肠梗阻', 'HCXCGZ');
INSERT INTO `diagnosis` VALUES ('63', '起搏器综合征', 'QBQZHZ');
INSERT INTO `diagnosis` VALUES ('64', '全身黏液性水肿', 'QSNYXSZ');
INSERT INTO `diagnosis` VALUES ('65', 'Poncet综合征', 'PONCETZHZ');
INSERT INTO `diagnosis` VALUES ('66', '黄曲霉素中毒', 'HQMSZD');
INSERT INTO `diagnosis` VALUES ('67', '脑膜炎奈瑟菌肺炎', 'NOYNSJFY');
INSERT INTO `diagnosis` VALUES ('68', '蛔虫性急性胰腺炎', 'HCXJXYXY');
INSERT INTO `diagnosis` VALUES ('69', '尿毒症性心包炎', 'NDZXXBY');
INSERT INTO `diagnosis` VALUES ('70', '黏多糖贮积症Ⅰ型', 'NDTZJRZYX');
INSERT INTO `diagnosis` VALUES ('71', '青年心肌梗死', 'QNXJGS');
INSERT INTO `diagnosis` VALUES ('72', '气管闭合性损伤', 'QGBHXSS');
INSERT INTO `diagnosis` VALUES ('73', '黏脂贮积症Ⅲ型', 'NZZJRZSX');
INSERT INTO `diagnosis` VALUES ('74', '急性出血坏死型胰腺炎', 'JXCXHSXYXY');
INSERT INTO `diagnosis` VALUES ('75', '黏多糖贮积症Ⅱ型', 'NDTZJRZRX');
INSERT INTO `diagnosis` VALUES ('76', '气管、支气管狭窄', 'QGZQGXZ');
INSERT INTO `diagnosis` VALUES ('77', '铍中毒', 'BZD');
INSERT INTO `diagnosis` VALUES ('78', '惠普尔病', 'HPRB');
INSERT INTO `diagnosis` VALUES ('79', '回盲瓣综合征', 'HMBZHZ');
INSERT INTO `diagnosis` VALUES ('80', '气管前间隙感染', 'QGQJXGR');
INSERT INTO `diagnosis` VALUES ('81', '三尖瓣狭窄', 'SJBXZ');
INSERT INTO `diagnosis` VALUES ('82', '急性单纯性胃炎', 'JXDCXWY');
INSERT INTO `diagnosis` VALUES ('83', '急性出血性坏死性肠炎', 'JXCXXHSXCY');
INSERT INTO `diagnosis` VALUES ('84', '热入血室', 'RRXS');
INSERT INTO `diagnosis` VALUES ('85', '缺血性心肌病', 'QXXXJB');
INSERT INTO `diagnosis` VALUES ('86', '急性腹膜炎', 'JXFMY');
INSERT INTO `diagnosis` VALUES ('87', '妊娠合并原发性高血压', 'RCHBYFXGXY');
INSERT INTO `diagnosis` VALUES ('88', '妊娠合并心室间隔缺损', 'RCHBXSJGQS');
INSERT INTO `diagnosis` VALUES ('89', '妊娠合并血栓性疾病', 'RCHBXSXJB');
INSERT INTO `diagnosis` VALUES ('90', '霍乱样综合征', 'HLYZHZ');
INSERT INTO `diagnosis` VALUES ('91', '尿毒症肺炎', 'NDZFY');
INSERT INTO `diagnosis` VALUES ('92', '气管支气管异物', 'QGZQGYW');
INSERT INTO `diagnosis` VALUES ('93', '气管食管瘘', 'QGSGL');
INSERT INTO `diagnosis` VALUES ('94', '畸形性吞咽困难', 'JXXTYKN');
INSERT INTO `diagnosis` VALUES ('95', '沙眼衣原体肺炎', 'SYYYTFY');
INSERT INTO `diagnosis` VALUES ('96', '气管先天性疾病', 'QGXTXJB');
INSERT INTO `diagnosis` VALUES ('97', '妊娠期心脏病', 'RCQXZB');
INSERT INTO `diagnosis` VALUES ('98', 'Q热肺炎', 'QRFY');
INSERT INTO `diagnosis` VALUES ('99', '急性化脓性胃炎', 'JXHNXFY');
INSERT INTO `diagnosis` VALUES ('100', '急性胆囊炎', 'JXDNY');
INSERT INTO `diagnosis` VALUES ('101', '伤寒性心肌炎', 'SHXXJY');
INSERT INTO `diagnosis` VALUES ('102', '上腔静脉综合征', 'SQJMZHZ');
INSERT INTO `diagnosis` VALUES ('103', '三房心', 'SFX');
INSERT INTO `diagnosis` VALUES ('104', '智商低下', 'ZSDX');
INSERT INTO `diagnosis` VALUES ('105', '弱智', 'RZ');

-- ----------------------------
-- Table structure for doctordrugrecord
-- ----------------------------
DROP TABLE IF EXISTS `doctordrugrecord`;
CREATE TABLE `doctordrugrecord` (
  `ddrid` varchar(20) NOT NULL,
  `ddrmrid` int(10) DEFAULT NULL,
  `ddrduid` int(10) DEFAULT NULL,
  `ddrdid` varchar(20) DEFAULT NULL,
  `ddrtime` datetime DEFAULT NULL,
  PRIMARY KEY (`ddrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctordrugrecord
-- ----------------------------
INSERT INTO `doctordrugrecord` VALUES ('ddr1', '4', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr10', '1', null, 'dr11', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr11', '6', null, 'dr6', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr12', '6', null, 'dr7', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr13', '6', null, 'dr14', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr14', '6', null, 'dr10', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr15', '6', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr16', '6', null, 'dr12', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr17', '6', null, 'dr15', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr18', '6', null, 'dr16', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr19', '6', null, 'dr9', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr2', '4', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr20', '6', null, 'dr7', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr3', '4', null, 'dr10', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr4', '4', null, 'dr13', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr5', '4', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr6', '1', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr7', '2', null, 'dr13', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr8', '1', null, 'dr1', null);
INSERT INTO `doctordrugrecord` VALUES ('ddr9', '1', null, 'dr11', null);

-- ----------------------------
-- Table structure for doctorinspectionrecord
-- ----------------------------
DROP TABLE IF EXISTS `doctorinspectionrecord`;
CREATE TABLE `doctorinspectionrecord` (
  `dirid` varchar(20) NOT NULL,
  `dirmrid` int(10) DEFAULT NULL,
  `dirduid` int(10) DEFAULT NULL,
  `diriid` varchar(20) DEFAULT NULL,
  `dirtime` datetime DEFAULT NULL,
  PRIMARY KEY (`dirid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctorinspectionrecord
-- ----------------------------
INSERT INTO `doctorinspectionrecord` VALUES ('dir1', '4', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir10', '4', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir11', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir12', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir13', '4', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir14', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir15', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir16', '4', null, 'i4', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir17', '4', null, 'i5', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir18', '4', null, 'i6', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir19', '4', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir2', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir20', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir21', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir22', '4', null, 'i5', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir23', '4', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir24', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir25', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir26', '1', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir27', '1', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir28', '2', null, 'i0', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir29', '2', null, 'i1', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir3', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir30', '2', null, 'i0', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir31', '5', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir32', '6', null, 'i4', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir33', '6', null, 'i5', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir34', '6', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir35', '6', null, 'i6', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir36', '6', null, 'i0', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir37', '6', null, 'i6', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir38', '6', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir39', '6', null, 'i0', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir4', '4', null, 'i4', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir5', '4', null, 'i5', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir6', '4', null, 'i6', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir7', '4', null, 'i2', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir8', '4', null, 'i3', null);
INSERT INTO `doctorinspectionrecord` VALUES ('dir9', '4', null, 'i1', null);

-- ----------------------------
-- Table structure for doctorloginrecord
-- ----------------------------
DROP TABLE IF EXISTS `doctorloginrecord`;
CREATE TABLE `doctorloginrecord` (
  `dlrid` int(11) NOT NULL AUTO_INCREMENT,
  `dlrdid` int(11) DEFAULT NULL,
  `dlrtime` datetime DEFAULT NULL,
  PRIMARY KEY (`dlrid`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctorloginrecord
-- ----------------------------
INSERT INTO `doctorloginrecord` VALUES ('1', '29', '2021-02-26 11:09:25');
INSERT INTO `doctorloginrecord` VALUES ('2', '29', '2021-02-27 08:09:19');
INSERT INTO `doctorloginrecord` VALUES ('3', '29', '2021-02-27 08:48:49');
INSERT INTO `doctorloginrecord` VALUES ('4', '29', '2021-02-27 14:34:51');
INSERT INTO `doctorloginrecord` VALUES ('5', '29', '2021-02-27 16:26:54');
INSERT INTO `doctorloginrecord` VALUES ('6', '29', '2021-02-27 16:28:32');
INSERT INTO `doctorloginrecord` VALUES ('7', '29', '2021-02-27 16:29:38');
INSERT INTO `doctorloginrecord` VALUES ('8', '29', '2021-02-27 16:30:36');
INSERT INTO `doctorloginrecord` VALUES ('9', '29', '2021-02-27 16:32:03');
INSERT INTO `doctorloginrecord` VALUES ('10', '29', '2021-02-27 16:34:51');
INSERT INTO `doctorloginrecord` VALUES ('11', '29', '2021-02-27 16:36:17');
INSERT INTO `doctorloginrecord` VALUES ('12', '29', '2021-02-27 16:42:36');
INSERT INTO `doctorloginrecord` VALUES ('13', '29', '2021-02-27 16:45:40');
INSERT INTO `doctorloginrecord` VALUES ('14', '29', '2021-02-27 16:46:23');
INSERT INTO `doctorloginrecord` VALUES ('15', '29', '2021-02-28 05:17:48');
INSERT INTO `doctorloginrecord` VALUES ('16', '29', '2021-02-28 05:50:53');
INSERT INTO `doctorloginrecord` VALUES ('17', '29', '2021-02-28 05:58:42');
INSERT INTO `doctorloginrecord` VALUES ('18', '29', '2021-02-28 06:00:18');
INSERT INTO `doctorloginrecord` VALUES ('19', '29', '2021-02-28 08:08:48');
INSERT INTO `doctorloginrecord` VALUES ('20', '29', '2021-02-28 08:20:41');
INSERT INTO `doctorloginrecord` VALUES ('21', '29', '2021-02-28 08:28:58');
INSERT INTO `doctorloginrecord` VALUES ('22', '29', '2021-02-28 08:31:21');
INSERT INTO `doctorloginrecord` VALUES ('23', '29', '2021-02-28 12:07:01');
INSERT INTO `doctorloginrecord` VALUES ('24', '29', '2021-02-28 13:58:09');
INSERT INTO `doctorloginrecord` VALUES ('25', '29', '2021-03-01 17:19:23');
INSERT INTO `doctorloginrecord` VALUES ('26', '29', '2021-03-02 08:53:18');
INSERT INTO `doctorloginrecord` VALUES ('27', '29', '2021-03-02 13:32:34');
INSERT INTO `doctorloginrecord` VALUES ('28', '29', '2021-03-02 16:47:45');
INSERT INTO `doctorloginrecord` VALUES ('29', '29', '2021-03-02 19:15:14');
INSERT INTO `doctorloginrecord` VALUES ('30', '29', '2021-03-03 08:53:07');
INSERT INTO `doctorloginrecord` VALUES ('31', '29', '2021-03-03 14:57:37');
INSERT INTO `doctorloginrecord` VALUES ('32', '29', '2021-03-04 09:52:52');
INSERT INTO `doctorloginrecord` VALUES ('33', '29', '2021-03-04 11:28:02');
INSERT INTO `doctorloginrecord` VALUES ('34', '29', '2021-03-04 17:58:02');
INSERT INTO `doctorloginrecord` VALUES ('35', '29', '2021-03-04 18:20:13');
INSERT INTO `doctorloginrecord` VALUES ('36', '29', '2021-03-05 08:53:21');
INSERT INTO `doctorloginrecord` VALUES ('37', '29', '2021-03-05 13:18:10');
INSERT INTO `doctorloginrecord` VALUES ('38', '29', '2021-03-05 20:44:36');
INSERT INTO `doctorloginrecord` VALUES ('39', '29', '2021-03-07 16:40:57');
INSERT INTO `doctorloginrecord` VALUES ('40', '29', '2021-03-09 13:25:05');
INSERT INTO `doctorloginrecord` VALUES ('41', '29', '2021-03-09 18:32:57');
INSERT INTO `doctorloginrecord` VALUES ('42', '29', '2021-03-16 14:23:16');
INSERT INTO `doctorloginrecord` VALUES ('43', '29', '2021-03-16 14:50:01');
INSERT INTO `doctorloginrecord` VALUES ('44', '29', '2021-04-06 15:26:19');
INSERT INTO `doctorloginrecord` VALUES ('45', '29', '2021-04-07 19:43:38');
INSERT INTO `doctorloginrecord` VALUES ('46', '29', '2021-04-17 19:31:52');
INSERT INTO `doctorloginrecord` VALUES ('47', '29', '2021-05-01 12:39:28');
INSERT INTO `doctorloginrecord` VALUES ('48', '29', '2021-05-06 16:14:13');
INSERT INTO `doctorloginrecord` VALUES ('49', '29', '2021-05-06 16:17:48');
INSERT INTO `doctorloginrecord` VALUES ('50', '29', '2021-05-06 16:19:12');
INSERT INTO `doctorloginrecord` VALUES ('51', '29', '2021-05-06 16:19:37');
INSERT INTO `doctorloginrecord` VALUES ('52', '29', '2021-05-06 16:19:41');
INSERT INTO `doctorloginrecord` VALUES ('53', '27', '2021-05-06 16:20:32');
INSERT INTO `doctorloginrecord` VALUES ('54', '29', '2021-05-06 16:21:45');
INSERT INTO `doctorloginrecord` VALUES ('55', '29', '2021-05-06 16:23:16');
INSERT INTO `doctorloginrecord` VALUES ('56', '29', '2021-05-06 16:23:30');
INSERT INTO `doctorloginrecord` VALUES ('57', '29', '2021-05-06 16:30:00');
INSERT INTO `doctorloginrecord` VALUES ('58', '29', '2021-05-06 16:30:01');
INSERT INTO `doctorloginrecord` VALUES ('59', '29', '2021-05-06 16:31:43');
INSERT INTO `doctorloginrecord` VALUES ('60', '29', '2021-05-06 16:47:02');
INSERT INTO `doctorloginrecord` VALUES ('61', '29', '2021-05-06 16:48:29');
INSERT INTO `doctorloginrecord` VALUES ('62', '29', '2021-05-06 17:49:42');
INSERT INTO `doctorloginrecord` VALUES ('63', '29', '2021-05-06 19:00:14');
INSERT INTO `doctorloginrecord` VALUES ('64', '29', '2021-05-06 19:01:42');

-- ----------------------------
-- Table structure for doctornodrugrecord
-- ----------------------------
DROP TABLE IF EXISTS `doctornodrugrecord`;
CREATE TABLE `doctornodrugrecord` (
  `dndrid` varchar(20) NOT NULL,
  `dndrmrid` int(10) DEFAULT NULL,
  `dndrduid` int(10) DEFAULT NULL,
  `dndrndid` varchar(20) DEFAULT NULL,
  `dndrtime` datetime DEFAULT NULL,
  PRIMARY KEY (`dndrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctornodrugrecord
-- ----------------------------
INSERT INTO `doctornodrugrecord` VALUES ('dndr1', '1', null, 'ndr14', '2021-04-06 16:38:39');
INSERT INTO `doctornodrugrecord` VALUES ('dndr2', '1', null, 'ndr14', '2021-04-06 16:47:59');
INSERT INTO `doctornodrugrecord` VALUES ('dndr3', '1', null, 'ndr1', '2021-04-06 16:47:59');
INSERT INTO `doctornodrugrecord` VALUES ('dndr4', '1', null, 'ndr15', '2021-04-06 16:47:59');
INSERT INTO `doctornodrugrecord` VALUES ('dndr5', '2', null, 'ndr7', '2021-04-06 16:50:05');
INSERT INTO `doctornodrugrecord` VALUES ('dndr6', '2', null, 'ndr13', '2021-04-06 17:07:28');
INSERT INTO `doctornodrugrecord` VALUES ('dndr7', '4', null, 'ndr10', null);
INSERT INTO `doctornodrugrecord` VALUES ('dndr8', '4', null, 'ndr10', null);
INSERT INTO `doctornodrugrecord` VALUES ('dndr9', '6', null, 'ndr13', null);

-- ----------------------------
-- Table structure for doctororder
-- ----------------------------
DROP TABLE IF EXISTS `doctororder`;
CREATE TABLE `doctororder` (
  `doid` int(11) NOT NULL AUTO_INCREMENT,
  `doweek` int(5) DEFAULT NULL,
  `doDuid` int(11) DEFAULT NULL,
  `dotype` int(5) DEFAULT NULL,
  `donum` int(5) DEFAULT NULL,
  `doediton` varchar(10) DEFAULT NULL,
  `doperson` int(11) DEFAULT NULL,
  `dodeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`doid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctororder
-- ----------------------------

-- ----------------------------
-- Table structure for doctororderhistory
-- ----------------------------
DROP TABLE IF EXISTS `doctororderhistory`;
CREATE TABLE `doctororderhistory` (
  `dohid` int(11) NOT NULL AUTO_INCREMENT,
  `dohweek` int(5) DEFAULT NULL,
  `dohDuid` int(11) DEFAULT NULL,
  `dohtype` int(5) DEFAULT NULL,
  `dohnum` int(5) DEFAULT NULL,
  `dohtime` datetime DEFAULT NULL,
  `dohediton` varchar(10) DEFAULT NULL,
  `doholdid` int(11) DEFAULT NULL,
  `dohperson` int(11) DEFAULT NULL,
  `dohdeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`dohid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctororderhistory
-- ----------------------------

-- ----------------------------
-- Table structure for doctortestrecord
-- ----------------------------
DROP TABLE IF EXISTS `doctortestrecord`;
CREATE TABLE `doctortestrecord` (
  `dtrid` varchar(20) NOT NULL,
  `dtrmrid` int(10) DEFAULT NULL,
  `dtrduid` int(10) DEFAULT NULL,
  `dtrtid` varchar(20) DEFAULT NULL,
  `dtrtime` datetime DEFAULT NULL,
  PRIMARY KEY (`dtrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctortestrecord
-- ----------------------------
INSERT INTO `doctortestrecord` VALUES ('dtr1', '4', null, 't1', null);
INSERT INTO `doctortestrecord` VALUES ('dtr10', '4', null, 't9', null);
INSERT INTO `doctortestrecord` VALUES ('dtr11', '4', null, 't1', null);
INSERT INTO `doctortestrecord` VALUES ('dtr12', '4', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr13', '4', null, 't1', null);
INSERT INTO `doctortestrecord` VALUES ('dtr14', '4', null, 't10', null);
INSERT INTO `doctortestrecord` VALUES ('dtr15', '4', null, 't7', null);
INSERT INTO `doctortestrecord` VALUES ('dtr16', '4', null, 't8', null);
INSERT INTO `doctortestrecord` VALUES ('dtr17', '4', null, 't9', null);
INSERT INTO `doctortestrecord` VALUES ('dtr18', '4', null, 't1', null);
INSERT INTO `doctortestrecord` VALUES ('dtr19', '4', null, 't10', null);
INSERT INTO `doctortestrecord` VALUES ('dtr2', '4', null, 't10', null);
INSERT INTO `doctortestrecord` VALUES ('dtr20', '4', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr21', '4', null, 't3', null);
INSERT INTO `doctortestrecord` VALUES ('dtr22', '4', null, 't4', null);
INSERT INTO `doctortestrecord` VALUES ('dtr23', '4', null, 't5', null);
INSERT INTO `doctortestrecord` VALUES ('dtr24', '4', null, 't6', null);
INSERT INTO `doctortestrecord` VALUES ('dtr25', '4', null, 't7', null);
INSERT INTO `doctortestrecord` VALUES ('dtr26', '4', null, 't8', null);
INSERT INTO `doctortestrecord` VALUES ('dtr27', '4', null, 't9', null);
INSERT INTO `doctortestrecord` VALUES ('dtr28', '4', null, 't7', null);
INSERT INTO `doctortestrecord` VALUES ('dtr29', '4', null, 't6', null);
INSERT INTO `doctortestrecord` VALUES ('dtr3', '4', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr30', '1', null, 't1', null);
INSERT INTO `doctortestrecord` VALUES ('dtr31', '1', null, 't10', null);
INSERT INTO `doctortestrecord` VALUES ('dtr32', '1', null, 't6', null);
INSERT INTO `doctortestrecord` VALUES ('dtr33', '2', null, 't3', null);
INSERT INTO `doctortestrecord` VALUES ('dtr34', '2', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr35', '2', null, 't0', null);
INSERT INTO `doctortestrecord` VALUES ('dtr36', '2', null, 't10', null);
INSERT INTO `doctortestrecord` VALUES ('dtr37', '2', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr38', '5', null, 't0', null);
INSERT INTO `doctortestrecord` VALUES ('dtr39', '6', null, 't8', null);
INSERT INTO `doctortestrecord` VALUES ('dtr4', '4', null, 't3', null);
INSERT INTO `doctortestrecord` VALUES ('dtr40', '6', null, 't9', null);
INSERT INTO `doctortestrecord` VALUES ('dtr41', '6', null, 't0', null);
INSERT INTO `doctortestrecord` VALUES ('dtr42', '6', null, 't0', null);
INSERT INTO `doctortestrecord` VALUES ('dtr43', '6', null, 't2', null);
INSERT INTO `doctortestrecord` VALUES ('dtr44', '6', null, 't5', null);
INSERT INTO `doctortestrecord` VALUES ('dtr45', '6', null, 't4', null);
INSERT INTO `doctortestrecord` VALUES ('dtr5', '4', null, 't4', null);
INSERT INTO `doctortestrecord` VALUES ('dtr6', '4', null, 't5', null);
INSERT INTO `doctortestrecord` VALUES ('dtr7', '4', null, 't6', null);
INSERT INTO `doctortestrecord` VALUES ('dtr8', '4', null, 't7', null);
INSERT INTO `doctortestrecord` VALUES ('dtr9', '4', null, 't8', null);

-- ----------------------------
-- Table structure for doctoruser
-- ----------------------------
DROP TABLE IF EXISTS `doctoruser`;
CREATE TABLE `doctoruser` (
  `duid` int(11) NOT NULL AUTO_INCREMENT,
  `duusername` varchar(15) DEFAULT NULL,
  `dupassword` varchar(15) DEFAULT NULL,
  `duname` varchar(10) DEFAULT NULL,
  `dusex` int(1) DEFAULT NULL,
  `ducard` varchar(18) DEFAULT NULL,
  `duphone` varchar(20) DEFAULT NULL,
  `duaddress` varchar(20) DEFAULT NULL,
  `dudepartmentname` varchar(20) DEFAULT NULL,
  `dutype` varchar(10) DEFAULT NULL,
  `dutitle` varchar(10) DEFAULT NULL,
  `dualive` int(1) DEFAULT '0',
  PRIMARY KEY (`duid`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctoruser
-- ----------------------------
INSERT INTO `doctoruser` VALUES ('27', 'qqqqq1', 'qqqqq', 'lwy', '1', '210104199910144312', '18240394122', 'shenyang', '管理员', '管理员', '管理员', '0');
INSERT INTO `doctoruser` VALUES ('28', 'wwwww', 'wwwww', 'qqq', '1', '210104199910144311', '18240394127', 'kkijm', '管理员', '管理员', '管理员', '0');
INSERT INTO `doctoruser` VALUES ('29', 'qqqqq', 'qqqqq', '刘伟艺2', '1', '210104199910144314', '18240394124', '沈阳', '著名专家皮肤科', '医生', '著名专家', '0');
INSERT INTO `doctoruser` VALUES ('30', 'eeeee', 'eeeee', '张伟', '1', '210104199910251235', '15325412569', '沈阳', '著名专家皮肤科', '医生', '著名专家', '0');
INSERT INTO `doctoruser` VALUES ('31', 'rrrrr', 'rrrrr', '李云龙', '1', '131127199107202003', '15236523125', '平安县', '著名专家皮肤科', '医生', '著名专家', '0');
INSERT INTO `doctoruser` VALUES ('38', 'qweqwe', '22222', '222', '1', '210104199510144569', '18254695656', '123123', '门诊心血管内科', '检验医生', '副教授', '0');

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug` (
  `drid` varchar(11) NOT NULL,
  `drname` varchar(20) DEFAULT NULL,
  `drpinyin` varchar(20) DEFAULT NULL,
  `drformat` varchar(20) DEFAULT NULL,
  `drconsumption` varchar(20) DEFAULT NULL,
  `drtype` varchar(10) DEFAULT NULL,
  `drnum` int(10) DEFAULT NULL,
  `drmoney` decimal(10,2) DEFAULT NULL,
  `dralive` int(1) DEFAULT '0',
  `drmedical` int(1) DEFAULT NULL,
  PRIMARY KEY (`drid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug
-- ----------------------------
INSERT INTO `drug` VALUES ('dr1', '板蓝根', 'BLG', '盒', '一日三次', '非处方药', '9929', '10.70', '0', '1');
INSERT INTO `drug` VALUES ('dr10', '维生素C', 'WSSC', '瓶', '一日一次', '非处方药', '9988', '150.00', '0', '1');
INSERT INTO `drug` VALUES ('dr11', '维生素D', 'WSSD', '瓶', '一日一次', '非处方药', '9974', '150.00', '0', '1');
INSERT INTO `drug` VALUES ('dr12', '双黄连口服液', 'SHLKFY', '盒', '一日四次', '非处方药', '9999', '35.60', '0', '1');
INSERT INTO `drug` VALUES ('dr13', '咪唑斯汀缓释片', 'MZSTHSP', '盒', '一日一次', '处方药', '8768', '75.60', '0', '1');
INSERT INTO `drug` VALUES ('dr14', '伊巴斯汀缓释片', 'YBSTHSP', '盒', '一日一次', '处方药', '8776', '120.00', '0', '1');
INSERT INTO `drug` VALUES ('dr15', '盐酸米诺环素(50mg)', 'YSMNHS50', '盒', '一日两次', '非处方药', '8888', '115.00', '0', '1');
INSERT INTO `drug` VALUES ('dr16', '盐酸米诺环素(100mg)', 'YSMNHS100', '盒', '一日两次', '非处方药', '8888', '118.50', '0', '1');
INSERT INTO `drug` VALUES ('dr17', '润燥止痒胶囊', 'RZZYJN', '盒', '一日三次', '非处方药', '8888', '44.90', '0', '1');
INSERT INTO `drug` VALUES ('dr18', '整肠生', 'ZCS', '盒', '一日四次', '非处方药', '5555', '15.50', '0', '1');
INSERT INTO `drug` VALUES ('dr19', '氢溴酸右美芬片', 'QXSYMFP', '盒', '一日三次', '处方药', '8888', '66.60', '0', '1');
INSERT INTO `drug` VALUES ('dr2', '复方甘草酸苷片', 'FFGCSGP', '盒', '一日三次', '非处方药', '9999', '45.80', '0', '1');
INSERT INTO `drug` VALUES ('dr3', '罗红霉素片', 'LHMSP', '盒', '一日一次', '非处方药', '9999', '30.50', '0', '1');
INSERT INTO `drug` VALUES ('dr4', '右匹克隆片', 'YPKLP', '盒', '一日一次', '处方药', '9999', '40.00', '0', '1');
INSERT INTO `drug` VALUES ('dr5', '他克莫司乳膏', 'TKMSRG', '瓶', '一日两次', '处方药', '500', '230.00', '0', '1');
INSERT INTO `drug` VALUES ('dr6', '安素', 'AS', '罐', '一日三次', '非处方药', '2990', '200.00', '0', '1');
INSERT INTO `drug` VALUES ('dr7', '头孢克肟片', 'TBKWP', '盒', '一日一次', '处方药', '4985', '50.00', '0', '1');
INSERT INTO `drug` VALUES ('dr8', '长生不老丹', 'CSBLD', '盒', '一日一次', '处方药', '10', '999999.90', '0', '0');
INSERT INTO `drug` VALUES ('dr9', '黄连素胶囊', 'HLSJN', '盒', '一日三次', '非处方药', '9999', '45.00', '0', '1');

-- ----------------------------
-- Table structure for drugorhandlewithpayrecord
-- ----------------------------
DROP TABLE IF EXISTS `drugorhandlewithpayrecord`;
CREATE TABLE `drugorhandlewithpayrecord` (
  `pid` varchar(20) DEFAULT NULL,
  `dhid` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugorhandlewithpayrecord
-- ----------------------------
INSERT INTO `drugorhandlewithpayrecord` VALUES ('130', 'h16');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('131', 'h17');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('132', 'h18');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('140', 'h19');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('141', 'h20');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('142', 'h21');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('147', 'h22');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('152', 'h23');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('153', 'h24');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('154', 'h25');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('155', 'h26');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('156', 'h27');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('157', 'h28');
INSERT INTO `drugorhandlewithpayrecord` VALUES ('158', 'h29');

-- ----------------------------
-- Table structure for handle
-- ----------------------------
DROP TABLE IF EXISTS `handle`;
CREATE TABLE `handle` (
  `hid` varchar(10) NOT NULL,
  `hmrid` int(11) DEFAULT NULL,
  `hdo` varchar(11) DEFAULT NULL,
  `hnum` int(5) DEFAULT NULL,
  `htime` datetime DEFAULT NULL,
  `halive` int(1) DEFAULT '0',
  `hgivemoney` int(1) DEFAULT NULL,
  `hused` int(1) DEFAULT NULL,
  `hwater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of handle
-- ----------------------------
INSERT INTO `handle` VALUES ('h1', '4', 'dr1', '20', '2021-03-05 21:58:40', '0', '0', '0', 'ddr1');
INSERT INTO `handle` VALUES ('h10', '1', 'ndr15', '0', '2021-04-06 16:47:59', '0', '0', '0', 'dndr4');
INSERT INTO `handle` VALUES ('h11', '2', 'ndr7', '12', '2021-04-06 16:50:05', '0', '0', '0', 'dndr5');
INSERT INTO `handle` VALUES ('h12', '2', 'ndr13', '5', '2021-04-06 16:50:05', '0', '0', '0', 'dndr6');
INSERT INTO `handle` VALUES ('h13', '2', 'dr13', '100', '2021-04-06 16:56:18', '0', '0', '0', 'ddr7');
INSERT INTO `handle` VALUES ('h14', '4', 'ndr10', '5', '2021-04-06 17:05:44', '0', '0', '0', 'dndr7');
INSERT INTO `handle` VALUES ('h15', '4', 'ndr10', '15', '2021-04-06 17:08:48', '0', '0', '0', 'dndr8');
INSERT INTO `handle` VALUES ('h16', '1', 'dr1', '5', '2021-04-07 20:19:38', '0', '0', '0', 'ddr8');
INSERT INTO `handle` VALUES ('h17', '1', 'dr11', '15', '2021-04-07 20:21:56', '0', '0', '0', 'ddr9');
INSERT INTO `handle` VALUES ('h18', '1', 'dr11', '10', '2021-04-07 20:23:10', '0', '0', '0', 'ddr10');
INSERT INTO `handle` VALUES ('h19', '6', 'dr6', '10', '2021-04-07 20:28:16', '0', '0', '0', 'ddr11');
INSERT INTO `handle` VALUES ('h2', '4', 'dr1', '1', '2021-03-05 21:59:25', '0', '0', '0', 'ddr2');
INSERT INTO `handle` VALUES ('h20', '6', 'dr7', '15', '2021-04-07 20:28:16', '0', '0', '0', 'ddr12');
INSERT INTO `handle` VALUES ('h21', '6', 'ndr13', '100', '2021-04-07 20:28:23', '0', '0', '0', 'dndr9');
INSERT INTO `handle` VALUES ('h22', '6', 'dr14', '112', '2021-04-17 19:34:06', '0', '0', '0', 'ddr13');
INSERT INTO `handle` VALUES ('h23', '6', 'dr10', '1', '2021-05-01 12:55:48', '0', '0', '0', 'ddr14');
INSERT INTO `handle` VALUES ('h24', '6', 'dr1', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr15');
INSERT INTO `handle` VALUES ('h25', '6', 'dr12', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr16');
INSERT INTO `handle` VALUES ('h26', '6', 'dr15', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr17');
INSERT INTO `handle` VALUES ('h27', '6', 'dr16', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr18');
INSERT INTO `handle` VALUES ('h28', '6', 'dr9', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr19');
INSERT INTO `handle` VALUES ('h29', '6', 'dr7', '0', '2021-05-01 12:55:48', '0', '0', '0', 'ddr20');
INSERT INTO `handle` VALUES ('h3', '4', 'dr10', '10', '2021-03-05 21:59:25', '0', '0', '0', 'ddr3');
INSERT INTO `handle` VALUES ('h4', '4', 'dr13', '20', '2021-03-05 21:59:25', '0', '0', '0', 'ddr4');
INSERT INTO `handle` VALUES ('h5', '4', 'dr1', '12', '2021-03-07 16:43:52', '0', '0', '0', 'ddr5');
INSERT INTO `handle` VALUES ('h6', '1', 'dr1', '12', '2021-04-06 15:27:25', '0', '0', '0', 'ddr6');
INSERT INTO `handle` VALUES ('h7', '1', 'ndr14', '12', '2021-04-06 16:38:39', '0', '0', '0', 'dndr1');
INSERT INTO `handle` VALUES ('h8', '1', 'ndr14', '10', '2021-04-06 16:47:59', '0', '0', '0', 'dndr2');
INSERT INTO `handle` VALUES ('h9', '1', 'ndr1', '15', '2021-04-06 16:47:59', '0', '0', '0', 'dndr3');

-- ----------------------------
-- Table structure for inspection
-- ----------------------------
DROP TABLE IF EXISTS `inspection`;
CREATE TABLE `inspection` (
  `inid` varchar(10) NOT NULL,
  `inmrid` int(11) DEFAULT NULL,
  `indo` varchar(11) DEFAULT NULL,
  `inend` varchar(20) DEFAULT NULL,
  `innum` int(5) DEFAULT NULL,
  `intime` datetime DEFAULT NULL,
  `inalive` int(1) DEFAULT '0',
  `ingivemoney` int(1) DEFAULT NULL,
  `inused` int(1) DEFAULT NULL,
  `inwater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`inid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inspection
-- ----------------------------
INSERT INTO `inspection` VALUES ('in1', '4', 'i1', '未做检查无结果', '1', '2021-03-04 16:58:30', '1', '0', '0', 'dir10');
INSERT INTO `inspection` VALUES ('in10', '4', 'i1', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dir19');
INSERT INTO `inspection` VALUES ('in11', '4', 'i2', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dir20');
INSERT INTO `inspection` VALUES ('in12', '4', 'i3', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dir21');
INSERT INTO `inspection` VALUES ('in13', '4', 'i5', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dir22');
INSERT INTO `inspection` VALUES ('in14', '4', 'i1', '未做检查无结果', '1', '2021-03-07 17:35:59', '0', '0', '0', 'dir23');
INSERT INTO `inspection` VALUES ('in15', '4', 'i3', '未做检查无结果', '1', '2021-03-07 17:35:59', '0', '0', '0', 'dir24');
INSERT INTO `inspection` VALUES ('in16', '4', 'i2', '未做检查无结果', '1', '2021-03-07 17:35:59', '0', '0', '0', 'dir25');
INSERT INTO `inspection` VALUES ('in17', '1', 'i1', '未做检查无结果', '1', '2021-03-07 17:38:44', '0', '0', '0', 'dir26');
INSERT INTO `inspection` VALUES ('in18', '1', 'i2', '未做检查无结果', '1', '2021-03-07 17:38:44', '0', '0', '0', 'dir27');
INSERT INTO `inspection` VALUES ('in19', '2', 'i0', '未做检查无结果', '1', '2021-03-07 18:03:28', '1', '0', '0', 'dir28');
INSERT INTO `inspection` VALUES ('in2', '4', 'i2', '未做检查无结果', '1', '2021-03-04 16:58:30', '1', '0', '0', 'dir11');
INSERT INTO `inspection` VALUES ('in20', '2', 'i1', '未做检查无结果', '1', '2021-03-07 18:13:50', '1', '0', '0', 'dir29');
INSERT INTO `inspection` VALUES ('in21', '2', 'i0', '未做检查无结果', '1', '2021-03-07 18:19:02', '0', '0', '0', 'dir30');
INSERT INTO `inspection` VALUES ('in22', '5', 'i2', '未做检查无结果', '1', '2021-03-07 18:21:24', '0', '0', '0', 'dir31');
INSERT INTO `inspection` VALUES ('in23', '6', 'i4', '未做检查无结果', '1', '2021-04-07 20:27:49', '1', '0', '0', 'dir32');
INSERT INTO `inspection` VALUES ('in24', '6', 'i5', '未做检查无结果', '1', '2021-04-07 20:27:49', '1', '0', '0', 'dir33');
INSERT INTO `inspection` VALUES ('in25', '6', 'i3', '未做检查无结果', '1', '2021-04-07 20:27:49', '1', '0', '0', 'dir34');
INSERT INTO `inspection` VALUES ('in26', '6', 'i6', '未做检查无结果', '1', '2021-04-07 20:27:49', '1', '0', '0', 'dir35');
INSERT INTO `inspection` VALUES ('in27', '6', 'i0', '未做检查无结果', '1', '2021-04-07 20:27:49', '0', '0', '0', 'dir36');
INSERT INTO `inspection` VALUES ('in28', '6', 'i6', '未做检查无结果', '1', '2021-04-17 19:33:37', '1', '0', '0', 'dir37');
INSERT INTO `inspection` VALUES ('in29', '6', 'i2', '未做检查无结果', '1', '2021-04-17 19:33:54', '0', '0', '0', 'dir38');
INSERT INTO `inspection` VALUES ('in3', '4', 'i3', '未做检查无结果', '1', '2021-03-04 16:58:30', '1', '0', '0', 'dir12');
INSERT INTO `inspection` VALUES ('in30', '6', 'i0', '未做检查无结果', '1', '2021-05-01 12:46:12', '0', '0', '0', 'dir39');
INSERT INTO `inspection` VALUES ('in4', '4', 'i1', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir13');
INSERT INTO `inspection` VALUES ('in5', '4', 'i2', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir14');
INSERT INTO `inspection` VALUES ('in6', '4', 'i3', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir15');
INSERT INTO `inspection` VALUES ('in7', '4', 'i4', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir16');
INSERT INTO `inspection` VALUES ('in8', '4', 'i5', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir17');
INSERT INTO `inspection` VALUES ('in9', '4', 'i6', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dir18');

-- ----------------------------
-- Table structure for inspection_items
-- ----------------------------
DROP TABLE IF EXISTS `inspection_items`;
CREATE TABLE `inspection_items` (
  `iiid` varchar(11) NOT NULL,
  `iiname` varchar(10) DEFAULT NULL,
  `iipinyin` varchar(20) DEFAULT NULL,
  `iimoney` decimal(10,1) DEFAULT NULL,
  `iimedical` int(1) DEFAULT NULL,
  PRIMARY KEY (`iiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inspection_items
-- ----------------------------
INSERT INTO `inspection_items` VALUES ('i0', '检查无', 'wu', '0.0', '0');
INSERT INTO `inspection_items` VALUES ('i1', '核磁共振', 'HCGZ', '500.0', '1');
INSERT INTO `inspection_items` VALUES ('i2', 'X光', 'XG', '800.0', '1');
INSERT INTO `inspection_items` VALUES ('i3', '弱智检测光波', 'RZJCGB', '10000.0', '1');
INSERT INTO `inspection_items` VALUES ('i4', '低能儿童检测', 'DNETJC', '10000.0', '0');
INSERT INTO `inspection_items` VALUES ('i5', '智商测试', 'ZSCS', '500.0', '0');
INSERT INTO `inspection_items` VALUES ('i6', '智力残障等级测试', 'ZLCZDJCS', '15000.0', '1');

-- ----------------------------
-- Table structure for medical_record
-- ----------------------------
DROP TABLE IF EXISTS `medical_record`;
CREATE TABLE `medical_record` (
  `mrid` int(11) NOT NULL AUTO_INCREMENT,
  `mrpid` int(11) DEFAULT NULL,
  `mrdid` int(11) DEFAULT NULL,
  `mrtime` datetime DEFAULT NULL,
  `mrchiefcomplaint` varchar(20) DEFAULT NULL,
  `mrpresentIllness` varchar(20) DEFAULT NULL,
  `mrpast` varchar(20) DEFAULT NULL,
  `mrpersonal` varchar(20) DEFAULT NULL,
  `mrfinal` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mrid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medical_record
-- ----------------------------
INSERT INTO `medical_record` VALUES ('1', '1', '29', '2021-02-27 16:42:39', '无', '无', '螨虫过敏+脂溢性皮炎', '无', 'wewewewe脂肪肝');
INSERT INTO `medical_record` VALUES ('2', '2', '29', '2021-02-27 16:44:50', '无', '无', '哮喘，脚有小骨头', '无', '便秘');
INSERT INTO `medical_record` VALUES ('3', '2', '29', '2021-02-27 13:34:12', '无', '无', '无', '无', '无');
INSERT INTO `medical_record` VALUES ('4', '3', '29', '2021-02-27 13:50:23', '智商低，不聪明', '智力低下，心里幼稚', '弱智', '从小弱智到现在', '弱智智商低下');
INSERT INTO `medical_record` VALUES ('5', '3', '29', '2021-02-27 18:20:34', '无', '无', '无', '无', '无');
INSERT INTO `medical_record` VALUES ('6', '3', '29', '2021-04-07 20:26:42', '无', '无', '无', '傻逼', '无智商低下弱智脂肪肝');

-- ----------------------------
-- Table structure for nodrug
-- ----------------------------
DROP TABLE IF EXISTS `nodrug`;
CREATE TABLE `nodrug` (
  `nid` varchar(11) NOT NULL,
  `nname` varchar(10) DEFAULT NULL,
  `npinyin` varchar(20) DEFAULT NULL,
  `nformat` varchar(10) DEFAULT NULL,
  `nmoney` decimal(10,2) DEFAULT NULL,
  `nalive` int(1) DEFAULT '0',
  `nmedical` int(1) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nodrug
-- ----------------------------
INSERT INTO `nodrug` VALUES ('ndr1', '静脉注射葡萄糖', 'JMZSPTT', '次', '40.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr10', '产后护理', 'CHHL', '次', '100000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr11', '开颅手术', 'KLSS', '次', '320000.50', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr12', '静脉注射青霉素', 'JMZSQMS', '次', '665.30', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr13', '打石膏', 'DSG', '次', '365.20', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr14', '截肢', 'JZ', '次', '6651.30', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr15', '住院', 'ZY', '次', '1000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr16', '化疗', 'HL', '次', '100000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr17', '肿瘤切除', 'ZLQC', '次', '700000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr18', '激光近视', 'JGJS', '次', '50000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr19', '正骨', 'ZG', '次', '300.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr2', '皮下注射破伤风针', 'PXZSPSFZ', '针', '200.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr3', '急诊缝合', 'JZFH', '次', '100.50', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr4', '电击', 'DJ', '次', '500.10', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr5', 'COVID-19疫苗', 'COVID19YM', '针', '1000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr6', '综合抢救（小）', 'ZHQJX', '次', '3000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr7', '综合抢救（大）', 'ZHQWD', '次', '10000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr8', '过敏针', 'GMYCS', '针', '5000.00', '0', '1');
INSERT INTO `nodrug` VALUES ('ndr9', '哮喘特效针', 'XCTXZ', '针', '130000.00', '0', '1');

-- ----------------------------
-- Table structure for patientrloginrecord
-- ----------------------------
DROP TABLE IF EXISTS `patientrloginrecord`;
CREATE TABLE `patientrloginrecord` (
  `plrid` int(11) NOT NULL AUTO_INCREMENT,
  `plrpid` int(11) DEFAULT NULL,
  `plrtime` datetime DEFAULT NULL,
  PRIMARY KEY (`plrid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patientrloginrecord
-- ----------------------------

-- ----------------------------
-- Table structure for patientuser
-- ----------------------------
DROP TABLE IF EXISTS `patientuser`;
CREATE TABLE `patientuser` (
  `puid` int(11) NOT NULL AUTO_INCREMENT,
  `puusername` varchar(10) DEFAULT NULL,
  `pupassword` varchar(20) DEFAULT NULL,
  `puname` varchar(255) DEFAULT NULL,
  `pusex` int(1) DEFAULT NULL,
  `pubirthday` date DEFAULT NULL,
  `pucard` varchar(18) DEFAULT NULL,
  `puaddress` varchar(20) DEFAULT NULL,
  `puphone` varchar(20) DEFAULT NULL,
  `pucreate` datetime DEFAULT NULL,
  `puhistory` varchar(100) DEFAULT NULL,
  `pualive` int(1) DEFAULT '0',
  PRIMARY KEY (`puid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patientuser
-- ----------------------------
INSERT INTO `patientuser` VALUES ('1', 'liuweiyi', '11111', '刘伟艺', '1', '1999-10-14', '210104199910144312', '沈阳大东区东北大马路', '18240394122', '2021-02-26 08:46:27', '螨虫过敏', '0');
INSERT INTO `patientuser` VALUES ('2', '513328513', '513328513', '董世苹', '0', '1999-05-13', '131127199904202003', '沈阳大东区津桥路', '15304180513', '2021-02-27 08:44:24', '螨虫', '0');
INSERT INTO `patientuser` VALUES ('3', 'qqqqq2', 'qqqqq2', '大爹', '1', '2020-03-10', '210104199507202003', '盘锦', '15633331526', '2021-02-28 05:44:50', '无', '0');

-- ----------------------------
-- Table structure for patient_registration_record
-- ----------------------------
DROP TABLE IF EXISTS `patient_registration_record`;
CREATE TABLE `patient_registration_record` (
  `prrid` int(11) NOT NULL AUTO_INCREMENT,
  `prrpuid` int(11) DEFAULT NULL,
  `prrtime` datetime DEFAULT NULL,
  `prrmoney` decimal(10,1) DEFAULT '0.0',
  `prrmrid` int(11) DEFAULT NULL,
  `prrWithdrawal_number` int(1) DEFAULT NULL,
  `prrdoid` int(11) DEFAULT NULL,
  `prralready` int(1) DEFAULT NULL,
  PRIMARY KEY (`prrid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient_registration_record
-- ----------------------------
INSERT INTO `patient_registration_record` VALUES ('1', '1', '2021-02-27 16:41:03', '20.0', '1', '0', '1', '1');
INSERT INTO `patient_registration_record` VALUES ('2', '2', '2021-02-27 16:45:10', '0.0', '2', '0', '1', '1');
INSERT INTO `patient_registration_record` VALUES ('3', '2', '2021-02-27 13:33:35', '0.0', '3', '1', '1', '0');
INSERT INTO `patient_registration_record` VALUES ('4', '3', '2021-02-27 13:49:46', '0.0', '4', '0', '1', '1');
INSERT INTO `patient_registration_record` VALUES ('5', '3', '2021-02-27 18:19:44', '0.0', '5', '0', '0', '1');
INSERT INTO `patient_registration_record` VALUES ('6', '3', '2021-04-07 20:26:05', '0.0', '6', '0', '0', '1');

-- ----------------------------
-- Table structure for pay
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pmrid` int(11) DEFAULT NULL,
  `proid` varchar(10) DEFAULT NULL,
  `pmoney` decimal(10,1) DEFAULT NULL,
  `pnum` int(5) DEFAULT NULL,
  `pallmoney` decimal(10,1) DEFAULT NULL,
  `ptime` datetime DEFAULT NULL,
  `ptype` varchar(10) DEFAULT NULL,
  `pgivemoney` int(1) DEFAULT NULL,
  `palive` int(1) DEFAULT '0',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pay
-- ----------------------------
INSERT INTO `pay` VALUES ('61', '4', 'in1', '500.0', '1', '500.0', '2021-03-04 16:58:30', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('62', '4', 'in2', '800.0', '1', '800.0', '2021-03-04 16:58:30', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('63', '4', 'in3', '10000.0', '1', '10000.0', '2021-03-04 16:58:30', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('64', '4', 'te1', '250.0', '1', '250.0', '2021-03-04 16:58:30', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('65', '4', 'te2', '1000.0', '1', '1000.0', '2021-03-04 17:03:34', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('66', '4', 'te3', '80.0', '1', '80.0', '2021-03-04 17:03:55', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('67', '4', 'te4', '5000.0', '1', '5000.0', '2021-03-04 17:03:55', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('68', '4', 'te5', '4000.0', '1', '4000.0', '2021-03-04 17:03:55', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('69', '4', 'in4', '500.0', '1', '500.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('70', '4', 'in5', '800.0', '1', '800.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('71', '4', 'in6', '10000.0', '1', '10000.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('72', '4', 'in7', '10000.0', '1', '10000.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('73', '4', 'in8', '500.0', '1', '500.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('74', '4', 'in9', '15000.0', '1', '15000.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('75', '4', 'te6', '250.0', '1', '250.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('76', '4', 'te7', '1000.0', '1', '1000.0', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('77', '4', 'te8', '560.5', '1', '560.5', '2021-03-04 17:06:52', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('78', '4', 'te9', '756.3', '1', '756.3', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('79', '4', 'te10', '300.0', '1', '300.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('80', '4', 'te11', '1500.0', '1', '1500.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('81', '4', 'te12', '80.0', '1', '80.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('82', '4', 'te13', '80.0', '1', '80.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('83', '4', 'te14', '5000.0', '1', '5000.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('84', '4', 'te15', '4000.0', '1', '4000.0', '2021-03-04 17:06:53', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('85', '4', 'in10', '500.0', '1', '500.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('86', '4', 'in11', '800.0', '1', '800.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('87', '4', 'in12', '10000.0', '1', '10000.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('88', '4', 'te16', '80.0', '1', '80.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('89', '4', 'te17', '80.0', '1', '80.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('90', '4', 'in13', '500.0', '1', '500.0', '2021-03-04 17:59:36', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('93', '4', 'dr1', '10.7', '20', '214.0', '2021-03-05 21:58:40', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('94', '4', 'dr1', '10.7', '1', '150.0', '2021-03-05 21:59:25', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('95', '4', 'dr10', '150.0', '10', '1500.0', '2021-03-05 21:59:25', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('96', '4', 'dr13', '75.6', '20', '1512.0', '2021-03-05 21:59:25', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('97', '4', 'dr1', '10.7', '12', '128.4', '2021-03-07 16:43:52', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('98', '4', 'in14', '500.0', '1', '500.0', '2021-03-07 17:35:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('99', '4', 'in15', '10000.0', '1', '10000.0', '2021-03-07 17:35:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('100', '4', 'in16', '800.0', '1', '800.0', '2021-03-07 17:35:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('101', '1', 'in17', '500.0', '1', '500.0', '2021-03-07 17:38:44', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('102', '1', 'in18', '800.0', '1', '800.0', '2021-03-07 17:38:44', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('103', '1', 'te18', '250.0', '1', '250.0', '2021-03-07 17:40:31', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('104', '1', 'te19', '1000.0', '1', '1000.0', '2021-03-07 17:40:31', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('105', '1', 'te20', '80.0', '1', '80.0', '2021-03-07 17:42:18', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('106', '2', 'te21', '756.3', '1', '756.3', '2021-03-07 17:45:05', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('107', '2', 'te22', '560.5', '1', '560.5', '2021-03-07 18:02:57', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('108', '2', 'in19', '0.0', '1', '0.0', '2021-03-07 18:03:28', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('109', '2', 'in20', '500.0', '1', '500.0', '2021-03-07 18:13:50', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('110', '2', 'te23', '0.0', '1', '0.0', '2021-03-07 18:13:50', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('111', '2', 'te24', '1000.0', '1', '1000.0', '2021-03-07 18:19:02', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('112', '2', 'te25', '560.5', '1', '560.5', '2021-03-07 18:19:02', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('113', '2', 'in21', '0.0', '1', '0.0', '2021-03-07 18:19:02', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('114', '5', 'in22', '800.0', '1', '800.0', '2021-03-07 18:21:24', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('115', '5', 'te26', '0.0', '1', '0.0', '2021-03-07 18:21:24', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('116', '1', 'dr1', '10.7', '12', '128.4', '2021-04-06 15:27:25', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('117', '1', 'ndr14', '6651.3', '12', '79815.6', '2021-04-06 16:38:39', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('118', '1', 'ndr14', '6651.3', '10', '66513.0', '2021-04-06 16:41:19', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('119', '1', 'ndr14', '6651.3', '10', '66513.0', '2021-04-06 16:41:20', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('120', '1', 'ndr14', '6651.3', '10', '66513.0', '2021-04-06 16:42:01', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('121', '1', 'ndr14', '6651.3', '10', '66513.0', '2021-04-06 16:42:02', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('122', '1', 'ndr14', '6651.3', '10', '66513.0', '2021-04-06 16:47:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('123', '1', 'ndr1', '40.0', '15', '600.0', '2021-04-06 16:47:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('124', '1', 'ndr15', '1000.0', '0', '0.0', '2021-04-06 16:47:59', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('125', '2', 'ndr7', '10000.0', '12', '120000.0', '2021-04-06 16:50:05', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('126', '2', 'ndr13', '365.2', '5', '1826.0', '2021-04-06 16:50:05', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('127', '2', 'dr13', '75.6', '100', '7560.0', '2021-04-06 16:56:18', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('128', '4', 'ndr10', '100000.0', '5', '500000.0', '2021-04-06 17:05:44', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('129', '4', 'ndr10', '100000.0', '15', '1500000.0', '2021-04-06 17:08:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('130', '1', 'dr1', '10.7', '5', '53.5', '2021-04-07 20:19:38', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('131', '1', 'dr11', '150.0', '15', '2250.0', '2021-04-07 20:21:56', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('132', '1', 'dr11', '150.0', '10', '1500.0', '2021-04-07 20:23:10', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('133', '6', 'in23', '10000.0', '1', '10000.0', '2021-04-07 20:27:49', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('134', '6', 'in24', '500.0', '1', '500.0', '2021-04-07 20:27:49', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('135', '6', 'in25', '10000.0', '1', '10000.0', '2021-04-07 20:27:49', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('136', '6', 'in26', '15000.0', '1', '15000.0', '2021-04-07 20:27:49', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('137', '6', 'te27', '5000.0', '1', '5000.0', '2021-04-07 20:27:49', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('138', '6', 'te28', '4000.0', '1', '4000.0', '2021-04-07 20:27:49', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('139', '6', 'in27', '0.0', '1', '0.0', '2021-04-07 20:27:49', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('140', '6', 'dr6', '200.0', '10', '2000.0', '2021-04-07 20:28:16', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('141', '6', 'dr7', '50.0', '15', '750.0', '2021-04-07 20:28:16', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('142', '6', 'ndr13', '365.2', '100', '36520.0', '2021-04-07 20:28:23', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('143', '6', 'in28', '15000.0', '1', '15000.0', '2021-04-17 19:33:37', '未选择', '0', '1');
INSERT INTO `pay` VALUES ('144', '6', 'te29', '0.0', '1', '0.0', '2021-04-17 19:33:37', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('145', '6', 'in29', '800.0', '1', '800.0', '2021-04-17 19:33:54', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('146', '6', 'te30', '0.0', '1', '0.0', '2021-04-17 19:33:54', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('147', '6', 'dr14', '120.0', '112', '13440.0', '2021-04-17 19:34:06', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('148', '6', 'te31', '560.5', '1', '560.5', '2021-05-01 12:46:12', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('149', '6', 'te32', '1500.0', '1', '1500.0', '2021-05-01 12:46:12', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('150', '6', 'te33', '300.0', '1', '300.0', '2021-05-01 12:46:12', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('151', '6', 'in30', '0.0', '1', '0.0', '2021-05-01 12:46:12', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('152', '6', 'dr10', '150.0', '1', '150.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('153', '6', 'dr1', '10.7', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('154', '6', 'dr12', '35.6', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('155', '6', 'dr15', '115.0', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('156', '6', 'dr16', '118.5', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('157', '6', 'dr9', '45.0', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');
INSERT INTO `pay` VALUES ('158', '6', 'dr7', '50.0', '0', '0.0', '2021-05-01 12:55:48', '未选择', '0', '0');

-- ----------------------------
-- Table structure for registration_level
-- ----------------------------
DROP TABLE IF EXISTS `registration_level`;
CREATE TABLE `registration_level` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(10) DEFAULT NULL,
  `rusertitle` varchar(10) DEFAULT NULL,
  `rmoney` decimal(5,2) DEFAULT NULL,
  `rmin` int(5) DEFAULT NULL,
  `rmax` int(5) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registration_level
-- ----------------------------
INSERT INTO `registration_level` VALUES ('1', '医师', '副主治医师', '10.00', '20', '40');
INSERT INTO `registration_level` VALUES ('2', '医师', '主治医师', '20.00', '20', '40');
INSERT INTO `registration_level` VALUES ('3', '专家', '副教授', '50.00', '10', '20');
INSERT INTO `registration_level` VALUES ('4', '专家', '教授', '100.00', '10', '20');
INSERT INTO `registration_level` VALUES ('5', '专家', '著名专家', '400.00', '3', '5');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `tid` varchar(10) NOT NULL,
  `tmrid` int(11) DEFAULT NULL,
  `tdo` varchar(11) DEFAULT NULL,
  `tend` varchar(20) DEFAULT NULL,
  `tnum` int(5) DEFAULT NULL,
  `ttime` datetime DEFAULT NULL,
  `talive` int(1) DEFAULT '0',
  `tused` int(1) DEFAULT NULL,
  `tgivemoney` int(1) DEFAULT NULL,
  `twater` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('te1', '4', 't1', '未做检查无结果', '1', '2021-03-04 16:58:30', '1', '0', '0', 'dtr13');
INSERT INTO `test` VALUES ('te10', '4', 't4', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr22');
INSERT INTO `test` VALUES ('te11', '4', 't5', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr23');
INSERT INTO `test` VALUES ('te12', '4', 't6', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr24');
INSERT INTO `test` VALUES ('te13', '4', 't7', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr25');
INSERT INTO `test` VALUES ('te14', '4', 't8', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr26');
INSERT INTO `test` VALUES ('te15', '4', 't9', '未做检查无结果', '1', '2021-03-04 17:06:53', '1', '0', '0', 'dtr27');
INSERT INTO `test` VALUES ('te16', '4', 't7', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dtr28');
INSERT INTO `test` VALUES ('te17', '4', 't6', '未做检查无结果', '1', '2021-03-04 17:59:36', '0', '0', '0', 'dtr29');
INSERT INTO `test` VALUES ('te18', '1', 't1', '未做检查无结果', '1', '2021-03-07 17:40:31', '0', '0', '0', 'dtr30');
INSERT INTO `test` VALUES ('te19', '1', 't10', '未做检查无结果', '1', '2021-03-07 17:40:31', '0', '0', '0', 'dtr31');
INSERT INTO `test` VALUES ('te2', '4', 't10', '未做检查无结果', '1', '2021-03-04 17:03:34', '1', '0', '0', 'dtr14');
INSERT INTO `test` VALUES ('te20', '1', 't6', '未做检查无结果', '1', '2021-03-07 17:42:18', '1', '0', '0', 'dtr32');
INSERT INTO `test` VALUES ('te21', '2', 't3', '未做检查无结果', '1', '2021-03-07 17:45:05', '1', '0', '0', 'dtr33');
INSERT INTO `test` VALUES ('te22', '2', 't2', '未做检查无结果', '1', '2021-03-07 18:02:57', '1', '0', '0', 'dtr34');
INSERT INTO `test` VALUES ('te23', '2', 't0', '未做检查无结果', '1', '2021-03-07 18:13:50', '1', '0', '0', 'dtr35');
INSERT INTO `test` VALUES ('te24', '2', 't10', '未做检查无结果', '1', '2021-03-07 18:19:02', '0', '0', '0', 'dtr36');
INSERT INTO `test` VALUES ('te25', '2', 't2', '未做检查无结果', '1', '2021-03-07 18:19:02', '0', '0', '0', 'dtr37');
INSERT INTO `test` VALUES ('te26', '5', 't0', '未做检查无结果', '1', '2021-03-07 18:21:24', '0', '0', '0', 'dtr38');
INSERT INTO `test` VALUES ('te27', '6', 't8', '未做检查无结果', '1', '2021-04-07 20:27:49', '1', '0', '0', 'dtr39');
INSERT INTO `test` VALUES ('te28', '6', 't9', '未做检查无结果', '1', '2021-04-07 20:27:49', '0', '0', '0', 'dtr40');
INSERT INTO `test` VALUES ('te29', '6', 't0', '未做检查无结果', '1', '2021-04-17 19:33:37', '0', '0', '0', 'dtr41');
INSERT INTO `test` VALUES ('te3', '4', 't7', '未做检查无结果', '1', '2021-03-04 17:03:55', '1', '0', '0', 'dtr15');
INSERT INTO `test` VALUES ('te30', '6', 't0', '未做检查无结果', '1', '2021-04-17 19:33:54', '0', '0', '0', 'dtr42');
INSERT INTO `test` VALUES ('te31', '6', 't2', '未做检查无结果', '1', '2021-05-01 12:46:12', '0', '0', '0', 'dtr43');
INSERT INTO `test` VALUES ('te32', '6', 't5', '未做检查无结果', '1', '2021-05-01 12:46:12', '0', '0', '0', 'dtr44');
INSERT INTO `test` VALUES ('te33', '6', 't4', '未做检查无结果', '1', '2021-05-01 12:46:12', '0', '0', '0', 'dtr45');
INSERT INTO `test` VALUES ('te4', '4', 't8', '未做检查无结果', '1', '2021-03-04 17:03:55', '1', '0', '0', 'dtr16');
INSERT INTO `test` VALUES ('te5', '4', 't9', '未做检查无结果', '1', '2021-03-04 17:03:55', '1', '0', '0', 'dtr17');
INSERT INTO `test` VALUES ('te6', '4', 't1', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dtr18');
INSERT INTO `test` VALUES ('te7', '4', 't10', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dtr19');
INSERT INTO `test` VALUES ('te8', '4', 't2', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dtr20');
INSERT INTO `test` VALUES ('te9', '4', 't3', '未做检查无结果', '1', '2021-03-04 17:06:52', '1', '0', '0', 'dtr21');

-- ----------------------------
-- Table structure for test_items
-- ----------------------------
DROP TABLE IF EXISTS `test_items`;
CREATE TABLE `test_items` (
  `tiid` varchar(11) NOT NULL,
  `tiname` varchar(10) DEFAULT NULL,
  `tipinyin` varchar(20) DEFAULT NULL,
  `timoney` decimal(10,1) DEFAULT NULL,
  `timedical` int(1) DEFAULT NULL,
  PRIMARY KEY (`tiid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_items
-- ----------------------------
INSERT INTO `test_items` VALUES ('t0', '检验无', 'wu', '0.0', '0');
INSERT INTO `test_items` VALUES ('t1', '血常规', 'XCG', '250.0', '1');
INSERT INTO `test_items` VALUES ('t10', '靶细胞检验', 'BXBJY', '1000.0', '1');
INSERT INTO `test_items` VALUES ('t2', '过敏原检验', 'GMYJY', '560.5', '1');
INSERT INTO `test_items` VALUES ('t3', '哮喘源检验', 'XCYJY', '756.3', '1');
INSERT INTO `test_items` VALUES ('t4', '血小板检验', 'XXBJY', '300.0', '1');
INSERT INTO `test_items` VALUES ('t5', '白血球检验', 'BXQJY', '1500.0', '1');
INSERT INTO `test_items` VALUES ('t6', '尿常规', 'NCG', '80.0', '1');
INSERT INTO `test_items` VALUES ('t7', '粪便化验', 'FBHY', '80.0', '1');
INSERT INTO `test_items` VALUES ('t8', '骨髓检验', 'GSJD', '5000.0', '1');
INSERT INTO `test_items` VALUES ('t9', 'DNA亲子鉴定', 'DNAQZJD', '4000.0', '1');
