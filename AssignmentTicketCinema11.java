import java.util.Scanner;
public class AssignmentTicketCinema11 {
    public static void main(String[] args) {
        int ticketPrice = 50000, tickets, totalTicketsSold = 0;
        double totalSales = 0.0, discount = 0.0, totalPrice;
        Scanner input11 = new Scanner(System.in);
        System.out.print("How much the tickets sold: ");
        tickets = input11.nextInt();
        while (true) {
            if (tickets == -1) {
                break;
            }
            if (tickets < 0) {
                System.out.println("Invalid");
                continue; 
            }
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }
            totalPrice = tickets * ticketPrice * (1 - discount);
            totalTicketsSold += tickets;
            totalSales += totalPrice;
            break;
        }
        System.out.printf("%nTotal tickets sold: %d%n", totalTicketsSold);
        System.out.printf("Total ticket sales: Rp %.2f%n", totalSales);
    }
}