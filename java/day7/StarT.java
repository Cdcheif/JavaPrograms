class StarT{
      public static void main(String[] Args){
              int i=0;
              int j=0;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
              if(j==4||i+j==5||i==4||i==3&&j==3){
              System.out.print("*");
              }else{
            System.out.print(" ");
               } 
              
          }
          System.out.println();
}
}

}
