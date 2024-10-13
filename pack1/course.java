// Write a program:Create two packages, pack₁ contains two classes as student
//  & course. Both classes have method to read corresponding Information. 
// Pack2 contains class college with method accept(). 
// Write a java program to display all information.

package pack1;
import java.util.*;

public class course {
    
    private String course_name;
    private int course_duration;

    public void  readCourseInfo(){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the course name");
        course_name = sc.nextLine();
        System.out.println("enter the course duration");
        course_duration= sc.nextInt();
    }

    public void displayCourseInfo(){

       
        System.out.println("course name : "+ course_name);
        System.out.println("course duration : "+ course_duration);
    }


}
