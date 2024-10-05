import java.util.*;
public class Ques14 {
    
    public static int add(int a){

        // String s = Integer.toString(a);
        // int sum = 0 ;
        // for(int i=0;i<s.length();i++){
        //     char digitChar = s.charAt(i) ;
        //     int digit = Character.getNumericValue(digitChar);
        //     sum+=digit ;
        // }
        // System.out.println("sum of all the digits of the number is "+" "+ sum);
        // return sum ;

        int sum = 0;
        while(a>0){
            int digit = a%10 ;
            sum+=digit ;
            a = a/10 ;
        }
        System.out.println("the sum of the digits of the number is "+" "+ sum );
        return sum ;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        add(a);
        sc.close();
    }
}
