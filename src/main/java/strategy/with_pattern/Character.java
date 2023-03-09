package strategy.with_pattern;

public abstract class Character {

    private Integer level;

    private Long baseDamage;

    public Long getBaseDamage() {
        return baseDamage;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setBaseDamage(Long baseDamage) {
        this.baseDamage = baseDamage;
    }
}
