package org.itstack.demo.design.coupon;

/**
 * 模拟优惠券服务
 */
public class CouponService {

    /**
     *  模拟发放优惠券方法
     * @param uId　用户ＩＤ
     * @param couponNumber　奖品编号
     * @param uuid　业务ｉｄ
     * @return 优惠券发放结果
     */
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
