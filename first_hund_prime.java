// Write a Java program to compute the sum of the first 100 prime numbers


public class first_hund_prime {

    public static int sumOfPrime(){
        int sum = 0;

        for(int n=2;n<100;n++){
        boolean isPrime = true ;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
             isPrime= false;
              break ;
            }
               
        }
        if(isPrime){
            sum+=n ;
        }
    }
     System.out.println(sum);
    return sum;
    }
    public static void main(String[] args) {
        
      sumOfPrime();

    }
}
