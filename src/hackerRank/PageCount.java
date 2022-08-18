package hackerRank;

public class PageCount {
    public static int pageCount(int n, int p) {
        if ((((n - p) == 1) && (p % 2 == 0)) || (p == 1)) {
            return 0;
        }
        if ((((n - p) == 1) && (p % 2 != 0))) {
            return 1;
        }
        //Starting from the beginning
        if ((n - p) < p) {
            return (n - p) / 2;
        }
        return p / 2;
    }
    public static void main(String[] args) {
        System.out.println(pageCount(5, 4));
    }
}
