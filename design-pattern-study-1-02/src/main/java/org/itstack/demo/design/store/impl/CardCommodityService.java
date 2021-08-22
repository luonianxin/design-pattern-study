package org.itstack.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.card.IQiYiCardService;
import org.itstack.demo.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author luonianxin
 * @Description 会员卡发放服务
 * @Date 2021/8/22
 */
public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    /**
     *  爱奇艺会员卡处理服务,实际开发中应该交由Spring容器管理
     */
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

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

        String phoneNumber = queryUserPhoneNumberByUId(uId);
        iQiYiCardService.grantToken(phoneNumber,bizId);
        logger.info("请求参数［爱奇艺兑换卡］=>uId{} commodityId:{} bizId:{} extMap:{}",uId,commodityId,bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
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

