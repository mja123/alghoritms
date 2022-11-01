package codeSignal.lvl11;

import java.util.ArrayList;
import java.util.List;

public class ChessKnight {
    static int solution(String cell) {

        List<Integer> positions = new ArrayList<>();
        char currentColumn = cell.charAt(0);
        int currentRow = cell.charAt(1);

        if (currentColumn + 2 <= 104) {
            if (currentRow - 1 >= 49) {
                positions.add(1);
            }
            if (currentRow + 1 <= 56) {
                positions.add(1);
            }
        }
        if (currentColumn - 2 >= 97) {
            if (currentRow - 1 >= 49) {
                positions.add(1);
            }
            if (currentRow + 1 <= 56) {
                positions.add(1);
            }
        }

        if (currentRow + 2 <= 56) {
            if (currentColumn - 1 >= 97) {
                positions.add(1);
            }
            if (currentColumn + 1 <= 104) {
                positions.add(1);
            }
        }
        if (currentRow - 2 >= 49) {
            if (currentColumn - 1 >= 97) {
                positions.add(1);
            }
            if (currentColumn + 1 <= 104) {
                positions.add(1);
            }
        }
        return positions.size();

    }


    public static void main(String[] args) {
        solution("b7");
    }

}
