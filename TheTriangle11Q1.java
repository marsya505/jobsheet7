import java.util.Scanner;
public class TheTriangle11Q1 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int numInput = 0;
        String s = " "; 
        System.out.print("Input some number: ");
        numInput = input11.nextInt();
        for (int i = numInput; i > 0; i--) { 
                s += " *"; 
            System.out.println(s); 
        }    
    }
}