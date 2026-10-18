import java.util.Scanner;
public class Java9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long count = 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i * i == x) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        System.out.println(count);
    }
}
