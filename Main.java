import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("This application is running in a docker container.");
        System.out.print("Enter your name to get a greeting : _ ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello there " + name);
    }
}