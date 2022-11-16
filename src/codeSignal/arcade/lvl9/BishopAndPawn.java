package codeSignal.arcade.lvl9;

public class BishopAndPawn {
    boolean solution(String bishop, String pawn) {
        return(Math.abs(bishop.charAt(0) - pawn.charAt(0))) == (Math.abs(bishop.charAt(1) - pawn.charAt(1)));
    }

}
