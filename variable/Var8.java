package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -21억 정도 ~ 21억 정도\

        long l = 9223372036854775807L; // 19자리의 숫자정도 표현 가능

        // 실수
        float f = 10.0f;
        double d = 10.0;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
