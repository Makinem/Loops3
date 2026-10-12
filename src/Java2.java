import java.util.Scanner;
public class Java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            for (int i = a; i <= b; i++) {
                if ((i % d + d) % d == c) {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
