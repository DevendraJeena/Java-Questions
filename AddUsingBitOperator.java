// Write a Java program to add two numbers without using any arithmetic operators

import java.util.*;
public class AddUsingBitOperator {
    
    public static int addWithoutArthematic(int a , int b){

        while(b!=0){
            int carry = a & b ;
            a = a ^ b ;
            b = carry<<1 ;
        }
        System.out.println("the sum of the two number is"+" "+ a);
        return a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enters the first number ");
        int a = sc.nextInt();
        System.out.println("enters the second number ");
        int b = sc.nextInt();

        addWithoutArthematic(a , b) ;
        sc.close();
    }
}
