package domaine;

public class King extends Piece{
    private String[][] movement;

    public King(String color, int[] position, String[][] movement) {
        super(color, position);
        this.movement = movement;
    }
}
