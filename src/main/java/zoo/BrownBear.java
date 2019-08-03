package zoo;

public class BrownBear extends Animal {

    private static final int ATTACK_DMG = 100;
    private static final int HP = 200;

    public BrownBear() {
        super(HP);
    }

    @Override
    protected int getWeight() {
        return 100;
    }

    @Override
    protected void attack(Animal animal) {
        animal.setHp(animal.getHp() - ATTACK_DMG);
    }
}
