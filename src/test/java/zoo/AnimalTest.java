package zoo;

import org.junit.Test;
import zoo.Bear;

import static org.junit.Assert.*;

public class AnimalTest {



    @Test
    public void testShuldReturnTrueIfBearAte5DaysAgo() {
        Bear bear = new Bear();
        boolean result = bear.isAlive();
        bear.eat();
        boolean result2 = bear.isAlive();
        assertFalse(result);
        assertTrue(result2);
    }

    @Test
    public void testAssertFalseIfPolarBearAttacked3TimesBlackBear() {
        PolarBear polarBear = new PolarBear();
        BlackBear blackBear = new BlackBear();
        blackBear.eat();
        polarBear.attack(blackBear);
        boolean attackedFirstTime = blackBear.isAlive();
        polarBear.attack(blackBear);
        boolean attackedSecondTime = blackBear.isAlive();
        polarBear.attack(blackBear);
        boolean attackedThirdTime = blackBear.isAlive();
        assertTrue(attackedFirstTime);
        assertTrue(attackedSecondTime);
        assertFalse(attackedThirdTime);



    }
}