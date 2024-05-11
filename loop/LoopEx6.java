package loop;

public class LoopEx6 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;

        for(int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println("//max=" + max);
        System.out.println(sum);
    }
}
