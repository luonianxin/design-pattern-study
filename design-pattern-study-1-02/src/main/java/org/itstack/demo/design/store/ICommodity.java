package org.itstack.demo.design.store;

import java.util.Map;

/**
 *  商品(奖品等)发放接口
 * @author lnx
 */
public interface ICommodity {
    /**
     *  　发放接口方法
     * @param uId　领取奖品的用户ID
     * @param commodityId　奖品（商品）ID
     * @param bizId 业务ID
     * @param extMap　拓展参数
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
