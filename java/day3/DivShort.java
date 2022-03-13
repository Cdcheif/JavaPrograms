import java.util.Scanner;
      
       class DivShort
        {
             
             public static void main(String[] args)
         {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Enter Your Percentage");
                   int per = sc.nextInt();
              if(per>=80&&per<100)
                 {
                   System.out.println(per+"you've got distinction");
                   }                   
                   if(per>=60&&per<80)
                    {
                     System.out.println(per+"you've got first division");
                       }
             
                    if(per>=45&&per<60)
                    {
                     System.out.println(per+"you've got 2nd division");
                       }
                     if(per>=33&&per<45)
                       {
                      System.out.println(per+"you've got third division");
                       }
                     if(per>=100)
                        {
                         System.out.println(per+"invaild percentage try again");
                         }
                     if(per<33)
                         {
                         System.out.println(per+"you've faild the examination");
                          }
}

}