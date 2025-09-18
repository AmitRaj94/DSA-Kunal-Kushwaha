import java.util.Scanner;
import java.io.*;

public class arrayDataStructure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        for(int i = 0;i<size;i++) System.out.println(arr[i]);

        for(int i = 0 ; i < size ; i++ ){
            System.out.printf("Enter the %d element of an array: ",i+1);
            arr[i]= input.nextInt();
        }

        for(int i=0;i<size;i++) System.out.print(arr[i]);
    }
}
