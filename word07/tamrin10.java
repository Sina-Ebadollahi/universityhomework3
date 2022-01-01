package word07;

import java.util.Scanner;

public class tamrin10 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n عنصر را از ورودي گرفته و مشخص نمايد عنصر تكراري بين آنها وجود دارد يا خير.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt(),i = 0;
        int[] A = new int[n];
        while(i < n){
            System.out.printf("Enter %d : ", i);
            A[i] = scanner.nextInt();
            i++;
        }
        int flag = 0;
        i = 0;
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
            System.out.println("there is no same element");
        }else{
            System.out.println("same element founded!");
        }
    }

}
