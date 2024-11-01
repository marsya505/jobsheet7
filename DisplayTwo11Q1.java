import java.util.Scanner;
public class DisplayTwo11Q1 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input11.nextInt();
        for (int i = 2; i <= numInput; i += 2) {
            System.out.println("2 multiple: " + i);
        }
    }
}