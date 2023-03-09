package strategy.no_pattern;

public class Damage {

    private Character character;

    public Damage(Character character) {
        this.character = character;
    }

    public double damageValue() {
        if (this.character instanceof Player) {
            if (this.character.getLevel() < 10) {
                return this.character.getBaseDamage() * 3 + 2;
            } else {
                return this.character.getBaseDamage() * 3 + 10;
            }

        } else if (character instanceof Skeleton) {
            if (this.character.getLevel() < 15) {
                return this.character.getBaseDamage() * 2 / 3;
            } else {
                return this.character.getBaseDamage() * 2 / 2;
            }

        } else if (character instanceof Zombie) {
            if (this.character.getLevel() < 12) {
                return this.character.getBaseDamage() * 4 / 5;
            } else {
                return this.character.getBaseDamage() * 4 / 3;
            }
        }

        return 0;
    }
}
