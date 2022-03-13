import java.util.Scanner;
class Switch{
   
   public static void main(String[] args){
       
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any of option 1to 5");
         int option=sc.nextInt();
         switch(option){
               case 1:
               System.out.println("Option 1");
               break;
               case 2:
               System.out.println("Option 2");
               break;
               case 3:
               System.out.println("Option 3");
               break;
               case 4:
               System.out.println("Option 4");
               break;
               case 5:
               System.out.println("Option 5");
               break;
               default:
               System.out.println("Invalid Option");
         
         
         }
       
   }
}
