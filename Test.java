/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class ExceptionHandling {
   public static void main (String[] args){
  System.out.println("Result of a(): \n" + a());
  System.out.println("Result of b(): \n" + b());
  System.out.println("Result of c(): " + c());
  
   }   
   public static String a(){
       System.out.println("This is method a()");
       try{}
       catch(Exception e){
           System.out.println("Exception occured");
           return "exception";
       }
     
       finally {
           System.out.println("finally");
       }
       return "no exception";
    }
   
   public static String b(){
       try{
           return "ok";
       }
       catch(Exception e){
           System.out.println("Exception occured");
           return "exception";
       }
       finally {
           System.out.println("Finally");
           return "finally";
       }
   }
   
   public static String c(){
       try{
           throw new Exception("demo exception");
       }
       catch(Exception e){
           System.out.println("Exception occured");
           return "exception";
       }
       finally{
           System.out.println("finally");
           return "finally";
       }
   }
   
//   public static String d(){
//       try{
//           return "ok";
//       }
// //      catch(IOException e){} //des not compile
////       catch(NoSuchMethodException e){}  //des not compile
////       catch(ClassNotFoundException e){} //des not compile
////       retun "done";   it compiled even with errors
////      catch(RuntimeException e){
////       //compiled even with errors
////      }
////     catch (exception e){}
//////compiled even with errors
//   }
  

}

class Parent{
    public void process() throws IOException{
        throw new IOException("Parent Exception");
    }

}
class Child extends Parent{
    @Override
    public void process() throws IOException{
        throw new IOException("IO exception");

    }

   
}
 public class Test{
     public static void main(String[] args){
         Parent p = new Child();
         
         try{
             p.process();
         }
         catch(IOException e){
             System.out.println("Caught IOException: " + e.getMessage());
         }
     }
}