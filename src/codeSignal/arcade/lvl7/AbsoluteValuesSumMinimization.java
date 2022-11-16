package codeSignal.arcade.lvl7;

/*
Better solution: return A[(A.length-1)/2];
 */
public class AbsoluteValuesSumMinimization {
    int solution (int[] a) {
        if ((a.length % 2 == 0) && (a.length > 1)) {
            return a[a.length / 2 - 1];
        }
        return a[a.length / 2];
    }

}
