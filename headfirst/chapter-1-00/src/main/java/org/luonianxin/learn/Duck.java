package org.luonianxin.learn;

import org.luonianxin.learn.behavior.FlyBehavior;
import org.luonianxin.learn.behavior.QuackBehavior;

/**
 *  headfirst第一章抽象duck类
 *   整合鸭子的行为
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:13
 */
public abstract class Duck {
    protected QuackBehavior quackBehavior;

    protected FlyBehavior flyBehavior;

    /**
     *  使用performFly替换掉原设计的fly方法
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     *  使用performQuack替代原来的quack方法
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     *  所有的鸭子都会漂即使是诱饵鸭
     */
    public void swim(){
        System.out.println("All Ducks float, even decoys!");
    }

    /**
     *  由于橡皮鸭、真实的绿头鸭、木头鸭等的形状各有不同，所以它们的展现方法
     *  设计成抽象的
     */
    public abstract void display();


    /**
     *  为了动态设定鸭子的行为引入两个方法
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
