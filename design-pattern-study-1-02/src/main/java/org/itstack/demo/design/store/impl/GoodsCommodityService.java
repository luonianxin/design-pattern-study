package org.itstack.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.goods.DeliverReq;
import org.itstack.demo.design.goods.GoodsInfo;
import org.itstack.demo.design.goods.GoodsService;
import org.itstack.demo.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author luonianxin
 * @Description 实体物品发送方法
 * @Date 2021/8/22
 */
public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();


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

        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserNameByUId(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        logger.info("请求参数[实物商品] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        if(!isSuccess){
            throw  new RuntimeException("实物商品发放失败");
        }
        logger.info("测试结果[实物商品]：{}", isSuccess);
    }

    private String queryUserNameByUId(String uId){
        return "胡歌";
    }

    private String queryUserPhoneNumber(String uId){
        return "13688483306";
    }
}

