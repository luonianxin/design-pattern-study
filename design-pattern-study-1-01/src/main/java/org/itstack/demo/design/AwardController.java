package org.itstack.demo.design;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.card.IQiYiCardService;
import org.itstack.demo.design.coupon.CouponResult;
import org.itstack.demo.design.coupon.CouponService;
import org.itstack.demo.design.goods.DeliverReq;
import org.itstack.demo.design.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author luonianxin
 * @Description 模式发奖服务
 * @Date 2021/8/20
 */
public class AwardController {

    private Logger logger = LoggerFactory.getLogger(AwardController.class);

    /**
     *  发奖品接口，此处使用一陀陀代码实现(if...else)
     * @param awardReq
     * @return
     */
    public AwardRes awartToUser(AwardReq awardReq) {
        String reqStr = JSON.toJSONString(awardReq);
        AwardRes awardRes = null;
        try{
            logger.info("奖品发放开始,{},请求参数awardReq：{}",awardReq.getuId(),reqStr);
            // 按照不同类型发放商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if(awardReq.getAwardType() == 1){
                CouponService couponService = new CouponService();
                CouponResult couponResult =  couponService.sendCoupon(awardReq.getuId(),awardReq.getAwardNumber(),awardReq.getBizId());
                if("0000".equals(couponResult.getCode())){
                    awardRes = new AwardRes("0000","发放成功");
                }else{
                    awardRes = new AwardRes("0001",couponResult.getInfo());
                }
            }else if(awardReq.getAwardType() == 2){
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(awardReq.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(awardReq.getuId()));
                deliverReq.setSku(awardReq.getAwardNumber());
                deliverReq.setOrderId(awardReq.getBizId());
                deliverReq.setConsigneeUserName(awardReq.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(awardReq.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(awardReq.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if(isSuccess){
                    awardRes = new AwardRes("0000","发放成功");
                }else{
                    awardRes = new AwardRes("0001","发放失败");
                }
            }else if(awardReq.getAwardType() == 3){
                String bindMobileNumber = queryUserPhoneNumber(awardReq.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber,awardReq.getAwardNumber());
                awardRes = new AwardRes("0000","发放成功");
            }else{
                throw  new RuntimeException("不存在的奖品类型："+ awardReq.getAwardType());
            }
        }catch (Exception e){
            logger.error("奖品发放失败{}。req:{}", awardReq.getuId(), reqStr, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }
        return awardRes;
    }

    /**
     *  模拟根据用户ＩＤ从数据库查询用户名（实际开发中返回的应该是一个实体类对象）
     * @param uId 用户ｉｄ
     * @return 用户名
     */
    private String queryUserName(String uId) {
        return "胡歌";
    }
    /**
     *  模拟根据用户ＩＤ从数据库查询用户手机号（实际开发中返回的应该是一个实体类对象）
     * @param uId 用户ｉｄ
     * @return 用户手机号
     */
    private String queryUserPhoneNumber(String uId) {
        return "13606068848";
    }

}

