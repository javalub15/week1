package zoo;

public class Bear extends Animal {

    private static final int ATTACK_DMG = 50;
    private static final int HP = 50;

    public Bear() {
        super(HP);
    }


    @Override
    protected int getWeight() {
        return 50;
    }

    @Override
    protected void attack(Animal animal) {
        animal.setHp(animal.getHp() - ATTACK_DMG);
    }
}
