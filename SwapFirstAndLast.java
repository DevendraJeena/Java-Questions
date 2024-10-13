// Write a Java program to swap the first and last elements of an array and create a new array

import java.util.Arrays;

public class SwapFirstAndLast{
    
    public static int [] swaping(int arr[]){
       int i=0;
       if(arr.length>2){
        int temp = arr[i];
         arr[i]=arr[arr.length-1];
         arr[arr.length-1]= temp ;
         
         Arrays.toString(arr);
         return arr ;

    }else{
        System.out.println("its not possible to swap");
        return arr ;
    }
}
    public static void main(String[] args) {
        int arr[] = {10,20,30,45,34,53};
        System.out.println("original array:"+" "+ Arrays.toString(arr));
        int result[] = swaping(arr);
        System.out.println("Swapped array :"+" "+Arrays.toString(result));
    }
}
