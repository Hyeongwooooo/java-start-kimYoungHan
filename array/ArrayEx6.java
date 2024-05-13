package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요 : ");
        int[] num = new int[count];
        int minNumber, maxNumber;

        num[0] = scanner.nextInt();
        minNumber = num[0];
        maxNumber = num[0];

        for (int i = 1; i < num.length; i++) {
            num[i] = scanner.nextInt();
            if (minNumber > num[i]) {
                minNumber = num[i];
            }
            if (maxNumber < num[i]) {
                maxNumber = num[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);

    }
}
