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

package LibraryMemberpkg ;

public class LibMember {
    private String memberName;
    private int memberId ;
    private  int booksIssued ;

    public LibMember(String memberName ,int memberId ){
        this.memberName = memberName;
        this.memberId=memberId;
    }

    public String getmemberName(){
        return memberName;
    }
    public int getmemberId(){
        return memberId;
    }
    public int getbooksIssued(){
        return booksIssued;
    }

    public void setbooksIssued(int booksIssued){
        if(booksIssued > 0){
            this.booksIssued=booksIssued;
        }else{
            System.out.println("BooksIssued cannot be negative");
        }
    }

}
