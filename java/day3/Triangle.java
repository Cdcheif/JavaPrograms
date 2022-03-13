import java.util.Scanner;

 class Triangle{
       public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               System.out.println("input three angles a,b and c");
               int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt(); 
               
             if(a+b+c == 180){
             System.out.println("these angles can form a triangle");
}

           else{
               System.out.println("tringle formation not possible");
}


  }

}