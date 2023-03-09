package strategy.no_pattern;

public class NoPattern {

    public static void main(String[] args) {
        Player player = new Player();
        player.setBaseDamage(10L);
        player.setLevel(25);

        Skeleton skeleton = new Skeleton();
        skeleton.setBaseDamage(3L);
        skeleton.setLevel(8);

        Zombie zombie = new Zombie();
        zombie.setBaseDamage(12L);
        zombie.setLevel(12);

        Damage playerDamage = new Damage(player);
        System.out.println("Player damage: " + playerDamage.damageValue());

        Damage skeletonDamage = new Damage(skeleton);
        System.out.println("Skeleton damage: " + skeletonDamage.damageValue());

        Damage zombieDamage = new Damage(zombie);
        System.out.println("Zombie damage: " + zombieDamage.damageValue());

    }
}
