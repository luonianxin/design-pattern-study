package org.itstack.demo.design.coat;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

/**
 *  涂料
 *
 */
public class DuluxCoat implements Matter {
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
        return "多乐士(Dulux)";
    }

    /**
     * 型号
     */
    @Override
    public String model() {
        return "第二代";
    }

    /**
     * 平米报价
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    /**
     * 描述
     */
    @Override
    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }
}
