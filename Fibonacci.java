import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe um número: ");
    int num = input.nextInt();
    input.close();
    
    if (isFibonacci(num)) {
      System.out.println(num + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println(num + " não pertence à sequência de Fibonacci.");
    }
  }
  
  public static boolean isFibonacci(int num) {
    int a = 0;
    int b = 1;
    int fib = b;
    
    while (fib < num) {
      fib = a + b;
      a = b;
      b = fib;
    }
    
    return fib == num;
  }
}
