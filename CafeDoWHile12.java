import java.util.Scanner;

public class CafeDoWHile12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread, totalPrice, coffePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;

        do{
            System.out.print("Enter customer name(type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if(customerName.equalsIgnoreCase("cancel")){
                System.out.println("Transaction canceled.");
                break;
            }
        
            System.out.print("Coffe Quantity: ");
            coffee = sc.nextInt();
            System.out.print("Tea Quantity: ");
            tea = sc.nextInt();
            System.out.print("Bread Quantity: ");
            bread = sc.nextInt();
            totalPrice = (coffee * coffePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total Amount: Rp. " + totalPrice);
            sc.nextLine();
        }while(true);
        System.out.println("All transactions completed.");
        sc.close();
    }    
}
