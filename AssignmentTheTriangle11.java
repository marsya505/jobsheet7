import java.util.Scanner;
public class AssignmentTheTriangle11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input11.nextInt();
        for (int i = numInput; i > 0; i--) { 
            StringBuilder s = new StringBuilder(); 
            for (int j = 0; j < i; j++) { 
                s.append("* "); 
            }
            System.out.println(s.toString().trim()); 
        }
    }
}