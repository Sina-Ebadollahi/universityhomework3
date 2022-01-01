package word07;

import java.util.Scanner;

public class tamrin11 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه دو مجموعه m و n عضوي را از ورودي گرفته و اجتماع اين دو مجموعه را بدست آورد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        System.out.println("Enter 'm' Professor Pirahesh");
        int m = scanner.nextInt(),i = 0;
        int[] A = new int[m];
        int[] B = new int[n];
        int[] C = new int[m];
        while(i < m){
            System.out.printf("Enter %d for A : ", i);
            A[i] = scanner.nextInt();
            C[i] = A[i];
            i++;
        }
        i = 0;
        while(i < n){
            System.out.printf("Enter %d for B : ", i);
            B[i] = scanner.nextInt();
            ++i;
        }
        i = 0;
        int p = m;
        while(i < n){
            int j = 0, flag = 0;
            while(j < m){
                if(A[j] == B[i]){
                    flag = 1;
                }
                j++;
            }
            if(flag == 0){
                C[p - 1] = B[i];
                p++;
            }
            ++i;
        }
        i = 0;
        while(i < p - 1){
            System.out.println(C[i]);
            i++;
        }
    }
}
