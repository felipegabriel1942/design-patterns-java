package null_object.with_pattern;

public class Player {

    private String name;

    private Long level;

    private Long attack;

    private Long defense;

    private Long health;

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public void setAttack(Long attack) {
        this.attack = attack;
    }

    public void setDefense(Long defense) {
        this.defense = defense;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Long getLevel() {
        return level;
    }

    public Long getAttack() {
        return attack;
    }

    public Long getDefense() {
        return defense;
    }

    public Long getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                ", health=" + getHealth() +
                '}';
    }
}
