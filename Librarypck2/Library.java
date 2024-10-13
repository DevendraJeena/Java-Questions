
// Create a **Library Management** system in Java 
// - The system should have a `Book` class with private fields for book title, author, and price.
// - Implement getter and setter methods to access and update these fields.
// - Use proper encapsulation for the fields.
// - The main program should be in a different package and should create and manage `Book` objects.
package Librarypck2;

import Librarypck1.Book ;

public class Library {
    
    public static void main(String[] args) {
        

        Book book =new Book();
        book.setBookName("english");
        book.setBookAuthor("peter");
        book.setBookPrice(200);

        System.out.println("Book name : "+ book.getBookName());
        System.out.println("Book author : "+ book.getBookAuthor());
        System.out.println("Book price : "+ book.getBookPrice());

    }
}
