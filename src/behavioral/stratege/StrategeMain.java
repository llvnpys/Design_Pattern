package behavioral.stratege;

public class StrategeMain {
    public static void main(String[] args) {
        Character[] characters = {new King(), new Queen(), new Knight(), new Troll()};
        characters[0].setWeapon(new SwordBehavior());
        characters[1].setWeapon(new BowAndArrowBehavior());
        characters[2].setWeapon(new KnifeBehavior());
        characters[3].setWeapon(new AxeBehavior());

        for (Character character : characters) {
            character.fight();
        }


    }
}
