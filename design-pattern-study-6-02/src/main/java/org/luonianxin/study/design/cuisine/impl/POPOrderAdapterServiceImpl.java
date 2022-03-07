package org.luonianxin.study.design.cuisine.impl;

import org.luonianxin.study.design.OrderAdapterService;
import org.luonianxin.study.design.service.OrderService;
import org.luonianxin.study.design.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
