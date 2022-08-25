package codeSignal.lvl4;

public class AreSimilar {
    boolean solution(int[] a, int[] b) {
        Integer differentElementA = null;
        Integer differentElementB = null;
        boolean swap = false;

        for (int i = 0; i < b.length; i++) {
            if(a[i] == b[i]) {
                continue;
            }
            if (swap) {
                return false;
            }
            if (differentElementA == null) {
                differentElementA = a[i];
                differentElementB = b[i];
                continue;
            }
            if ((b[i] != differentElementA) || (a[i] != differentElementB)) {
                return false;
            }
            swap = true;
        }
        return true;
    }
}
