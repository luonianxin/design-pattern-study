package org.luonianxin.learn.design.pay.mode;

/**
 *  任何一个支付模式；刷脸、指纹、密码，都会过不同程度的安全风控，这里定义一个安全校验接口。
 *
 */
public interface IPayMode {

    /**
     *  判断当前环境是否安全，这里为了方便起见只传递了用户id，实际传递参数会有很多
     * @param uId 用户id
     * @return 环境校验
     */
    boolean security(String uId);
}
