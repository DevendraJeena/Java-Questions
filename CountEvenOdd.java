// Write a Java program to count the number of even and odd elements in a given array

public class CountEvenOdd {

   public static void countEvenOdd(int arr[]){

    int countEven = 0;
    int countOdd = 0;
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            countEven++ ;
        }
        if(i%2!=0){
            countOdd++;
        }
    }
    System.out.println("no of even :"+" "+countEven);
    System.out.println("no of odd:"+" "+ countOdd);
   }
   public static void main(String[] args) {
    int arr[] = {12,45,23,55,78,56,12,33,11};
     countEvenOdd(arr);

   } 
}
