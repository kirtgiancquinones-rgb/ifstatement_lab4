/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab.java;

import java.util.Scanner;

/**
 *
 * @author Marlac
 */
public class Loopslab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
     //for loop//
        System.out.println("sample 1: multiplication table");
        sample1(scanner);
        
     //while loop//
        System.out.println("Sample 2: sum of natural numbers");
        sample2(scanner);

     //do-while loop dito//
        System.out.println("sample 3: factorial calculators");
        sample3(scanner);

     //for loop ulit//
        System.out.println("sample 4: even and odd numbers");
        sample4(scanner);

        
      //do-while loop ulit//
        System.out.println("sample 5: reverse digits of a number");
        sample5(scanner);

        // for when all the scanners are done initiation//
        scanner.close();
        System.out.println("all activities initiated!");
    }

    // sample 1: multiplication table generator (for loop)
    public static void sample1(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // sample 2: sum of natural numbers (while loop)
    public static void sample2(Scanner scanner) {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }

    // sample 3: factorial calculator (do-while loop)
    public static void sample3(Scanner scanner) {
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        long factorial = 1; // "long" is for when the numbers get big daw//
        int i = 1;
        
        // a do-while loop always executes at least once //
        do {
            factorial *= i;
            i++;
        } while (i <= N);
        
        System.out.println("Factorial = " + factorial);
    }

    // sample 4: even and odd numbers (for loop)
    public static void sample4(Scanner scanner) {
        System.out.print("Enter a number: ");
        int N= scanner.nextInt();
        
        System.out.print("even numbers: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // mobalhin sa next line?
        
        System.out.print("odd numbers: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // next line ulit//
    }

    // sample 5: reverse digit of a number (while loop)
    public static void sample5(Scanner scanner) {
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        int reversed = 0;
        
        while (N != 0) {
            int digit = N % 10;              // get the last digit
            reversed = reversed * 10 + digit; // for when to append it to the reversed number
            N /= 10;                         //for when to remove the last digit from the original number
        }
        
        System.out.println("Reversed: " + reversed);
    }
}
    
    
