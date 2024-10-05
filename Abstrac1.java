// Write a java program to create abstract class person derived two classes 
// Employee and Worker from it. Use proper method to accept and display for the same.
//  Employee(eno, ename, address), similar fields are worker.


import java.util.Scanner;
abstract class Person{

    public Person(){
        
    }

    abstract void accept(Scanner sc);
    abstract void display();
}

class Employee extends Person{

    int e_no ;
    String e_name ;
    String e_address ;

   
    void accept(Scanner sc){
      
        System.out.println("please enter the employee detail : 1- employee no || 2- name || 3-address");
        e_no = sc.nextInt() ;
        sc.nextLine();
        e_name = sc.nextLine();
        e_address = sc.nextLine();
    }

    void display(){

        System.out.println("employee details are : ");
        System.out.println("employee number : "+ e_no);
        System.out.println("employee name : "+ e_name );
        System.out.println("employee adress : "+ e_address);
    }

    
}

class Worker extends Person{

    int w_no ;
    String w_name;
    String w_address ;

    void accept(Scanner sc){
        
        System.out.println("enter the details of the worker : 1-worker no || 2-worker name || 3-address");
        w_no = sc.nextInt() ;
        sc.nextLine();
        w_name = sc.nextLine();
        w_address = sc.nextLine();

    }

    void display(){
        System.err.println("Worker details are: ");
        System.out.println("worker no :" + w_no);
        System.out.println("worker name :"+ w_name);
        System.out.println("worker address :"+ w_address);


    }
}

public class Abstrac1 {
    
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        Employee e1 = new Employee();
        e1.accept(sc);
        e1.display();

        Worker w1 = new Worker();
        w1.accept(sc);
        w1.display();

    }
}
