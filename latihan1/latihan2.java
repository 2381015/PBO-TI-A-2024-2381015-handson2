package latihan1;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Bilangan Pertama : ");
        bilangan[0] = input.nextInt();

        System.out.println("Masukan Bilangan Kedua : ");
        bilangan[1] = input.nextInt();

        System.out.println("Masukan Bilangan Ketiga : ");
        bilangan[2] = input.nextInt();

        int max = bilangan[0];
        if (bilangan[1] > max) {
            max = bilangan[1];
        }
        if (bilangan[2] > max) {
            max = bilangan[2];
        }

        System.out.println("Bilangan terbesar adalah: " + max);
    }
}