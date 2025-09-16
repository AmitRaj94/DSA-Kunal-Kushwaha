import java.util.Scanner;

public class reversingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(reversed(num));
    }
    static int reversed(int n){
        int reverse=0;
        while(n>0){
            reverse=reverse*10+(n%10);
            n/=10;
        }
        return reverse;
    }
}
