import java.util.Scanner;

public class lab3c {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("NAME : SUBHADIP DAS" + " ROLL : 2230210");
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

       
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
