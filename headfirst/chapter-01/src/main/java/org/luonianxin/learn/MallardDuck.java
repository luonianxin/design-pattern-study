package org.luonianxin.learn;

import org.luonianxin.learn.behavior.impl.FlyWithWings;
import org.luonianxin.learn.behavior.impl.Quack;

/**
 *  真实的绿头鸭
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:38
 */
public class MallardDuck extends Duck {
    /**
     *  这里只是暂时针对实现编程，后续会引入其他模式修正这一点
     */
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
