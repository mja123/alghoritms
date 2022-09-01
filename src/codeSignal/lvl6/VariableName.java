package codeSignal.lvl6;

public class VariableName {
    static boolean solution(String name) {
        return name.matches("[a-zA-Z_+][a-zA-Z_+0-9]*");
    }
    public static void main(String[] args) {
        System.out.println(solution("1var_1__int"));
    }
}
