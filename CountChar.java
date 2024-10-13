// Write a Java program to count the letters, spaces, numbers, and other characters of an input string

import java.util.* ;

public class CountChar {

    public static int  countAll(String s){
    
        int count = 0;
        // while(count<s.length()){
        //       count++ ;

        // }

        for(count= 0; count<s.length();count++){

        }
 
        return count ;

    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    int result = countAll(s);
    System.out.println(result);
    sc.close();
       
    }
}
