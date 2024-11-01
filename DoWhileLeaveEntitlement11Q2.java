import java.util.Scanner;
public class DoWhileLeaveEntitlement11Q2 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave;
        String confirmation;
        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input11.nextInt();
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input11.next();
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input11.nextInt();
                while (numLeave > leaveEntitlement) {
                    System.out.println("You don't have enough leave entitlement");
                    System.out.print("How many day(s)? ");
                    numLeave = input11.nextInt();
                }
                leaveEntitlement -= numLeave;
                System.out.println("Remaining leave entitlement: " + leaveEntitlement);
            }
        } while (leaveEntitlement > 0);
        System.out.println("No remaining leave entitlement.");
    }
}