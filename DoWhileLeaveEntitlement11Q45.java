import java.util.Scanner;
public class DoWhileLeaveEntitlement11Q45 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave;
        String confirmation;
        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input11.nextInt();
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input11.next();
            if (!confirmation.equalsIgnoreCase("y") && !confirmation.equalsIgnoreCase("n")) {
                System.out.println("Invalid");
                break;
            }
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input11.nextInt();
                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement.");
                }
            }
        } while (leaveEntitlement > 0);
    }
}