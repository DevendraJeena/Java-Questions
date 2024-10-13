// Write a program:Create two packages, pack₁ contains two classes as student
//  & course. Both classes have method to read corresponding Information. 
// Pack2 contains class college with method accept(). 
// Write a java program to display all information.

package pack1;
import java.util.* ;

public class student {
    
    private String studentName ;
    private int StudentRollno ;

    public void readStudentInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the student name");
        studentName = sc.nextLine();
        System.out.println("enter student rollno");
        StudentRollno = sc.nextInt();
    }

    public void displayStudentInfo(){
      
        System.out.println("student name : "+ studentName);
        System.out.println("student rollno : "+ StudentRollno);
    }
}
