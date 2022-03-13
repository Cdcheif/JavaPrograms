class ChPyr{
      public static void main(String[] args){
        char i,j;
        for(i='a';i<='e';i++){
        	for(j='e';j>=i;j--){
        		System.out.print("  ");
        	}
            for(j='a';j<=i;j++){
            	System.out.print(" "+j);

            }
            for(j='b';j<=i;j++){
        		System.out.print(" "+j);
              
            }
          System.out.println();
        }

      }

}