package org.luonianxin.learn;

import org.luonianxin.learn.behavior.impl.FlyNoWay;
import org.luonianxin.learn.behavior.impl.Quack;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:49
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        // 一开始的模型鸭是不会飞的
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
