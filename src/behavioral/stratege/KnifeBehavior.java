package behavioral.stratege;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("탁탁");
    }
}
