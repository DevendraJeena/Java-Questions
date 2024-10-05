import java.util.* ;
public class Compare {
    
    public static void compareNumbers(int a , int b){
  
        if(a>b){
            System.out.println("first number is greater then second");
        }else if(a<b){
            System.out.println("second number is greater then first ");
        }else{
            System.out.println("Both the numbers are equal");
        }


    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

     compareNumbers(a , b);
     sc.close();
     
}

}
