class AlphaA{
      public static void main(String[] args){
         int n=4;
         for(int i=0;i<=n;i++){
            for(int j=0;j<=3;j++){
            if(i!=0&&j==0||j==3&&i!=0||i==0&&j==2||i==3||i==0&&j==1){
            System.out.print("* ");
            }else{
            System.out.print("  ");
            }
            }
        System.out.println();
         }
      }
}
