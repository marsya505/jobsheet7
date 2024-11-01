import java.util.Scanner;
public class ForMultiples11Q3 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;
        double average;
        System.out.print("Input the multiple: ");
        multiple = input11.nextInt();
        for(int i=1; i<= 50; i++){
            if(i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.printf("The average of the multiples is %.2f. \n", average);
        } else {
            System.out.println("No multiples found within the range.");
        }
    }
}