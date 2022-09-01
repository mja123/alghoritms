package codeSignal.lvl6;

/*
Better solution:
   return Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2;
        */
public class ChessBoardCellColor {
    boolean solution(String cell1, String cell2) {

        return color(cell1) == color(cell2);
    }
    boolean color(String cell) {
        boolean oddIndexLetter = ((cell.charAt(0) - 65) % 2) == 0;
        boolean evenNumber = (cell.charAt(1) % 2) != 0;

        //Is black cell
        return ((oddIndexLetter &&  !evenNumber) || (!oddIndexLetter && evenNumber));
    }

}

