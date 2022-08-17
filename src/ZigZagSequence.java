import java.util.Arrays;

public class ZigZagSequence {

  public static void findZigZagSequence(int[] a, int n) {
    Arrays.sort(a);
    int mid = (n + 1) / 2; //4
    int temp = a[mid]; //5
    a[mid] = a[n - 1];//7
    a[n - 1] = temp;//5

    int st = mid + 1; // 5
    int ed = n - 1; // 6
      //1, 2, 3, 4, 5, 6, 7
      //1, 2, 3, 4, 7, 6, 5
      //1, 2, 3, 4, 7, 5, 6
      //1, 2, 3, 7, 6, 5, 4
    while (st <= ed) { // 6<=4
      temp = a[st]; // 5 = 6
      a[st] = a[ed]; // 6=4
      a[ed] = temp; // 4=6
      st = st + 1;
      ed = ed + 1;
    }
  }
   /* public static void findZigZagSequence(int [] a, int n){
       Arrays.sort(a);
        //Find the middle position
        int mid = (n + 1)/2;
        //Value in the middle position
        int temp = a[mid];
        //Change the value in the middle position for the last element
        a[mid] = a[n - 1];
        //Set the last element with the middle value
        //a[n - 1] = temp;
        //Set the last element with the first element
        a[n - 1] = a[0];

        //Creasing
        int st = mid + 1;
        //Decreasing
        int ed = mid - 1;
        //Middle element
        while(st >= ed){
            //0 1 2 3 4 5 6
            //temp = 3
            //st = 4
            //ed = 2

            //temp = 4
            //a[st] = 2
            //a[ed] = 4
            //The element in the middle will crease
            temp = a[st];
            //The element that is decreasi
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }*/

  public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
      findZigZagSequence(numbers, 7);
  }
}
