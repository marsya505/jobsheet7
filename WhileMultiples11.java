import java.util.Scanner;
public class WhileMultiples11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;
        int i = 1; 
        System.out.print("Input the multiple: ");
        multiple = input11.nextInt();
        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i; 
                counter++; 
            }
            i++; 
        }
        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);
    }
}