import java.util.Scanner;
       class Clock{
             public static void main(String[] args){
             Scanner sc =new Scanner(System.in);
             System.out.println("input Hrs and minute in 12 hrs form");
             int hh=sc.nextInt();
             int mm=sc.nextInt();
             double hrsAngle=(hh*30+(mm*1/2));
             double minAngle=(mm*6);
             if(hrsAngle>minAngle){
                System.out.println(hrsAngle-minAngle);
                 }
              if(minAngle>hrsAngle){
                System.out.println(minAngle-hrsAngle);
}
}
}