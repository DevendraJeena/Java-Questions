    // Write a Java Program to accept two numbers and a character(+-*/) 
    // from the command line argument and print the result according to character. (Use switch)

class LineArgument1{

    public static void main(String[] args) {
        
        if(args.length!=3){
            System.out.println("usage : java Calculator <num1> <num2> <operator>" );
            return ;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operator = args[2];

        double result ;

        switch(operator){

            case "+" :
            result = num1 + num2 ;
            System.out.println(result);
            break ;

            case "-" :
            result = num1 - num2 ;
            System.out.println(result);
            break ;

            case "*" :
            result = num1 * num2 ;
            System.out.println(result);
            break ;

            case "/" :
            if(num2==0){
                System.out.println("error : division by zero");
            }else{
            result = num1/num2 ;
            System.out.println(result);
            }
            break ;

            default :
            System.out.println("invalid input operator ");
        }
        
    }
}