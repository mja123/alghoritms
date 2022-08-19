package codeSignal.lvl1;

public class CenturyYear {
    static int solution(int year) {

        float century = (float) year / 100;

        if ((century - (int) century) >= 0.0099) {
            return (int) century + 1;
        }

        return (int) century;
    }

  public static void main(String[] args) {
    System.out.println(solution(201));
  }
}
