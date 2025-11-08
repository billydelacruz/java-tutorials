/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author admin
 */
public class CallByValue {
    
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        
        passPrimitive(x);
        System.out.println(x);
        
        x=passPrimitiveAndReturn(x);
        System.out.println(x);
    }
    
    public static void passPrimitive(int value){
        value = 50;
    }
    
    public static int passPrimitiveAndReturn(int value){
        value = 50;
        return value;
    }
    
}

 
