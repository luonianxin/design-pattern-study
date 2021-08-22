package org.itstack.test;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.AwardController;
import org.itstack.demo.design.AwardReq;
import org.itstack.demo.design.AwardRes;
import org.itstack.demo.design.coupon.CouponInfo;
import org.itstack.demo.design.coupon.CouponService;
import org.itstack.demo.design.goods.DeliverReq;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luonianxin
 * @Description 测试奖品发放接口
 * @Date 2021/8/22
 */

public class ApiTest {

    Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_AwardToUser(){
        AwardController awardController = new AwardController();
        logger.info("==开始模拟发放优惠券==");
        AwardReq req01 = new AwardReq();
        req01.setuId("10086");
        req01.setAwardType(1);
        req01.setAwardNumber("YHQ1023938910232121323432");
        req01.setBizId("791098764902132");
        AwardRes res01 =  awardController.awartToUser(req01);
        logger.info("优惠券入参:{}",JSON.toJSON(req01));
        logger.info("优惠券返参:{}",JSON.toJSON(res01));
        logger.info("==开始模拟发放实物奖品==");

        AwardReq req02 = new AwardReq();
        req02.setAwardType(2);
        req02.setAwardNumber("SW20349402123232020422313");
        req02.setuId("10010");
        req02.setBizId("791098764902145");
        Map<String,String> extParam = new HashMap<>(8);
        extParam.put("consigneeUserAddress","湖南省常德市xxx区xxx街道,盛世嘉园11栋");
        extParam.put("consigneeUserName","胡歌");
        extParam.put("consigneeUserPhone","13908056872");
        req02.setExtMap(extParam);
        AwardRes res02 = awardController.awartToUser(req02);
        logger.info("发放实物奖品入参:{}",JSON.toJSON(req02));
        logger.info("发放实物奖品出参:{}",JSON.toJSON(res02));

        logger.info("==开始模拟发放爱奇艺会员卡==");
        AwardReq req03 = new AwardReq();
        req03.setAwardType(3);
        req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");
        req03.setuId("100001");
        AwardRes res03 = awardController.awartToUser(req03);
        logger.info("发放会员卡入参:{}", JSON.toJSON(req03));
        logger.info("发放会员卡出参:{}",JSON.toJSON(res03));
    }
}

