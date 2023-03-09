package null_object.no_pattern;

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

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                '}';
    }
}
