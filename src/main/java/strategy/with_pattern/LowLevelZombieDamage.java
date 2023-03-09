package strategy.with_pattern;

public class LowLevelZombieDamage implements CalculateDamage {
    @Override
    public long calculate(Character character) {
        return character.getBaseDamage() * 4 / 5;
    }
}
