package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalprice = 0;

        while (true) {
            System.out.println("1: 상품 입력 , 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();


            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();

                System.out.print("상품가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("상품수량을 입력하세요 : ");
                int quantity = scanner.nextInt();

                totalprice += price * quantity;

                System.out.println("상품명 : " + name + ", 상품가격 : " + price + ", 상품수량 : " + quantity + "합계 : " + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalprice);
                totalprice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 입력해주세요.");
            }


        }


        }
    }
