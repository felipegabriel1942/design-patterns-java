package strategy.with_pattern;

public class HighLevelPlayerDamage implements CalculateDamage {
    @Override
    public long calculate(Character character) {
        return character.getBaseDamage() * 3 + 10;
    }
}
