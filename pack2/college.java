// Write a program:Create two packages, pack₁ contains two classes as student
//  & course. Both classes have method to read corresponding Information. 
// Pack2 contains class college with method accept(). 
// Write a java program to display all information.


package pack2;

import pack1.course;
import pack1.student;

 class collegeData {
    
    public void accept(){
        student students = new student();
        course courses = new course();

        System.out.println(" enter student details : ");
        students.readStudentInfo();
        System.out.println("enter course details : ");
        courses.readCourseInfo();

        System.out.println("displaying all information");
        students.displayStudentInfo();
        courses.displayCourseInfo();

    }
}
public class college{

    public static void main(String[] args) {
        collegeData College = new collegeData();
        College.accept();
    }
}

