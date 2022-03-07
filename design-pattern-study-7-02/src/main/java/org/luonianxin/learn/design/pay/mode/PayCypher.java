package org.luonianxin.learn.design.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayCypher implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    /**
     * 判断当前环境是否安全，这里为了方便起见只传递了用户id，实际传递参数会有很多
     *
     * @param uId 用户id
     * @return 环境校验
     */
    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控环境校验安全");
        return true;
    }
}
