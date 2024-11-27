public class Warrior extends Character implements SpecialAbility {

    private int strength;

    public Warrior(String name, int level, int health, int strength) {
        super(name, level, health);
        this.strength = strength;
    }

    @Override
    protected void attack() {
        System.out.println("Attacks with Primal Rend Axe");
    }

    @Override
    protected void defend() {
        System.out.println("Heals using Bloodwhetting");
    }

    @Override
    public void useAbility() {
        System.out.println("Limit Break: Vengeance");
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
