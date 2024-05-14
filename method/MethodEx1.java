package method;

public class MethodEx1 {

    public static void main(String[] args) {
        System.out.println("평균값 : " + averageMethod(1,2,3));
        System.out.println("평균값 : " + averageMethod(15,25,35));
    }

    public static double averageMethod(int a, int b, int c) {
        int sum = (a + b + c);
        return sum / 3.0;
    }
}
