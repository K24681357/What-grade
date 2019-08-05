
package what.grade;

import java.util.Scanner;


    public class WhatGrade {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
         int i=0;
     double resulta = 0;
     double resultb = 0;
     double result = 0;
        
       while (i>=0){
            System.out.print("What assignment grade(%): ");
     double grade = Integer.parseInt(reader.nextLine());
     
     if(grade==0){
            break;
        }  
        System.out.print("What is the assignment weighting?: ");
        int weight = Integer.parseInt(reader.nextLine());
        
           System.out.print("What is the overall weight (0 if none): ");
           int m = Integer.parseInt(reader.nextLine());
        
         if (m ==0){
         resulta +=((grade/100)*weight);
         i++;
        }
          
        if( m >=i){
               resultb += grade/100 * weight/100 * m;
               i++;
           }
      result = resulta + resultb; 
       }
           
        System.out.println("You current marks total: " + result);
       }
       
    }
