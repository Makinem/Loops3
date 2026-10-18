import java.util.Scanner;
public class Java12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 2 + (s.charAt(i) - '0');
        }
        System.out.println(result);
    }
}