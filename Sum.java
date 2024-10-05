import java.util.* ;

class Sum{
public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    System.out.println("enter the numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a + b ;
    int multiply = a*b;
    int subtraction = a-b;
    int division = a/b;
    int remainder = a%b;
    System.out.println("sum of the two numbers is"+ " "+sum);
    System.out.println("multiplication of the two number is"+" "+multiply);
    System.out.println("subtraction of the two number is"+" "+ subtraction);
    System.out.println("division of the two number is"+" "+division);
    System.out.println("remainder of the two number is"+" "+remainder);

   sc.close();

}

}