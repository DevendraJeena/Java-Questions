import java.util.* ;

class Staff_details{

    String name;
    String DOB ;
    String designation ;
    double salary ;

    Staff_details(String name ,String DOB,String designation , double salary){
        this.name = name ;
        this.DOB = DOB ;
        this.designation = designation;
        this.salary = salary;

    }

    public void Display(){ 
        System.out.println("name :" + name);
        System.out.println("DOB :" + DOB);
        System.out.println("designation :" + designation);
        System.out.println("salary :" + salary);

    }



}

public class Staff {
    
    public static void main(String args[]){
        String name;
        String DOB ;
        String designation ;
        double salary ;

        Scanner sc = new Scanner(System.in);

        Staff_details sd[] = new Staff_details[2];
            
        for(int i=0;i<sd.length;i++){
            System.out.println("enter the details of staff member "+(i+1)+": 1 name , 2 dob , 3 designation ,4 salary");
        
            name= sc.nextLine();
            DOB = sc.nextLine();
            designation = sc.nextLine();
            salary = sc.nextDouble();
        
             sd[i] = new Staff_details(name, DOB, designation, salary);
             sd[i].Display();     
            

            sc.nextLine();
        }
        double max_salary =0;
        for(int i=0;i<sd.length;i++){
            if(sd[i].salary > max_salary){
                max_salary =sd[i].salary ;
            }

        }

        for(int i=0; i<sd.length;i++){
            if(sd[i].salary==max_salary){
                System.out.println("the employee having maximum salary :");
                sd[i].Display();
            }
        }
            

       


    }

}
