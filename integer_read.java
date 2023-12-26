
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int enteredInteger = s.nextInt();
        System.out.println("entered integer: " + enteredInteger);
        s.close();
    }
    
}
