package operator;

import java.sql.SQLOutput;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5, b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출럭 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); //출력 a - b = 3

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // int형 끼리의 계산은 소숫점 반영이 안된다

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 몫 = 2, 나머지 = 1


    }
}
