import java.util.Scanner;
public class NoTiga {
        public static void main(String[] args) {
          
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
            int n = input.nextInt();
    
            System.out.println("Deret Fibonacci sampai suku ke-" + n + ":");
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

