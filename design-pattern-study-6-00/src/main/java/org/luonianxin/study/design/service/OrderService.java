package org.luonianxin.study.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private Logger logger  = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderAccount(String userId){
        logger.info("自营商家，查询用户订单是否为首单：{}",userId);
        return 10L;
    }
}
