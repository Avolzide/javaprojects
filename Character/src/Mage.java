public class Mage extends Character implements SpecialAbility{

    private int magic;

    public Mage(String name, int level, int health, int magic) {
        super(name, level, health);
        this.magic = magic;
    }

    @Override
    protected void attack() {
        System.out.println("Attack spell: Paradox");
    }

    @Override
    protected void defend() {
        System.out.println("Cast defense spell: Manaward");
    }

    @Override
    public void useAbility() {
        System.out.println("Limit Break: Soul Resonance");
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
