class Person{

    String name ;
    int yearOfBirth ;

    public Person(String name , int yearOfBirth){
        this.name = name ;
        this.yearOfBirth = yearOfBirth;

    }

    public String getName(){
        return name ;
    }

    public int getyearOfBirth(){
        return yearOfBirth;
    }
    @Override
    public String toString(){
        return "name :" + name +", year of birth :"+ yearOfBirth ;
    }
}

class Student extends Person{

    String major ;

    public Student(String name , int yearOfBirth, String major){
        super(name , yearOfBirth);
        this.major = major ;
    }

    public String getMajor(){
        return major ;
    }
    @Override
    public String toString(){
        return super.toString() +",major : "+ major ;
    }
}
class Instructor extends Person{

    double salary ;

    public Instructor(String name , int yearOfBirth , double salary){
        super(name, yearOfBirth);
        this.salary = salary ;
    }

    public double getSalary(){
        return salary ;
    }
    @Override
    public String toString(){
        return super.toString() + ", salary : "+ salary ;
    }
}

public  class SuperKeyword{

    public static void main(String args[]){

        Student student  = new Student("aman", 2000, "Computer");
        Instructor instructor = new Instructor("rahul", 1990, 80000);

        System.out.println(student);
        System.out.println(instructor);

    }
}