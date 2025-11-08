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
public class ConditionalLogic {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        
        
         
       System.out.println("Enter film certification: ");
       int certification = sc.nextInt();
       
       System.out.println("Your age: ");
       int age = sc.nextInt();
        

        preAndPostDifference(x,y);
        booleanLogicShortCircuitsOps(x,y);
        booleanBitwiseOps(x,y);
        compareStrings();
        boolean allowed = admitToFilm(certification, age);
        
        System.out.println("Admitted to film: " + allowed);
       
       switchVowelOrConsonant();
       ifMonth();
       ifGrade();
       switchMathOperation();
       ifTemperature();
       switchDaysInMonth();
    }
    
    public static void preAndPostDifference(int x, int y){
        //x
        System.out.println("The value of x is: " + x);
            ++x;
                System.out.println("The value of ++x is " + x );
            
        System.out.println("The value of x is: " + x);
            x++;
                System.out.println("The value of x++ is " + x);
        //-------------------------------------------------------------
        System.out.println("--------------------------------------------");
        //-------------------------------------------------------------
        //y
        System.out.println("The value of y is: " + y);
            --y;
                System.out.println("The value of ++y is: " + y);
        
        System.out.println("The value of y is; " +y);
            y--;
                System.out.println("The value of y++ is: " + y);
        
   } 
    
    public static void booleanLogicShortCircuitsOps(int x, int y){
        boolean b = false;
        if (x < 0 && (b = true)){}
        System.out.println(b);
        
        if (x > 0 || (b= true)){}
        System.out.println(b);
    //(b = true) never runs in both cases, and b stays false
    
    }
    
    public static void booleanBitwiseOps(int x, int y){
        boolean b = false;
        if (x < 0 & (b = true)){}
        System.out.println(b);
        
        if (x > 0 | (b= true)){}
        System.out.println(b);
    }
    
    
    public static void compareStrings(){
        System.out.println("Input name 1: ");
            String s1 = sc.next();
        System.out.println("Input name 2: ");
            String s2 = sc.next();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        //using Scanner, Java creates new String objects, not pooled literals — that’s why == becomes false.
    }
    
    public static boolean admitToFilm(int certification , int age){
        if (age >= certification){
        return true;
        }
        else {
        return false;
        }
    }
    
    
    public static void switchVowelOrConsonant(){
        System.out.println("Enter a character: ");
        String input = sc.next();
        char letter;
        
        if (Character.isDigit(input.charAt(0))){
            int code = Integer.parseInt(input);
            letter = (char) code;
        }
        else {
            letter = input.charAt(0);
        }
        
        
        if ((letter >= 'a' && (letter <= 'z') || (letter >= 'A' && letter <= 'Z'))){
            switch (letter){
                    default:
                        System.out.print(letter + " is a consonant.");    
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 65: // 'A'
                    case 69: // 'E'
                    case 73: // 'I'
                    case 79: // 'O'
                    case 85: // 'U'+
            System.out.println(letter + " is a vowel.");
                break;
             
            }
        }
        else{
            System.out.println("Error: '" + letter + "' is not a valid letter (A-Z or a-z).");
        }
    
    }
    
    public static void ifMonth(){
        System.out.println("Enter a month number (1-12): ");
        int month = sc.nextInt();
        
        final int JAN = 1, FEB = 2, MARCH = 3, APRIL = 4, MAY = 5, JUNE = 6;
        final int JULY = 7, AUGUST = 8, SEPT = 9, OCT = 10, NOV = 11, DEC = 12;
    
        if(month == JAN){
            System.out.println("January");}
        else if( month == FEB){
            System.out.println("February");
        }
        else if( month == MARCH){
            System.out.println("March");
        }
        else if( month == APRIL){
            System.out.println("April");
        }
        else if( month == MAY){
            System.out.println("May");
        }
        else if( month == JUNE){
            System.out.println("June");
        }
        else if( month == JULY){
            System.out.println("July");
        }
        else if( month == AUGUST){
            System.out.println("August");
        }
        else if( month == SEPT){
            System.out.println("September");
        }
        else if( month == OCT){
            System.out.println("October");
        }
        else if( month == NOV){
            System.out.println("November");
        }
        else if( month == DEC){
            System.out.println("December");
        }
        else {
            System.out.println("Out of range.");
        }
        
    
    }
    
    public static void ifGrade(){
        System.out.println("Enter a mark in range (0-100)");
        int mark = sc.nextInt();
        
        if(mark >100){
        System.out.println("Out of range.");
        }
        else{
            if(mark >= 70){
                System.out.println("Mark: " + mark + " Output: A ");
            }
            else if ((mark >= 60) && (mark < 70)){
                System.out.println("Mark: " + mark + " Output: B ");
            }
            else if ((mark >= 50) && (mark < 60)){
                System.out.println("Mark: " + mark + " Output: C ");
            }
            else if ((mark >= 40) && (mark < 50)){
                System.out.println("Mark: " + mark + " Output: D ");
            }
            else{
                System.out.println("Failed.");
            }
        }
    
    } 
    
    public static void switchMathOperation(){
        double answer = 0.0;
        boolean operationOK = true;
        
        System.out.println("Input first number: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter a character: ");
        char operation = sc.next().charAt(0);
        
        switch(operation){
            case '+' :
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Enter a valid operation.");
                operationOK = false;

        }
        if (operationOK = true){
            System.out.println("Answer: " + answer);
        }
        else {
            System.out.println("No answer.");
        }
    }
    
    public static void ifTemperature(){
        int temperature = 0;
        final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;

        System.out.println("Enter a temperature:");
        temperature = sc.nextInt();

        if (temperature <= COLD) {
        System.out.println("Cold.");
        }
        else if (temperature < MILD) { 
        System.out.println("A little cold but ok.");
        }
        else if (temperature < WARM) {
        System.out.println("Mild");
        }
        else if (temperature < VERY_WARM) {
        System.out.println("Warm.");
        }
        else if (temperature < HOT) {
        System.out.println("Very warm");
        }
        else {
        System.out.println("Hot.");
        }
       
    }
    
   public static void switchDaysInMonth(){
        int numDays = 0;
        final int JAN = 1, FEB = 2, MARCH = 3, APRIL = 4, MAY = 5, JUNE = 6;
        final int JULY = 7, AUGUST = 8, SEPT = 9, OCT = 10, NOV = 11, DEC = 12;
        
        System.out.println("Enter a month (1-12)");
        int month = sc.nextInt();
        
        switch(month){
            case JAN, MARCH, MAY, JULY, AUGUST, OCT, DEC:
                numDays = 31;
                break;
            case APRIL, JUNE, SEPT, NOV:
                    numDays = 30;
                    break;
            case FEB:
                System.out.println("Enter a year: ");
                    int year = sc.nextInt();
        
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        numDays = 29;
                            System.out.println("Leap Year.");
                    } else {
                        numDays = 28;
                            System.out.println("Not a leap year.");
                    }
                    break;
            default:
                System.out.println(month + " is out of range (1–12)");
                    return;
        }
        System.out.println("Number of days: " + numDays);

    
}
}
