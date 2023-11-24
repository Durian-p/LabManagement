-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: travel
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `scenic`
--

DROP TABLE IF EXISTS `scenic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scenic` (
  `sid` varchar(25) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `info` varchar(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `price` decimal(20,0) unsigned DEFAULT NULL,
  `img_path` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `longitude` double(14,8) DEFAULT NULL,
  `latitude` double(14,8) DEFAULT NULL,
  `status` tinyint(1) unsigned zerofill DEFAULT NULL,
  `level` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scenic`
--

LOCK TABLES `scenic` WRITE;
/*!40000 ALTER TABLE `scenic` DISABLE KEYS */;
INSERT INTO `scenic` VALUES ('1147817898912947271','黄山风景区','黄山，中华十大名山之一，天下第一奇山。位于安徽省南部黄山市境内，有72峰，主峰莲花峰海拔1864米，与光明顶、天都峰并称三大黄山主峰，为36大峰之一。黄山是安徽旅游的标志，是中国十大风景名胜唯一的山岳风光。现为世界文化与自然双重遗产，世界地质公园，国家AAAAA级旅游景区，国家级风景名胜区，全国文明风景旅游区示范点，','黄山市黄山区汤口镇','0559-5580327',50,'https://picdl.sunbangyan.cn/2023/11/02/4235d5ba5a022942cd5143f3b957df90.jpg',118.16006200,30.14466100,0,'5A级景区'),('1673945741831231469','桂林漓江景区','桂林市漓江景区位于广西壮族自治区东部，是世界上规模最大、风景最美的岩溶山水游览区之一 。 \r\n桂林市漓江景区是广西东北部喀斯特地貌发育最典型的地区，主要景点有冠岩、黄布倒影和仙人推磨等自然景观，人称“百里漓江、百里画廊”。2007年，桂林市漓江景区被评为国家AAAAA级旅游区。','广西壮族自治区东部','400-8208820',210,'https://picdm.sunbangyan.cn/2023/11/02/c2a405e215a11ba37228c268cb95260f.jpg',110.43168500,25.14744500,0,'5A级景区'),('1678221123112312368','香格里拉巴拉格宗','巴拉格宗པ་ལ་ཀི་ཙོང་།生态旅游景区位于云南省香格里拉西北部的尼西乡境内，地处滇川藏交界处，是“三江并流”世界自然遗产红山片区的重要景区之一。\r\n景区景点甚多，集雪山、峡谷、冰川、河流、高原湖泊、原始森林于一体，更有圣洁原乡巴拉村、千年凤凰菩提树、香巴拉佛塔等，同时还有藏民族风情。','迪庆藏族自治州香格里拉市尼西乡巴拉社','400-6613399',110,'https://picss.sunbangyan.cn/2023/11/02/d829e5c1611a0354ef5451b4090f0971.jpg',100.24291600,25.59225000,0,'5A级景区'),('1678221512123123967','张家界天门山景区','天门山（英语：Tianmen Mountain）坐落在中国湖南省张家界市永定区，因自然奇观天门洞而得名，也因天门洞而蜚声世界，被誉为“湘西第一神山”、“武陵之魂”和“张家界之魂”。','湖南省张家界市永定区大庸中路11号','0731-12374812',258,'https://picst.sunbangyan.cn/2023/11/02/50860a25466026cc0cf47c160a811c60.jpg',105.33654200,34.72560000,0,'5A级景区'),('1678221512323980866','中南大学铁道学院','中南大学坐落在中国历史文化名城——湖南省长沙市，占地面积317万平方米。跨湘江两岸，依巍巍岳麓，临滔滔湘水，环境幽雅，景色宜人，是求知治学的理想园地。学校设有30个二级学院，拥有享“南湘雅”美誉的湘雅医院、湘雅二医院、湘雅三医院3所大型三级甲等综合性医院及湘雅口腔医院。\r\n\r\n　　中南大学由原湖南医科大学、长沙铁道学院与中南工业大学于2000年4月合并组建而成。原中南工业大学的前身为创建于1952年的中南矿冶学院，原长沙铁道学院的前身为创建于1953年的中南土木建筑学院，两校的主体学科最早溯源于1903年创办的湖南高等实业学堂的矿科和路科。原湖南医科大学的前身为1914年创建的湘雅医学专门学校，是我国创办最早的西医高等学校之一。\r\n中南大学历经百年办学积淀，顺应中国高等教育体制改革大势，弘扬以“知行合一、经世致用”为核心的大学精神，力行“向善、求真、唯美、有容”的校风，坚持自身办学特色，服务国家和社会重大需求，团结奋进，改革创新，追求卓越，综合实力和整体水平大幅提升。','湖南省长沙市天心区韶山南路22号','0731-12312312',0,'https://picst.sunbangyan.cn/2023/11/02/20b9b063da7ec0870dbc4c80e63175b9.jpg',112.99138100,28.13968900,0,'大专级景区'),('1678221536018980865','橘子洲头','橘子洲坐落在湖南省长沙市岳麓区湘江中央，是一个狭长的沙洲，又名桔子洲、桔洲、橘洲、水陆洲。南北全长约5公里；东西最宽处约320米，最窄约170米。洲上有居民居住，现因为整体规划已迁出许多。橘子洲于2001年成为长沙岳麓山风景名胜区橘子洲景区。','湖南省长沙市岳麓区橘子洲头2号','0731-88888888',0,'https://picss.sunbangyan.cn/2023/11/02/a076a9cfe1ca447c42b2a459c1b1adec.jpg',112.96211200,28.18720600,0,'5A级景区'),('1678221536018980876','世界之窗','长沙世界之窗位于湖南省长沙市东北郊区浏阳河畔，是由湖南电广传媒股份有限公司、深圳华侨城控股股份有限公司和香港中旅集团共同投资兴建的文化主题公园。\r\n长沙世界之窗始建于1995年，坐落于金鹰影视文化城内，占地40万平方米。1997年10月1日试营业，是一个融先锋时尚活动、大型器械游乐、世界各国建筑奇观、五洲风情歌舞表演、影视拍摄基地于一体的综合性大型主题公园。','长沙市开福区三一大道485号','0731-99999999',300,'https://picdm.sunbangyan.cn/2023/11/02/c5e991adc7791f344fe6b8a19e89143f.jpg',113.05383000,28.23819000,0,'主题公园'),('1678221536123980865','岳麓山景区','岳麓山，因南北朝刘宋时《南岳记》“南岳周围八百里，回雁为首，岳麓为足”而得名。岳麓山位于湖南省长沙市岳麓区湘江西岸；橘子洲位于湘江中，由南至北，纵贯江心，西瞻岳麓，东临古城。岳麓山景区内现有植物174科559属977种，以典型的亚热带常绿阔叶林和亚热带暖性针叶林为主，部分地区还保存着大片的原生性常绿阔叶次生林，并有大量珍贵的濒危树种和年代久远的古树名木。岳麓山是融中国文化精华的儒、释、道为一体的文化名山。它包容了历史上鸿儒巨子、高僧老道、骚人墨客共同开拓的岳麓山文化内涵。','湖南省长沙市岳麓区湘江西岸','0731-19191919',0,'https://picdm.sunbangyan.cn/2023/11/02/7d09b8b2a3fd4d656c7defa39d27358b.jpg',112.93675000,28.18754400,0,'5A级景区'),('1774891274894198170','九寨沟景区','九寨沟位于四川省西北部岷山山脉南段的阿坝藏族羌族自治州九寨沟县漳扎镇境内，地处岷山南段弓杠岭的东北侧。距离成都市400多千米，系长江水系嘉陵江上游白水江源头的一条大支沟。 九寨沟自然保护区地势南高北低，山谷深切，高差悬殊。北缘九寨沟口海拔仅2000米，中部峰岭均在4000米以上，南缘达4500米以上，主沟长30多公里。\r\n       九寨沟是世界自然遗产、国家重点风景名胜区、国家AAAAA级旅游景区、国家级自然保护区、国家地质公园、世界生物圈保护区网络，也是中国第一个以保护自然风景为主要目的的自然保护区。','四川省西北部岷山山脉南段的阿坝藏族羌族自治州九寨沟县漳扎镇','400-1238471',190,'https://picst.sunbangyan.cn/2023/11/02/ca32e151f4940932c746cc3fed3768be.jpg',104.14000000,33.16000000,0,'5A级景区');
/*!40000 ALTER TABLE `scenic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-02 17:21:58
