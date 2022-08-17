public class FIzzBuzz {
  public static void fizzBuzz(int n) {
    for (int i = 1; i < n + 1; i++) {
          if (i % 3 == 0) {
            if (i % 5 == 0) {
              System.out.println("FizzBuzz");
            } else {
              System.out.println("Fizz");
            }
          } else if (i % 5 == 0) {
            System.out.println("Buzz");
          } else {
            System.out.println(i);
          }
        }
    }

  public static void main(String[] args) {
      fizzBuzz(15);
  }
}
