import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz : ");
        int n = input.nextInt();
        int i = 1, max = 1, min = 1;

        if (n > 0) {
            while (n != 0) {
                System.out.println(i + ". sayiyi giriniz : ");
                int sayi1 = input.nextInt();
                if (i == 1) {
                    max = sayi1;
                    min = sayi1;
                }
                if (sayi1 > max) {
                    max = sayi1;
                }

                if (sayi1 < min) {
                    min = sayi1;
                }

                i++;
                n--;
            }
            System.out.println("En buyuk sayi : " + max);
            System.out.println("En kucuk sayi : " + min);
        } else{
            System.out.println("Hatali giris yapildi");
        }
    }
}