package Other;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i * i <= n) {
            if (n % n == 0)
                System.out.println(i * i);
            i++;
        }
    }
}