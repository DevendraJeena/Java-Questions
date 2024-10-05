import java.util.*;

public class DigitSum {
    
public static int sumOfDigits(int n){

String s = String.valueOf(n);
int sum = 0 ;

 for(int i=0;i<=s.length();i++){

    sum+=i ;
 }
 return sum ;
}


public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
 System.out.println("enter the number to find the digit sum");
 int n= sc.nextInt();

 int result = sumOfDigits(n);
  System.out.println("sum of all the digits of the number is"+" "+result);
  sc.close();

}


}
