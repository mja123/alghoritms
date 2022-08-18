package hackerRank;

public class FlipBits {
    public static long flippingBits(long n) {
        //count of bits
        int bits = 31;
        long maxValue = 0;

        //the biggest value of n bits
        while (bits != -1) {
            maxValue += Math.round(Math.pow(2, bits));
            bits--;
        }
        //1 complement
        return maxValue - n;
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(3));
    }
}
