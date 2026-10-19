import java.util.Scanner;
public class Java12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int base = 1;
        while (n > 0) {
            result += (n % 10) * base;
            base *= 2;
            n /= 10;
        }
        System.out.println(result);
    }
}