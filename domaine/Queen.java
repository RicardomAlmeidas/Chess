package domaine;

public class Queen extends Piece{
    private String[][] movement;

    public Queen(String color, int[] position, String[][] movement) {
        super(color, position);
        this.movement = movement;
    }
}
