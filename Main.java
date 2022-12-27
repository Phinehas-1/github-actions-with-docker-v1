import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Version "+System.getenv("app_version_num"));
        System.out.print("Enter a number to multiply by 7 : _ ");
        int result = new Scanner(System.in).nextInt();
        System.out.println("The result is " + result * 7);
    }
}