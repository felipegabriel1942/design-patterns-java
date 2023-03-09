package strategy.with_pattern;

public class Damage {

    private CalculateDamage damage;

    private Character character;

    public Damage(Character character, CalculateDamage damage) {
        this.character = character;
        this.damage = damage;
    }

    public double damageValue() {
        return this.damage.calculate(this.character);
    }
}
