package zoo;

public class BlackBear extends Animal {
    private static final int ATTACK_DMG = 100;
    private static final int HP = 200;

    public BlackBear() {
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
