package metier;

import domaine.Pawn;

import java.util.ArrayList;
import java.util.HashMap;


import domaine.*;

public class GameManagement {
    private HashMap<String, ArrayList<Piece>> pieces = new HashMap<>();



    private void pieceGeneration() {
        pieces.put("Black", new ArrayList<>());
        pieces.put("White", new ArrayList<>());
        pieces.get("Black").add(new Rook("Black", new int[]{0, 0}));
    }
}
