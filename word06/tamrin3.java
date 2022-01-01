package word06;

import java.util.Scanner;

public class tamrin3 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته و بصورت نزولي مرتب نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int[] A = new int[n];
        int i = 0;
        for(; i < n; i++){
            System.out.printf("Enter %d : ", i + 1);
            A[i] = scanner.nextInt();
        }
        i = 0;
        while(i < n){
            for(int j = i + 1;j < n; j++){
                if(A[i] < A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] =  temp;
                }
            }
            ++i;
        }
        i = 0;
        while(i < n){
            System.out.printf("%d\t", A[i]);
            ++i;
        }
        scanner.close();
    }
}
