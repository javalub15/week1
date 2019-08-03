package zoo;

public class PolarBear extends Animal {

    private static final int ATTACK_DMG = 75;
    private static final int HP = 150;

    public PolarBear() {
        super(HP);
    }

    @Override
    protected int getWeight() {
        return 200;
    }

    @Override
    protected void attack(Animal animal) {
        animal.setHp(animal.getHp() - ATTACK_DMG);
    }


}
