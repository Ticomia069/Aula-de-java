import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();

     if (num > 1) {
     for (int i = 1; i <= 10; i++) {
    System.out.println("o número " + num + " maior que 1.");}
} else {
         System.out.println("O número " + num + " não é maior que 1.");
     }
          
     sc.close();
    }
      
  }
