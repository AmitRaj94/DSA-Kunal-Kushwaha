import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("Enter the target number: ");
        int target = input.nextInt();
        input.close();
        System.out.println(counter(n,target));
    }
    static int counter(int n,int tar){
        int count=0;
        while (n>0){
            if(n%10==tar){
                count++;
                n/=10;
            }
            else{
                n/=10;
            }
        }
        return count;
    }
}
