package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.FlyBehavior;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:17
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用翅膀飞行！fly with wings");
    }
}
