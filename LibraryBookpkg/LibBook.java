// Create a class LibBook (in the package Library.Books) with the following private fields:
// bookName (String)
// bookAuthor (String)
// bookPrice (int)
// Use a constructor to initialize the fields and provide getter methods for each field.
//  Include a setter for the price, but ensure the price cannot be set to a negative value.

// Create a class Member (in the package Library.Members) with the following private fields:

// memberName (String)
// memberId (int)
// booksIssued (int)
// Use a constructor to initialize memberName and memberId. Provide getter methods for each field. 
// Add a setter method for booksIssued to update the number of books issued to the member. 
// Ensure the number of books issued cannot be negative.

// Create a main class LibraryManagement (in the package Library) that performs the following operations:

// Create a few Book and Member objects.
// Display the details of each book and member using the getter methods.
// Update the price of a book and the number of books issued to a member using the setter methods.
// After updating, display the updated details.


package LibraryBookpkg;

public class LibBook {
    
    private String Bookname;
    private String Bookauthor ;
    private int Bookprice ;

    public LibBook(String Bookname , String Bookauthor, int Bookprice){
        this.Bookname=Bookname ;
        this.Bookauthor =Bookauthor;
        this.Bookprice = Bookprice ;
    }
    public String getBookname(){
        return Bookname;
    }
    public String getBookauthor(){
        return Bookauthor;
    }
    public int getBookPrice(){
        return Bookprice;
    }

    public void setBookprice(int Bookprice){
        if(Bookprice >0){
            this.Bookprice =Bookprice ;
        }else{
            System.out.println("book price cannot be negative");
        }
    }
    
}
