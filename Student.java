// Define class student with attribute rollno, name. Inherit student class in a class called Marks,
//  with attributes marks of Java Theory and Java Practical. Define method setMark() 
//  in Mark class marks and set the total of Java marks in setmark() method,
//   Show the Java Marks in main class called FinalMarks. (Take the Marks from system.)
 
import java.util.* ;

class Student_details{

    int rollNo;
    String name ;

    public Student_details(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name ;
    }
}
class Marks extends Student_details{

    int javaTheory ;
    int javaPracticle; 
    int totalMarks ;

    Marks(int rollNo , String name , int javaTheory ,int javaPracticle){
        super(rollNo, name);
        this.javaTheory = javaTheory ;
        this.javaPracticle = javaPracticle ;
    }

    void setMarks(){
        totalMarks = javaTheory + javaPracticle;
    }

    void showMarks(){
        System.out.println("Students details :");
        System.out.println("Roll number :" + rollNo);
        System.out.println("Name :"+ name);
        System.out.println("Java Theory marks :" + javaTheory);
        System.out.println("Java Practicle marks :"+ javaPracticle);
        System.out.println("Total marks :" + totalMarks);
    }

}

public class Student {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the details of the students : 1-rollNo || 2-Name || 3-java Theory Marks ||4-java practicle Marks" );
        int rollNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int javaTheory = sc.nextInt();
        int javaPracticle = sc.nextInt();
        Marks student = new Marks(rollNo , name, javaTheory , javaPracticle);
        student.setMarks();
        student.showMarks();
    }


}
