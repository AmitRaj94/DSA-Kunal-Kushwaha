import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the secound number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        if(num1>num2  && num1>num3) System.out.print(num1+" is largest");
        else if (num2>num3 && num2>num1) System.out.print(num2+" is largest");
        else System.out.print(num3+" is largest ");

    }
}
