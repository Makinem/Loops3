import java.util.Scanner;
public class Java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - '0';
        }
        System.out.println(sum);
        scanner.close();
    }
}