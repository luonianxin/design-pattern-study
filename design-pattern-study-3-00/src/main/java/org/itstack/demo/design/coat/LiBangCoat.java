package org.itstack.demo.design.coat;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

public class LiBangCoat implements Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    @Override
    public String scene() {
        return "涂料";
    }

    /**
     * 品牌
     */
    @Override
    public String brand() {
        return "立邦";
    }

    /**
     * 型号
     */
    @Override
    public String model() {
        return "默认型号";
    }

    /**
     * 平米报价
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(750);
    }

    /**
     * 描述
     */
    @Override
    public String desc() {
        return "立邦始终以开发绿色产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求.";
    }
}
