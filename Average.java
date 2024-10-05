import java.util.*;

public class Average {

    public static int average(int a,int b,int c,int d,int e){
      
        int avg = (a+b+c+d+e)/6 ;
        return avg ;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int  c = sc.nextInt();
        int  d = sc.nextInt();
        int  e = sc.nextInt();
     
        int avg = average(a,b,c,d,e);
        System.out.println("The average of the "+ " "+ avg);
        sc.close();
    }
}
