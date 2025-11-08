/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Operators {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
    
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        logicalOps(x,y);
        simpleMaths(x,y);
        boolean result = modulus(x,y);
         System.out.println(x + " is a multiple of " + y + ": " + result);
        incrDecr();
    
    }
    
    public static void logicalOps(int x, int y){
        if (x > 0 && y > 0){
            System.out.println("Both lines are positive.");
        }
        
        else if (x < 0 && y < 0){
            System.out.println("Both numbers are negative.");
        }
        
        else if (x == 0 || y == 0){
            System.out.println("Atleast one number is zero.");
        }
        
        else if ((x < 0 && y >= 0) || (y < 0 && x >= 0)) {
            System.out.println("One number is negative.");
        } 
    
    }
    
    public static void simpleMaths(int x, int y){
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        double quotient = (double) x / y;
        
        System.out.println("The sum of " + x + " and " + y + " is " + sum);
        System.out.println("The difference of " + x + " and " + y + " is " + difference);
        System.out.println("The product of " + x + " and " + y + " is " + product);
        System.out.println("The quotient of " + x + " and " + y + " is " + quotient);
    }
    
    public static boolean modulus(int x, int y){
        if (y == 0){
            System.out.println("Cannot divide by zero.");
            return false;
        }
        boolean result = (x % y == 0);
        return result;
    }
    
    public static void incrDecr(){
    int x=0, w=0, y=0, z=0;
    x=4;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
    w=20;
    x=10;
    y=-5;
    z=0;
        System.out.println( w == x && y != z );
        System.out.println( w == x || y != z );
        System.out.println( ! ( w == (x + z) ) );
    }
}
