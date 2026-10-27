import java.util.Scanner;

public class Assignment112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketQuantity, ticketPrice = 50000, totalTickets = 0;
        
        while(true) {
            System.out.println("Enter ticket quantity: ");
            ticketQuantity = sc.nextInt();
            if(ticketQuantity == 0){
                break;
            }
            if(ticketQuantity < 0 ){
                System.out.println("Invalid ticket quantity! Please enter the quantity again.");
                continue;
            }
        totalTickets += ticketQuantity;
        int subtotal = ticketQuantity * ticketPrice;
        double discountRate = 0;
        
            if(ticketQuantity > 10){
                discountRate = 0.15;
            }else if(ticketQuantity > 4){
                discountRate = 0.10;
            }
        double discount = subtotal * discountRate;
        double totalPayment = subtotal - discount;

        System.out.println("Subtotal: Rp. " + subtotal);
        System.out.println("Discount: Rp. " + discount);
        System.out.println("Total payment: Rp. " + totalPayment);

        }
        System.out.println("--- Daily Sales Report ---");
        System.out.println("Total tickets sold: " +totalTickets);
        System.out.println("Total ticket revenue: Rp. " + (totalTickets * ticketPrice));

        sc.close();
    }
}
