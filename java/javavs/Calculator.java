import java.util.Scanner;
class Calculator{
     public static void main(String[] args){
     	int a,b,ch,result;
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Input Two Numbers a and b");
     	a=sc.nextInt();
     	b=sc.nextInt();

     	System.out.println("input Opration Choice 1 for +,2 for -,3 for *,4 for /,and 5 for Reaminder");
     	ch=sc.nextInt();
     	if(ch==1)
     	{
     		result=(a+b);
        System.out.println("ADD= "+result);
     	}
     	else if(ch==2)
     	{
     		result=(a-b);
            System.out.println("Sub= "+result);
     	}else if(ch==3)
     	{
           result=(a*b);
           System.out.println("Mul= "+result);
     	}else if(ch==4)
     	{
           result=(a/b);
           System.out.println("Div= "+result);
     	}else
     	{
          result=(a%b);
          System.out.println("Remainder= "+result);
     	}
       

     }
}
