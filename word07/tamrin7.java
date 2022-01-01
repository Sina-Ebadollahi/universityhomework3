package word07;

import java.util.Scanner;

public class tamrin7 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تمامي زيرمجموعه‌هاي يك مجموعه n عضوي را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt(), i = 0;
        int[] A = new int[n];
        int[] B = new int[n];
        while(i < n){
            System.out.printf("Enter  %d : ", i);
            B[i] = scanner.nextInt();
            i++;
        }
        while(A[n - 1] == 0){
            i = n;
            while(i > 0){
                i--;
                if(A[i] == 1){
                    System.out.println(B[i]);
                }
            }
            A[0]++;
            i = 0;
            while(A[i] == 2){
                A[i] = 0;
                i++;
                A[i]++;
            }
        }

    }
}
