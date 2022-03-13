import java.util.Scanner;
class NumChe{
public static void main(String[] aargs){
      int a;
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     a=sc.nextInt();
     if(a<0){
       System.out.println("this number is negative");
     }
     else if(a>0){
      System.out.println("this number is positive");
     }
     else{
     System.out.println("this number is neither neg nor positive");
     }
}    
}

