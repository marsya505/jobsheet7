import java.util.Scanner;
public class DisplayTwo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input11.nextInt();
        for(int i = 1; i <= numInput; i++) {
            if(i % 2 == 0) {
                System.out.println("2 multiple: "+i);
            }
        }
    }
}