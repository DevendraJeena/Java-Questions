// Create student class having data member (roll no, name, percentage) 
// accept values and display details (use command line argument).


class Class_data{

    int rollNo ;
    String name;
    double percentage;

   public  Class_data(int rollNo , String name, double percentage){
    this.rollNo = rollNo;
    this.name = name;
    this.percentage = percentage;
   }

    public void display(){
        System.out.println("Details of the student :");
        System.out.println("Name :"+ name);
        System.out.println("rollNo :" + rollNo);
        System.out.println("percentage :"+ percentage);
    }
}
public class LineArgument4 {

    public static void main(String[] args) {
       
        if(args.length != 3){
            System.out.println("enter the name , roll and percentage");
            return ;
        }

        int rollNo = Integer.parseInt(args[0]);
        String name = args[1];
        double percentage = Double.parseDouble(args[2]);


        Class_data Student = new Class_data(rollNo, name, percentage) ;
        Student.display();
    }
}