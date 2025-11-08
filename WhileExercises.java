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
public class WhileExercises {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
    //
    thirdOrderPolynomial();
    whileAverage();
    whileGrades();
    whileHistogram();
    whileLargestSmallest();
    }
    
    public static void thirdOrderPolynomial(){
        System.out.print("Input a: ");
        double a = sc.nextDouble();

        System.out.print("Input b: ");
        double b = sc.nextDouble();

        System.out.print("Input c: ");
        double c = sc.nextDouble();

        System.out.print("Input d: ");
        double d = sc.nextDouble();
        
        System.out.println("a: "+a+ "\nb: "+b+ "\nc: "+c+ "\nd: "+d);
        
        //Inside a while loop, ask the user for x.
        while(true){
            System.out.println("Enter x: ");
            double x = sc.nextDouble();
            
        //Calculate the fx value and output the result. fx = ax3 + bx2 + cx + d
        
            double fx = (a * x * x * x) + (b * x * x) + (c * x) + d;
            System.out.println("fx: " +fx);
            
            // Ask the user if he/she wished to continue.
            System.out.println("Do you wish to continue? yes/no");
            String answer = sc.next();
            if(answer.equalsIgnoreCase("yes")){
            }
            else{
                System.out.println("Terminated.");
                return;
            }
            
        }
        
    }
     public static void whileAverage(){
         System.out.println("Input n: ");
         int n = sc.nextInt();
         
         if(n <= 0){
             System.out.println("Error.");
         }
         else{
             int total = 0;
             int count = n;
             
             while (n != 0){
                 System.out.println("Enter a number: ");
                 int number = sc.nextInt();
                total += number;
                System.out.println("Total: "+total);
                n--;

             }

                double average = (double)total / count;
                System.out.println("Average: "+average);
         }
         
         
        }
        
    public static void whileGrades(){
        String grade = "";
        int countA = 0, countB =0, countC = 0, countD = 0, countE = 0, countF = 0;
        while(!grade.equalsIgnoreCase("x")){
            System.out.print("Enter grade (a-f) or x to stop: ");
            grade = sc.next().toLowerCase();
        
            switch(grade){
                case "a": countA++; break;
                case "b": countB++; break;
                case "c": countC++; break;
                case "d": countD++; break;
                case "e": countE++; break;
                case "f": countF++; break;
                case "x": break;
                default:
                    System.out.println("Invalid grades.");
            }
        
        }
        System.out.println("\nGrade counts:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("E: " + countE);
        System.out.println("F: " + countF);
        
    
    }

    public static void whileHistogram(){
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        
        System.out.println("Enter columns: ");
        int columns = sc.nextInt();
        
        while(rows > 0){
            int cols = columns;
            while(cols > 0){
                System.out.print("*");
                cols--;
            }
            System.out.println();
            rows--;
            
        }
    }
    
    public static void whileLargestSmallest(){
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        if (n <= 0 ){
            System.out.println("Eror.");
        }
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
            
        while (n > 0){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            
            
            if (number > largest){
                largest = number;
            }
            
            if (number < smallest){
                smallest = number;
            }
            n--;
        }

            System.out.println("largest number is: "+largest);
            System.out.println("smalles number is: "+smallest);
        }
    
}
