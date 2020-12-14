package game.strategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void attackDamage() {
        Attacks axe = new AxeAttack();
        assertTrue (axe.attackDamage() == 20);

        Attacks sword = new SwordAttack();
        assertTrue (sword.attackDamage() == 15);

        Attacks bow = new BowAttack();
        assertTrue (bow.attackDamage() == 10);

        Attacks fist = new FistAttack();
        assertTrue (fist.attackDamage() == 5);
    }
}