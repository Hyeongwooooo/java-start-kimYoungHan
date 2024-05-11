package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 8;

        String evenOdd = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ". x 는 " + evenOdd + "입니다.");
    }
}
