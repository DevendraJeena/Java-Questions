// Create a class LibBook (in the package LibraryBookpkg) with the following private fields:
// bookName (String)
// bookAuthor (String)
// bookPrice (int)
// Use a constructor to initialize the fields and provide getter methods for each field.
//  Include a setter for the price, but ensure the price cannot be set to a negative value.

// Create a class Member (in the package LibraryMemberpkg) with the following private fields:

// memberName (String)
// memberId (int)
// booksIssued (int)
// Use a constructor to initialize memberName and memberId. Provide getter methods for each field. 
// Add a setter method for booksIssued to update the number of books issued to the member. 
// Ensure the number of books issued cannot be negative.

// Create a main class LibManagement (in the package LibraryMenagepkg) that performs the following operations:

// Create a few Book and Member objects.
// Display the details of each book and member using the getter methods.
// Update the price of a book and the number of books issued to a member using the setter methods.
// After updating, display the updated details.

package Library_Management ;

import LibraryBookpkg.LibBook;
import LibraryMemberpkg.LibMember;

public class LibManagement{
        public static void main(String[] args) {
            
                LibBook book1 =new LibBook("english ", "peter", 500);
                LibBook book2 =new LibBook("economics ", "Jerry", 700);
                LibBook book3 =new LibBook("maths ", "peter parkar", 900);

                LibMember Member1 =new LibMember("sumit", 2);
                LibMember Member2 =new LibMember("mohit", 3);
                LibMember Member3 =new LibMember("aman", 4);

                System.out.println("Details of 1st book");
                System.out.println("book name :" + book1.getBookname());
                System.out.println("Book author :" + book1.getBookauthor());
                System.out.println("Book price : "+ book1.getBookPrice());

                System.out.println("Details of 2nd book");
                System.out.println("Book name :" + book2.getBookname());
                System.out.println("Book author :" + book2.getBookauthor());
                System.out.println("Book price : "+ book2.getBookPrice());

                System.out.println("Details of 3rd book");
                System.out.println("Book name :" + book3.getBookname());
                System.out.println("Book author :" + book3.getBookauthor());
                System.out.println("Book price : "+ book3.getBookPrice());

                System.out.println("Details of 1st Member");
                System.out.println("Member name :" + Member1.getmemberName());
                System.out.println("Member Id :" + Member1.getmemberId());

                System.out.println("Details of 2nd Member");
                System.out.println("Member name :" + Member2.getmemberName());
                System.out.println("Member Id :" + Member2.getmemberId());

                System.out.println("Details of 3rd Member");
                System.out.println("Member name :" + Member3.getmemberName());
                System.out.println("Member Id :" + Member3.getmemberId());
                
                book1.setBookprice(300);
                book2.setBookprice(600);

                Member1.setbooksIssued(3);
                Member2.setbooksIssued(5);
                Member3.setbooksIssued(6);

                System.out.println("Updated Details of 1st book");
                System.out.println("book name :" + book1.getBookname());
                System.out.println("Book author :" + book1.getBookauthor());
                System.out.println("Book price : "+ book1.getBookPrice());

                System.out.println("Updated Details of 2nd book");
                System.out.println("Book name :" + book2.getBookname());
                System.out.println("Book author :" + book2.getBookauthor());
                System.out.println("Book price : "+ book2.getBookPrice());

                System.out.println("Updated Details of 3rd book");
                System.out.println("Book name :" + book3.getBookname());
                System.out.println("Book author :" + book3.getBookauthor());
                System.out.println("Book price : "+ book3.getBookPrice());

                System.out.println("Updated Details of 1st Member");
                System.out.println("Member name :" + Member1.getmemberName());
                System.out.println("Member Id :" + Member1.getmemberId());
                System.out.println("Books Issued : "+ Member1.getbooksIssued());

                System.out.println("Updated Details of 2nd Member");
                System.out.println("Member name :" + Member2.getmemberName());
                System.out.println("Member Id :" + Member2.getmemberId());
                System.out.println("Books Issued : "+ Member2.getbooksIssued());


                System.out.println("Updated Details of 3rd Member");
                System.out.println("Member name :" + Member3.getmemberName());
                System.out.println("Member Id :" + Member3.getmemberId());
                System.out.println("Books Issued : "+ Member3.getbooksIssued());

                

        }
 }