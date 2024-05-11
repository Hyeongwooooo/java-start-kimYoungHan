package loop;

public class LoopEx8 {
    public static void main(String[] args) {
        int rows = 5;

        for (int count = 1; count <= rows; count++){
            for (int i = 1; i <= count; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
