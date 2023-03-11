package org.luonianxin.learn.behavior;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:32
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用斧头劈砍");
    }
}
