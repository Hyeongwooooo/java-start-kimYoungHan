package method;

public class MethodEx2 {

    public static void main(String[] args) {
        pringMessage("Hello, world",3);
        pringMessage("Java",5);
        pringMessage("good",7);
    }

    public static void pringMessage(String message, int times) {
        for (int a = 0; a < times; a++) {
            System.out.println(message);
        }
    }
}
