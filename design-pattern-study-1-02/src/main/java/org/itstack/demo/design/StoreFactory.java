package org.itstack.demo.design;

import org.itstack.demo.design.store.ICommodity;
import org.itstack.demo.design.store.impl.CardCommodityService;
import org.itstack.demo.design.store.impl.CouponCommodityService;
import org.itstack.demo.design.store.impl.GoodsCommodityService;

/**
 *  按照不同类型发放商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
 * @author luonianxin
 * @Description 奖品发放工厂生成服务
 * @Date 2021/8/22
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer awardType){
        if(null == awardType) return null;
        if(1 == awardType) return new CouponCommodityService();
        if(2 == awardType) return new GoodsCommodityService();
        if(3 == awardType) return new CardCommodityService();
        throw  new RuntimeException("不存在的商品服务类型!");
    }
}

