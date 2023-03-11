package org.luonianxin.learn.test;

import org.luonianxin.learn.Duck;
import org.luonianxin.learn.MallardDuck;

/**
 *  鸭子模拟器测试鸭子行为
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:42
 */
public class MiniDuckSimulator {

    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
