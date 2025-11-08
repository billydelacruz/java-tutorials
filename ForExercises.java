/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ForExercises {
        static Scanner sc = new Scanner(System.in);
        
        
        public static void main(String[] args){
            
        forLargestSmallest();
        forHistogram();
        forAverage();
        twelveDaysOfChristmas();
        }
        
        public static void forLargestSmallest() {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            if (n <= 0) {
            System.out.println("Error.");
            return; 
            }

            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            boolean hasNonZero = false;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num != 0) {
                hasNonZero = true; 

                if (num > largest) {
                largest = num; 
                }

                if (num < smallest) {
                smallest = num; 
                }   
                }
            }

            if (!hasNonZero) {
                System.out.println("All numbers are zero. Cannot determine largest and smallest.");
            } else {
                System.out.println("The largest number is " + largest + ".");
                System.out.println("The smallest number is " + smallest + ".");
            }
    }

        public static void forHistogram(){
            System.out.print("Enter rows: ");
            int rows = sc.nextInt();
            
            System.out.print("Enter columns: ");
            int columns = sc.nextInt();
            
            for(int i = 1; i <= rows; i++){
                for (int x = 1; x <= columns; x++){
                    System.out.print("*");
                }
            
               
            System.out.println();
            }
        }
        
        public static void forAverage(){
            System.out.println("Enter how many number: ");
            int n = sc.nextInt();
            
            if (n <=0 ){
                System.out.println("Error.");
            return;}
            
            double sum = 0;
            
            for (int i = 1; i <= n; i++){
                System.out.println("Enter a number: ");
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println("The total is: " + sum);

            System.out.println("The average is: " + sum / n);

        }
        
        public static void twelveDaysOfChristmas(){
            int days =12;
            
            for (int i = 1; i <= days; i++){
            String dayword = "";
            
            switch(i){
                case 1: dayword = "first"; break;
                case 2: dayword = "second"; break;
                case 3: dayword = "third"; break;
                case 4: dayword = "fourth"; break;
                case 5: dayword = "fifth"; break;
                case 6: dayword = "sixth"; break;
                case 7: dayword = "seventh"; break;
                case 8: dayword = "eighth"; break;
                case 9: dayword = "ninth"; break;
                case 10: dayword = "tenth"; break;
                case 11: dayword = "eleventh"; break;
                case 12: dayword = "twelfth"; break;
            }
            System.out.println();
            System.out.println("On the "+dayword+ " day of Christmas");
            System.out.println("My true love sent to me: ");
            
           switch (i) {
            case 12: System.out.println("   Twelve drummers drumming,");
            case 11: System.out.println("   Eleven pipers piping,");
            case 10: System.out.println("   Ten lords a-leaping,");
            case 9: System.out.println("    Nine ladies dancing,");
            case 8: System.out.println("    Eight maids a-milking,");
            case 7: System.out.println("    Seven swans a-swimming,");
            case 6: System.out.println("    Six geese a-laying,");
            case 5: System.out.println("    Five golden rings,");
            case 4: System.out.println("    Four calling birds,");
            case 3: System.out.println("    Three French hens,");
            case 2: System.out.println("    Two turtle doves, and");
            case 1: System.out.println("    A partridge in a pear tree.");
                    break;
        }

            }
            
        }
}