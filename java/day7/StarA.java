class StarA{
      public static void main(String[] args){
             int i=0;
             int j=0;
           for(i=1;i<=6;i++){
             for(j=1;j<=4;j++){
               if(i==1||j==1||i==4||j==4){
             System.out.print("*");      
              }else{
              System.out.print(" ");
             }
               


             }
          System.out.println();
         }
}
}