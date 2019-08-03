package zoo;

import java.time.LocalDateTime;
import java.util.Optional;

public abstract class Animal {

    private int hp;
    private static final long LAST_WITHOUT_EAT = 10L;
    private LocalDateTime eatTime;

    public Animal(int hp) {
        this.hp = hp;
    }

    protected void eat() {
        eatTime = LocalDateTime.now();
    }

    protected boolean isAlive() {

//        if (eatTime == null) {
//            return false;
//        }
       // boolean isFed = bearTimeLastWithoutEat.isAfter(eatTime) || bearTimeLastWithoutEat.isEqual(eatTime);
//        return isFed;

        // Z UZYCIEM OPTIONAL
        return Optional.ofNullable(eatTime)
                .map(e -> isFed() && hp > 0)
                .orElse(false);
    }

    private boolean isFed() {
        LocalDateTime bearTimeLastWithoutEat = LocalDateTime.now().plusDays(LAST_WITHOUT_EAT);
        return bearTimeLastWithoutEat.isAfter(eatTime) || bearTimeLastWithoutEat.isEqual(eatTime);
    }

    protected abstract int getWeight();

    protected abstract void attack(Animal animal);

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
