import java.util.Scanner;
public class Java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int start = (int) Math.ceil(Math.sqrt(a));
        for (int i = start; i * i <= b; i++) {
            System.out.print((i * i) + " ");
        }
        scanner.close();
    }
}