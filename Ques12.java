import java.util.*;
public class Ques12 {

    public static void checkPalindrome(String s){
        boolean palindrome = false;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                palindrome = true ;
            }
        }
        if(palindrome){
            System.out.println("it is a palindrome");
        }
        else if(!palindrome){
            System.err.println("it is not a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter the number to check palindrome");
        String s = sc.nextLine();
        checkPalindrome(s);
        sc.close();


    }
}
