package metier;

import java.util.HashMap;

public class GameManagement {
    private String[][] gameState =
            {{"br", "bh", "bb", "bq", "bk", "bb", "bh", "br"},
                    {"bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp"},
                    {"f", "f", "f", "f", "f", "f", "f", "f"},
                    {"f", "f", "f", "f", "f", "f", "f", "f"},
                    {"f", "f", "f", "f", "f", "f", "f", "f"},
                    {"f", "f", "f", "f", "f", "f", "f", "f"},
                    {"wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp"},
                    {"wr", "wh", "wb", "wk", "wq", "wb", "wh", "wr"}};
    private String ROOK = "r";
    private String KNIGHT = "h";
    private String BISHOP = "b";
    private String QUEEN = "q";
    private String KING = "k";
    private String PAWN = "p";
    

    private void pieceGeneration() {
        for(String[] lign : gameState) {
            for(String square : lign) {
                if(square.length() > 1) {
                    switch (square.charAt(1)){
                        case PAWN:
                            break;
                        case ROOK:
                            break;
                        case KNIGHT:
                            break;
                        case BISHOP:
                            break;
                        case QUEEN:
                            break ;
                        case KING:
                            break;
                        case KING:
                            break;
                    }
                }
            }
        }
    }
}
