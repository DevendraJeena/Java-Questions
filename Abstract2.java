// Write a program Create an abstract class order having members id
//  and description. Create two subclasses Purchase Order and SalesOrder
//   with member customer name and vendor name respectively. Define methods
//    accept and display in all classes. Create 5 objects each of Purchase Order
//     and SalesOrder. Accept and display details



import java.util.* ;
abstract class Order{

    int id ;
    String description;

    public Order(){

    }

    abstract void accept(Scanner sc);
    abstract void display() ;

}
class PurchaseOrder extends Order{

    String customer_name ;
    
    @Override 
    void accept(Scanner sc){
        System.out.println("enter the purchase id");
        id =sc.nextInt();
        sc.nextLine();
        System.out.println("enter the description");
        description = sc.nextLine();
        System.out.println("enter the cutomer name");
        customer_name = sc.nextLine();

    }
    @Override
    void display(){
        System.out.println("Purchase id :" + id);
        System.out.println("Description :" + description);
        System.out.println("Name of the customer :" + customer_name);

    }
}

class SalesOrder extends Order{

    String vendor_name ;

    @Override
    void accept(Scanner sc){

        System.out.println("enter the Sale order id");
        id =sc.nextInt();
        sc.nextLine();
        System.out.println("enter the description");
        description = sc.nextLine();
        System.out.println("enter the vendor name");
        vendor_name = sc.nextLine();
    }

    @Override
    void display(){
        System.out.println("Sales order id :" + id);
        System.out.println("Description :" + description);
        System.out.println("Name of the vendor :"+ vendor_name);
    }
}

public class Abstract2 {
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         PurchaseOrder [] purchaseOrders = new PurchaseOrder[5];
         SalesOrder [] salesOrders = new SalesOrder[5];

         for(int i=0; i<5;i++){
             purchaseOrders [i] = new PurchaseOrder();
             System.out.println("enterring the details for purchasing orders" + (i+1));
             purchaseOrders[i].accept(sc);
         }


         for(int i=0;i<5;i++){
            salesOrders[i] = new SalesOrder();
            System.out.println("enterring the details for sales order");
            salesOrders[i].accept(sc);
         }

        for(PurchaseOrder order: purchaseOrders){
            order.display();
            System.out.println();
        }

        for(SalesOrder order: salesOrders){
            order.display();
            System.out.println();
        }
    }

}
