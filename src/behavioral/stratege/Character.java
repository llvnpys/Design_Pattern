package behavioral.stratege;

public abstract class Character {
    private WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public abstract void fight();
}
