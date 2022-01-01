package word06;

import java.util.Scanner;

public class tamrin4 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تا سطر nام مثلث خيام-پاسكال را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n Professor Pirahesh");
        int n = scanner.nextInt(), i = 1;
        int[] A = new int[n + 1];
        A[0] = 1;
       while(i <= n){
           for(int j = 0; j < i; j++){
               System.out.print(A[j]);
           }
           int k = i;
           while(k > 0){
               A[k] += A[k - 1];
               k--;
           }
           i++;
       }

    }
}
