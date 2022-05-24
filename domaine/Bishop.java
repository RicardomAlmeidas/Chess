package domaine;

public class Bishop extends Piece{
    private String[][] movement;

    public Bishop(String color, int[] position, String[][] movement) {
        super(color, position);
        this.movement = movement;
    }
}
