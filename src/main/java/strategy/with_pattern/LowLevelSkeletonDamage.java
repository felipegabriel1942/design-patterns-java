package strategy.with_pattern;

public class LowLevelSkeletonDamage implements CalculateDamage {
    @Override
    public long calculate(Character character) {
        return character.getBaseDamage() * 2 / 3;
    }
}
