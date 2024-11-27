public class Driver {

    public static void main(String[] cheese) {


        System.out.println("## Warrior Class");
        Warrior warrior = new Warrior("Curious Jorge", 50, 125, 20);

        warrior.attack();
        warrior.defend();
        warrior.useAbility();

        System.out.println();
        System.out.println("## Mage Class");
        Mage mage = new Mage("Nald", 60, 75, 25);


        mage.attack();
        mage.defend();
        mage.useAbility();
    }
}
