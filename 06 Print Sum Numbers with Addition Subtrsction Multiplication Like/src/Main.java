import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = Input.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = Input.nextInt();

        System.out.println(num1+ " + " +num2 + " = " + (num1 + num2));

        System.out.println(num1+ " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num1));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}