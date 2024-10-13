// Write a Java program to convert a decimal number to binary numbers

import java.util.*;

public class Decimal {

public static String  decimalToBinary(int n){

String result = Integer.toBinaryString(n);
return result ;

}


public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

String result = decimalToBinary(n) ;
System.out.println(result);
sc.close();

}

    
}
