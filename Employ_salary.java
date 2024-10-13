// Define a class employee having member variable Emp No, Emp Name and Designation.
//  Define another class salary which, has been inherited from class employee, 
//  having member variable Basic_Sal. Write appropriate method which will calculate Basic_Sal. 
//  Depending on designation and constructor to initialize member variable.
import java.util.* ;
class Employee{

    int EmpNo ;
    String EmpName;
    String Designation ;

    public Employee(int EmpNo , String EmpName,String Designation){
        this.EmpNo = EmpNo;
        this.EmpName = EmpName ;
        this.Designation =Designation ; 
    }
   
}
final class salary extends Employee{

    double Basic_Sal ;

    public salary(int EmpNo , String EmpName , String Designation ){
        super( EmpNo , EmpName , Designation);
        Cal_salary();
    }

    public void Cal_salary(){

        switch (Designation.toLowerCase()) {
            case "clerk" :
                 Basic_Sal = 20000 ;
                break;
            case "developer" :
                Basic_Sal = 40000;
                break;
            case "manager" :
                Basic_Sal = 60000;
                break ;
            default:
               Basic_Sal = 30000;
               break ;
        }

    }
    void display_details(){
        
        System.out.println("Details of the employee :");
        System.out.println("employee number : "+EmpNo);
        System.out.println("employee name : "+ EmpName);
        System.out.println("Designation : "+ Designation);
        System.out.println("Salary : "+ Basic_Sal);
    }

    
}

public class Employ_salary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the details of the employee : 1-Employee number || 2-Employee_Name || 3-Designation ");

        int EmpNo =sc.nextInt() ;
        sc.nextLine();
        String EmpName = sc.nextLine();
        String Designation = sc.nextLine();
        

        salary emp1 = new salary(EmpNo ,EmpName,Designation) ;
        emp1.Cal_salary();
        emp1.display_details();

        
    }
}
