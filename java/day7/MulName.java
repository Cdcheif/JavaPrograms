import java.util.Scanner;
class MulName{
      public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             int n =sc.nextInt();
             if(n%3==0&&n%5==0){
             System.out.println("Mul of 3 And 5");
             }else{
                  System.out.println("Not the mul of 3 and 5");
             }
            
           if(n%3==0){
            System.out.println("mul of 3");
}else{
       System.out.println("not mul of 3");
}
         if(n%5==0){
         System.out.println("mul of 5");
}else{
      System.out.println("not mul of 5");
}
       

}
}