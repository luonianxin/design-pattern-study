package org.luonianxin.study.design;

import org.itstack.demo.design.Matter;

/**
 *  装修清单抽象，包含了 吊顶、涂料、地板、地砖、明细 五大清单元素
 *
 *  接口类中定义了填充各项物料的方法；吊顶、涂料、地板、地砖，以及最终提供获取全部明细的方法。
 */
public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
