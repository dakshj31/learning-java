import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // ************* For Loop *************** //

        // int size = scanner.nextInt();
        // int[] arr = new int[size];
        // int i;
        // for (i = 0; i<=size-1;i++) {
        //     arr[i] = scanner.nextInt();
        // }

        // int sum = 0;

        // for(i = 0;i<=size-1;i++) {
        //     sum = sum + arr[i];
        // }

        // System.out.println(sum);

        // scanner.close();

        //*************** While Loop**********************//
        
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        while (i <=50) {
            System.out.println(i);

            // increment
            i = i+2;
            
        }
        scanner.close();
    }
}
