import java.util.Scanner;
       class Leapyear{
             public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter Any Year");
             int year = sc.nextInt();
            
            if(year%4==0){
              System.out.println("input year is leap year");
 }
     else{
          System.out.println("input year is not a leap year");
}
}
}