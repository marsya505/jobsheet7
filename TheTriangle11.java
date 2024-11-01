import java.util.Scanner;
public class TheTriangle11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int numInput, i = 0;
        String s = " ";
        System.out.print("Input some number: ");
        numInput = input11.nextInt();
        while (i < numInput) {
            s += " *";
            System.out.println(s);
            i++;
        }
    }
}