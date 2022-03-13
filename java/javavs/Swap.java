import java.util.Scanner;
class Swap{
  public static void main(String[] args){
      int a,b,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("two numbers a and b,After Swapping="+a+" "+b);
      temp=a;
      a=b;
      b=temp;
   System.out.println("two numbers a and b,After Swapping="+a+" "+b);
      
  }
  
}


