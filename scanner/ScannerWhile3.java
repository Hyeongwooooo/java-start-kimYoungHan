package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력할 때까지 모든 수를 더합니다.");

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("모든 숫자의 합은 : " + sum);
    }
}
