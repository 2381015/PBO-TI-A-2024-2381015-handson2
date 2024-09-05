package latihan1;

import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan Pertama: ");
        int num1 = input.nextInt();

        System.out.print("Masukan Bilangan Kedua: ");
        int num2 = input.nextInt();

        System.out.print("Pilih Operator (+, -, x, /, %): ");
        char operator = input.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }

        System.out.println("Hasil: " + result);
    }
}