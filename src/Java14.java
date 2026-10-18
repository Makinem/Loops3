import java.util.Scanner;
public class Java14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        System.out.println(zeros + " " + positives + " " + negatives);
    }
}