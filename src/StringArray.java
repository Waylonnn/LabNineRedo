import java.util.Scanner;
public class StringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        System.out.print("How many strings would you like to enter? ");
        count = scan.nextInt();
        String [] array = new String[count];
        scan.nextLine(); // Buffer
        for(int i = 0; i < count; i++){
            System.out.print("Enter String number " + (i + 1) + ": ");
            array[i] = scan.nextLine();
        }
        System.out.print("Your array of strings is: [");
        for(int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "].");
    }
}
