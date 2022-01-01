package word06;

import java.util.Scanner;

public class tamrin6 {
    public static void main(String[] args) {
        // الگوريتمي بنويسيد كه تمامي اعداد ممكن براي شمارنده n رقمي در مبناي b را
        // محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        int i = 0;
        int[] A = new int[n];
        while (A[n - 1] == 0) {
            i = n;
            while (i > 0) {
                i--;
                System.out.print(A[i] + "\t");
            }
            A[0]++;
            i = 0;
            while (A[i] == b) {
                A[i] = 0;
                i++;
                A[i]++;
            }
        }
    }
}
