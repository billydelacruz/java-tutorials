/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

/**
 *
 * @author admin
 */
public class Spectacles {

    private int numLenses;
    
    public Spectacles(){
        numLenses = 2;
    }
    
    public void setLenses(int anumLenses){
        this.numLenses = anumLenses;
    }
    
    public int getLenses(){
        return numLenses;
    }
    
    public static void passObjectReference(Spectacles specs){
        specs.setLenses(1);
    }
    
    public static void main(String[] args){
    
        Spectacles specs = new Spectacles();
        
        System.out.println(specs.getLenses());
        passObjectReference(specs);
        
        System.out.println(specs.getLenses());
    }

}
