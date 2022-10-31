package codeSignal.lvl10;

public class MACValidation {
    boolean solution(String inputString) {
        return inputString.matches("([\\dA-F]{2}-){5}[\\dA-F]{2}");
    }
}
