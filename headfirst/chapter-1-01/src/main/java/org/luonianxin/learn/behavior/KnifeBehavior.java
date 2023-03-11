package org.luonianxin.learn.behavior;

/**
 *  用匕首刺杀行为实现
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:29
 */
public class KnifeBehavior  implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用匕首刺杀");
    }
}
