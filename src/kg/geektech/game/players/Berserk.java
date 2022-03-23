package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero{

    public Berserk(String name, int health, int damage) {
        super(name, health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT);

    }

    @Override
    public void primenitSuperPower(Boss boss, Hero[] heroes) {

        int revert = this.getDamage()+ boss.getDamage();


        boss.setHealth(boss.getHealth() - revert );
        System.out.println( " Revert: " + revert );
    }

    }

