package strategy.with_pattern;

public class HighLevelZombieDamage implements CalculateDamage {
    @Override
    public long calculate(Character character) {
        return character.getBaseDamage() * 4 / 3;
    }
}
