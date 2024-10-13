

// Create a **Library Management** system in Java 
// - The system should have a `Book` class with private fields for book title, author, and price.
// - Implement getter and setter methods to access and update these fields.
// - Use proper encapsulation for the fields.
// - The main program should be in a different package and should create and manage `Book` objects.

package Librarypck1 ;

public class Book {
    
private String BookName;
private String BookAuthor;
private int BookPrice ;         

//we can use constructor for this class also ex-
//  public Book(String BookName ,String BookAuthor, int BookPrice){
//     this.BookName =BookName ;
//     this.BookAuthor=BookAuthor;
//     this.BookPrice=BookPrice ;           
//     } 
//    but we are not using constructor  as we are inserting our values through setter method 
//      if we use constructor then we should use setter method to modify our constructor data or 
//      we should not use setter as it is not necessary 
// Even when constructors are used for setting data, setter methods provide:
// The ability to modify fields post-construction.
// A way to perform validation or data checks.
// Flexibility to set or update fields in different contexts.
// If you don't need these features, you could opt to make your fields 
// immutable by not providing setters at all. It all depends on your design requirements!

public String  getBookName(){   
    return BookName;
}
public void setBookName(String BookName){
    this.BookName =BookName;
}
public String getBookAuthor(){
    return BookAuthor ;
}
public void setBookAuthor(String BookAuthor){
    this.BookAuthor=BookAuthor;
}

public int getBookPrice(){
    return BookPrice ;
}
public void setBookPrice(int BookPrice){
    this.BookPrice=BookPrice ;
}

}
