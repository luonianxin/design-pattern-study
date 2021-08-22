package org.itstack.test;

import org.itstack.demo.design.StoreFactory;
import org.itstack.demo.design.store.ICommodity;
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
    public void test_Commodity() throws Exception {

        StoreFactory storeFactory = new StoreFactory();

        logger.info("==开始模拟发放优惠券==");
        ICommodity couponCommodity = storeFactory.getCommodityService(1);
        couponCommodity.sendCommodity("1008611","YHQ1023938910232121323432","894318564912132",null);

        logger.info("==开始模拟发放实物奖品==");
        ICommodity goodsCommodity = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<>(8);
        extMap.put("consigneeUserName","胡歌");
        extMap.put("consigneeUserAddress","上海市浦东新区建新镇盛世嘉园10栋xxxx");
        extMap.put("consigneeUserPhone","13988483306");
        goodsCommodity.sendCommodity("1000001","STJP10239389102321323432","705312564212832",extMap);


        logger.info("==开始模拟发放爱奇艺会员卡==");
        ICommodity cardCommodity = storeFactory.getCommodityService(3);
        cardCommodity.sendCommodity("100010","AQY1xjkUodl8LO975GdfrYUio",null,null);

    }
}

