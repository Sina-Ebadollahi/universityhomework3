package word06;

import java.util.Scanner;

public class tamrin1 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته و اعداد بزرگتر از ميانگين را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int sum = 0, c;
        int[] a = new int[n];
        for(c = 0; c < n; c++){
            System.out.println("Enter a number Professor Pirahesh");
            a[c] = scanner.nextInt();
            sum += a[c];
        }
        int avg = sum / n;
        System.out.println("The average is : " + avg);
        c = 0;
        while(c < n){
            if(avg < a[c]){
                System.out.println("the number that is bigger than average : " + a[c]);
            }
            ++c;
        }
        scanner.close();
    }
}
