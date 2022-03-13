import java.util.Scanner;

 class CheckAge{

       public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter your age");
       int userAge=sc.nextInt();
        if(userAge>18){
          System.out.println("bsdk ur eligible to vote");
       }else{ 
           System.out.println("Chala Ja bsdk");
       }
  
 
      }

   }