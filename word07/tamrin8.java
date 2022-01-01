package word07;

import java.util.Scanner;

public class tamrin8 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تمامي  تركيبات k عنصر در n خانه را محاسبه نمايد.(Combination)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        System.out.println("Enter 'k' Professor Pirahesh");
        int k = scanner.nextInt();
        int i = 0;
        int[] B = new int[k];
        int[] A = new int[n];
        while(i < k){
            System.out.printf("Enter %d : ", i);
            B[i] = scanner.nextInt();
            i++;
        }
        while(A[n - 1] == 0){
            i = n;
            while(i > 0){
                i--;
                System.out.print(B[A[i]] + "\t");
            }
            A[0]++;
            while(A[i] == k){
                A[i] = 0;
                i++;
                A[i]++;
            }
        }

    }
}
