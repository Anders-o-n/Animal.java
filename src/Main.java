import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String sign = null;
        System.out.println("Enter the expression:");
        a = console.nextInt();
        sign = console.next();
        b = console.nextInt();
        if (a>0 && a<= 10 && b>0 && b<= 10  ) {
            if (sign.equals("+")) {
                System.out.println(a + b);
            }
            if (sign.equals("-")) {
                System.out.println(a - b);
            }
            if (sign.equals("*")) {
                System.out.println(a * b);
            }
            if (sign.equals("/")) {
                System.out.println(a / b);
            }
        }
        else System.out.println("Invalid expression entered");

    }
}

