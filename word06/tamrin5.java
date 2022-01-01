package word06;

import java.util.Scanner;

public class tamrin5 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه سطر nام مثلث خيام-پاسكال را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n Professor Pirahesh");
        int n = scanner.nextInt(), i = 1;
        int[] A = new int[n];
        A[0] = 1;
        while( i < n){
            int k = i;
            while(k > 0){
                A[k] += A[k - 1];
                --k;
            }
            i++;
        }
        for(int j = 0; j < n; j++){
            System.out.println(A[j]);
        }
        scanner.close();
    }
}
