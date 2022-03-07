package org.luonianxin.study.design.cuisine.impl;

import org.luonianxin.study.design.OrderAdapterService;
import org.luonianxin.study.design.service.OrderService;

public class InsideOrderServiceImpl implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    /**
     *  判断用户是否是首次下单
     * @param uId 用户id
     * @return
     */
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderAccount(uId) < 1;
    }
}
