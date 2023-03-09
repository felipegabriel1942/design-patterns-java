package strategy.with_pattern;

public class HighLevelSkeletonDamage implements CalculateDamage {
    @Override
    public long calculate(Character character) {
        return character.getBaseDamage() * 2 / 2;
    }
}
