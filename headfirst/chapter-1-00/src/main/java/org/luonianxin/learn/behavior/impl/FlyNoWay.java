package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.FlyBehavior;

/**
 *  不会飞行为的实现
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:19
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
