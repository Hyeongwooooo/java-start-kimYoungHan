package loop;

public class LoopEx5 {
    public static void main(String[] args) {
        int i = 1;
        int max = 100;
        int sum = 0;

        while(i <= max) {
            sum += i;
            i++;
        }

            System.out.println("//max=" + max);
            System.out.println(sum);

    }
}
