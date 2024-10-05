public class practice {
    
    public static void main(String[] args) {
        
       
       circle.draw();
       square.draw();
       shape.draw();
       rectangle.draw();
       rectangle.area();
    }



}
class shape{
   
   public static void draw(){
     System.out.println("draw a shape");
   };
}

class circle extends shape{

 public static void draw(){
  System.out.println("draw circle");

 }

}
class square extends shape{
    public static void draw(){
System.out.println("draw square");

    }
}
class rectangle extends shape{

    public static void area(){
        System.out.println("length * breadth");
    }
}