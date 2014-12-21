

package com.psyrin.chapter2;



/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       float input = scan.nextFloat();
       System.out.println("number : " + scan.nextFloat());
       if(input - (int)input == 0){
       System.out.println("output " + (int)input);   
       
    }else{
      System.out.println("output " + input);
     }
      
   }  
}
