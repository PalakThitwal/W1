/*import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("Is the number " + number + " a Prime number? false");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;   
            }
        }
        System.out.println("Is the number " + number + " a Prime number? " + isPrime);
    }
}*/

/*import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("The right-angled triangle pattern for " + rows + " rows is");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int origNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        if (reversedNumber == origNumber) {
            System.out.println("Is the number " + origNumber + " a Palindrome? Yes");
        } else {
            System.out.println("Is the number " + origNumber + " a Palindrome? No");
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        int original1 = number1;
        int original2 = number2;
        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        System.out.println("The GCD of " + original1 + " and " + original2 + " is " + number1);
        sc.close();
    }
}*/

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int origNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        if (sum == origNumber) {
            System.out.println("Is the number " + origNumber + " an Armstrong number? Yes");
        } else {
            System.out.println("Is the number " + origNumber + " an Armstrong number? No");
        }
        sc.close();
    }
}