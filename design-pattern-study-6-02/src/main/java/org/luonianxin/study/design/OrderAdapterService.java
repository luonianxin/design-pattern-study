package org.luonianxin.study.design;

/**
 *  多个订单服务统一适配器，此处只是为了模拟接口适配的场景使用
 */
public interface OrderAdapterService {
    boolean isFirst(String uId);
}
