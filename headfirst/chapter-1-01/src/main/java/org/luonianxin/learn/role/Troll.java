package org.luonianxin.learn.role;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:39
 */
public class Troll extends Character{
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
