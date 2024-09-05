package latihan1;

import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kalkulator [] = new int[2];

        System.out.print("Masukan Bilangan Pertama:");
        kalkulator[0] = input.nextInt();

        System.out.print("Pilih Operator (+, -, x, /, %,): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukan Bilangan Kedua:");
        kalkulator[1] = input.nextInt();
        

        int result = 0;

        switch (operator){
            case '+':
                result = kalkulator[0] + kalkulator[1];
                break;
            case '-':
                result = kalkulator[0] - kalkulator[1];
                break;
            case 'x':
                result = kalkulator[0] * kalkulator[1];
                break;
            case '/':
                if (kalkulator[1] != 0){
                    result = kalkulator[0] / kalkulator[1];
            } else {
                System.out.println("Error: Pembagian Menggunakan 0");
                return;
            }
                break;
            case '%':
                if (kalkulator[1] != 0){
                    result = kalkulator[0] % kalkulator[1];
                }else {
                    System.out.println("Error: Pembagian Habis Menggunakan 0");
                    return;
                }
                break;
            default:
                System.out.println("ERROR!!");
                return;
        }

        System.out.println("Hasil: " + result);
    }
}