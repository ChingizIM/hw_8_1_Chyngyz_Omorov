package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero{

    public Warrior(String name, int health, int damage) {

        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void primenitSuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(3) + 1;
        boss.setHealth(boss.getHealth() - coeff * this.getDamage());
        System.out.println( " Warrior hits criticaly: " + coeff * this.getDamage());
    }
}
