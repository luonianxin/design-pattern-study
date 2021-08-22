package org.itstack.demo.design.store.impl;

import org.itstack.demo.design.coupon.CouponResult;
import org.itstack.demo.design.coupon.CouponService;
import org.itstack.demo.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author luonianxin
 * @Description 优惠券发放处理实现类
 * @Date 2021/8/22
 */
public class CouponCommodityService implements ICommodity {

    private CouponService couponService = new CouponService();

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    /**
     * 　发放接口方法
     *
     * @param uId         　领取奖品的用户ID
     * @param commodityId 　奖品（商品）ID
     * @param bizId       业务ID
     * @param extMap      　拓展参数
     * @throws Exception
     */
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId,commodityId,bizId);
        logger.info("请求参数［优惠券］:uId:{} commodityId:{} bizId:{} extMap:{}",uId,commodityId,bizId,extMap);

        if(!"0000".equals(couponResult.getCode()))
            throw  new RuntimeException(couponResult.getInfo());
        logger.info("测试结果：{}",couponResult.getInfo());
    }

    /**
     * 　模拟查询用户手机号
     * @param uId
     * @return
     */
    private String queryUserPhoneNumberByUId(String uId){
        return "13683378848";
    }

}

