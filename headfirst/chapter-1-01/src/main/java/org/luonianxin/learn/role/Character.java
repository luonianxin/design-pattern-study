package org.luonianxin.learn.role;

import org.luonianxin.learn.behavior.WeaponBehavior;

/**
 *  角色抽象实现类
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 15:35
 */
public abstract class Character {
    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
    public abstract void fight();
}
