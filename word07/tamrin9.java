package word07;

import java.util.Scanner;

public class tamrin9 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تركيبات بدون تكرار k عنصر در n خانه را محاسبه نمايد.(Permutation)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        System.out.println("Enter 'k' Professor Pirahesh");
        int k = scanner.nextInt(), i = 0;
        int[] A = new int[n];
        int[] B = new int[k];
        while(i < k){
            System.out.printf("Enter %d : ", i);
            B[i] = scanner.nextInt();
            i++;
        }
        while(A[n - 1] == 0){
            i = 0;
            int flag = 0;
            while(i < n){
                int j = i + 1;
                while(j < n){
                    if(A[i] == A[j]){
                        flag = 1;
                    }
                    j++;
                }
                i++;
            }
            if(flag == 0){
                i = n;
                while(i > 0){
                    i--;
                    System.out.println(B[A[i]]);
                }

            }
            A[0]++;
            i = 0;
            while(A[i] == k){
                A[i] = 0;
                i++;
                A[i]++;
            }
        }
    }
}
