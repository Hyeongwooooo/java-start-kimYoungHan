package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-1을 입력하면 프로그램 종료");

        while (true) {

            System.out.print("상품의 가격을 입력하세요 : ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료.");
                break;
            }

            System.out.print("상품의 수량을 입력하세요 : ");
            int quantity = input.nextInt();

            int totalCost = price * quantity;
            System.out.println("총 비용 : " + totalCost);


            }
        }
    }