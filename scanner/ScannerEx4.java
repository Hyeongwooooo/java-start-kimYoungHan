package scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = input.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
