package null_object.with_pattern;

public class WithPattern {

    public static void main(String[] args) {
        var player = PlayerFactory.createPlayer();
        System.out.println(player);
    }
}
