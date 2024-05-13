package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        String[] productNames = new String[productCount];
        int[] productPrices = new int[productCount];

        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        System.out.print("메뉴를 선택하세요 : ");
        int option = scanner.nextInt();

        while (true) {
            if (option == 1) {
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다. (최대 10개)");
                    break;
                }
            } else if (option == 2) {
                System.out.println("상품 목록은 다음과 같습니다.");
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
