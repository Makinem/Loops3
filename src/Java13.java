import java.util.Scanner;
public class Java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            if (num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}