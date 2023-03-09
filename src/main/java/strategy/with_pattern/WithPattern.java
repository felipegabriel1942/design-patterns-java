package strategy.with_pattern;

public class WithPattern {

    public static void main(String[] args) {
        var highLevelPlayer = new Player();
        highLevelPlayer.setBaseDamage(10L);
        highLevelPlayer.setLevel(25);

        var lowLevelPlayer = new Player();
        lowLevelPlayer.setBaseDamage(5L);
        lowLevelPlayer.setLevel(5);

        var lowLevelSkeleton = new Skeleton();
        lowLevelSkeleton.setBaseDamage(3L);
        lowLevelSkeleton.setLevel(8);

        var highLevelSkeleton = new Skeleton();
        highLevelSkeleton.setBaseDamage(4L);
        highLevelSkeleton.setLevel(18);

        var lowLevelZombie = new Zombie();
        lowLevelZombie.setBaseDamage(6L);
        lowLevelZombie.setLevel(5);

        var highLevelZombie = new Zombie();
        highLevelZombie.setBaseDamage(7L);
        highLevelZombie.setLevel(15);

        Damage highLevelPlayerDamage = new Damage(highLevelPlayer, new HighLevelPlayerDamage());
        System.out.println("High Level Player Damage: " + highLevelPlayerDamage.damageValue());

        Damage lowLevelPlayerDamage = new Damage(lowLevelPlayer, new LowLevelPlayerDamage());
        System.out.println("Low Level Player Damage: " + lowLevelPlayerDamage.damageValue());

        Damage highLevelSkeletonDamage = new Damage(highLevelSkeleton, new HighLevelSkeletonDamage());
        System.out.println("High Level Skeleton Damage: " + highLevelSkeletonDamage.damageValue());

        Damage lowLevelSkeletonDamage = new Damage(lowLevelSkeleton, new LowLevelSkeletonDamage());
        System.out.println("Low Level Skeleton Damage: " + lowLevelSkeletonDamage.damageValue());

        Damage highLevelZombieDamage = new Damage(highLevelZombie, new HighLevelZombieDamage());
        System.out.println("High Level Zombie Damage: " + highLevelZombieDamage.damageValue());

        Damage lowLevelZombieDamage = new Damage(lowLevelZombie, new LowLevelZombieDamage());
        System.out.println("Low Level Zombie Damage: " + lowLevelZombieDamage.damageValue());

    }
}
