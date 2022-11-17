package codeSignal.core.lvl1;

public class SeatsInTheater {
    int solution(int nCols, int nRows, int col, int row) {
        return (nRows - row - 1) * (nCols - col) + nCols - col + nRows - row;
    }
}
