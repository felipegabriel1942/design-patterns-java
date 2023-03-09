package null_object.no_pattern;

public class NoPattern {

    public static void main(String[] args) {
        var player = PlayerFactory.createPlayer();

        if (player == null) {
            player = new Player();
            player.setLevel(1L);
            player.setAttack(2L);
            player.setDefense(1L);
            player.setHealth(20L);
            player.setName("New Player");
        }

        System.out.println(player);
    }
}
