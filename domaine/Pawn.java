package domaine;

public class Pawn extends Piece{
    private String[][] movement;

    public Pawn(String color, int[] position, String[][] movement) {
        super(color, position);
        this.movement = movement;
    }
}
