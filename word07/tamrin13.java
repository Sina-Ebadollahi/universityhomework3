package word07;

import java.util.Scanner;

public class tamrin13 {
    public static void main(String[] args) {
        // لگوريتمي بنويسيد كه دو مجموعه m و n عضوي را از ورودي گرفته و تفاضل اين دو مجموعه را بدست آورد.(A-B)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        System.out.println("Enter 'm' Professor Pirahesh");
        int m = scanner.nextInt();
        int i = 0;
        int[] A = new int[m];
        int[] B = new int[n];
        int[] C = new int[m];
        while(i < m){
            System.out.printf("Enter %d for A : ", i);
            A[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        while(i < n){
            System.out.printf("Enter %d for B : ", i);
            B[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        int p = 0;
        while(i < m){
            int flag = 0, j = 0;
            while(j < n){
                if(A[i] == B[j]){
                    flag = 1;
                }
                j++;
            }
            if(flag == 0){
                C[p] = A[i];
                p++;
            }
            i++;
        }
        i = 0;
        for(;i < p;i++){
            System.out.println(C[i]);
        }
    }
}
