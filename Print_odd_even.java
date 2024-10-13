// Write a Java program to print the even and odd numbers from 1 to 20 
// by using call to two different methods belongs same super class

public class Print_odd_even {

    public static void main(String[] args) {
        
       odd.printNumbers();
       even.printNumbers();

    }
    }

class Numbers{

    public static void printNumbers(){
        System.out.println("no. from 1-20 are ");
    }
}
class odd extends Numbers{

    public static void printNumbers(){
        System.out.println("odd numbers from 1-20 are");
        for(int i=0; i<=20;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
}

class even extends Numbers{
    public static void printNumbers(){
        System.out.println("even numbers from 1-20 are");
       for(int i=0;i<=20;i++){
        if(i%2==0){
            System.out.print(i+" ");
        }
       }
           System.out.println();
    }
}

   
