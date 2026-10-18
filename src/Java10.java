import java.util.Scanner;
public class Java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += scanner.nextLong();
        }
        System.out.println(sum);
    }
}
