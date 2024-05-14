package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택 : ");

            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int amount = scanner.nextInt();
                balance += deposit(amount);
                System.out.println("현재 잔액 : " + balance + "원");
                System.out.println();

            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int amount = scanner.nextInt();

                if (balance >= amount) {
                    balance -= withdraw(amount);
                    System.out.println("현재 잔액 : " + balance + "원");
                    System.out.println();
                } else {
                    System.out.println(amount + "원을 출금하려 했으나, 잔액이 부족합니다.");
                }

            } else if (menu == 3) {
                System.out.println("현재 잔액 : " + balance);

            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int amount) {
        System.out.print(amount + "원을 입금하였습니다. ");
        return amount;
    }

    public static int withdraw(int amount) {
        System.out.print(amount + "원을 출금하였습니다. ");
        return amount;
    }
}
