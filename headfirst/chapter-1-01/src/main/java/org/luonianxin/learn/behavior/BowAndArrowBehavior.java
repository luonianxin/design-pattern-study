package org.luonianxin.learn.behavior;

/**
 *  弓箭使用方式行为
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:31
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用弓箭射击");
    }
}
