import java.util.*;

class Ci{

    double principal ;
    double year ;
    double rate ;
    double oldprincipal ; //to store the original principal so that we can use it later ;
    

    Ci(double principal,double year , double rate){
        this.principal = principal;
        this.year =  year ;
        this.rate = rate ;
        this.oldprincipal = principal;

    }
     
    public  void Compound_interest(){

        double rate_percent = Math.pow((1+ (rate/100)) , year) ;
        
        double Interest = principal*(rate_percent -1);

        System.out.println("compound interest :" + Interest);


    } 

    public void comp_interest(){

        double si ,ci ,amount ;
        for(int i = 1 ;i<=year ; i++){
            si = (principal*rate)/100 ;
            amount  = si + principal ;
            principal = amount ;
            

        }
        System.out.println(principal - oldprincipal);
       
       

    }
    


}

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("please enter the details: 1- principal | 2- year | 3- rate");
        double principal = sc.nextDouble();
        double year = sc.nextDouble() ;
        double rate  = sc.nextDouble();

        Ci c1 =  new Ci(principal , year,rate);
        c1.Compound_interest();
        c1.comp_interest();
        
    }
    
}