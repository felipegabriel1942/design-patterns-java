package null_object.no_pattern;


public class PlayerFactory {

    public static Player createPlayer() {
        var playerExists = Math.round(Math.random()) == 0;

        if (playerExists) {
            var player = new Player();
            player.setLevel(10L);
            player.setAttack(7L);
            player.setDefense(6L);
            player.setHealth(125L);
            player.setName("Cloud");
            return player;
        } else {
            return null;
        }
    }
}
