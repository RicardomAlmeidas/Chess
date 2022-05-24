package domaine;

public class Knight extends Piece{
    private String[][] movement;

    public Knight(String color, int[] position, String[][] movement) {
        super(color, position);
        this.movement = movement;
    }
}
