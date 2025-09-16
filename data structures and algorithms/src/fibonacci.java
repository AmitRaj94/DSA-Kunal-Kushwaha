import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        int fib1 = 0;
        int fib2 = 1;
        if (num == 0) {
            System.out.print(fib1);
        } else if (num == 1)
            System.out.print(fib2);
        else

    {
        for (int i = 2; i <= num; i++) {
            int temp = fib2;
            fib2 += fib1;
            fib1 = temp;
        }
        System.out.print(fib2);
    }
}
}

