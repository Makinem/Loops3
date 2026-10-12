import java.util.Scanner;
public class Java4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        char d = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == d) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
