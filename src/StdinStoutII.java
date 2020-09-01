import java.util.Scanner;

public class StdinStoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code  int i = scan.nextInt();


        Double d = scan.nextDouble();
        scan.nextLine();
        String s= scan.nextLine();



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
