package org.luonianxin.learn.behavior;

/**
 *  宝剑挥舞实现类
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:33
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用宝剑挥舞");
    }
}
