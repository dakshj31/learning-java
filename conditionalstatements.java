import java.util.Scanner;
public class conditionalstatements {

    public static void main(String[] args) {
    
        // If else statement

    // Scanner scanner = new Scanner(System.in);

    // int age = scanner.nextInt();
    // if(age >= 18) {
    //     System.out.println("Adult");
    // } else {
    //     System.out.println("Teen");
    // }
    // scanner.close();

    // Scanner scanner = new Scanner(System.in);

    // int grade = scanner.nextInt();
    // if (grade >= 90) {
    //     System.out.println("A");
    // } else {
    //     if (grade >= 70) {
    //         System.out.println("B");
    //     }
    //     else {
    //         if (grade >= 50) {
    //             System.out.println("C");
    //         }
    //         else{
    //             if (grade >= 35) {
    //             System.out.println("D");
    //             }
    //             else {
    //             System.out.println("Fail");
                    
    //             }
                
    //         }
    //     }
    // }

    // scanner.close();

    // else if

    Scanner scanner = new Scanner(System.in);

    int grade = scanner.nextInt();

    if (grade  >= 90) {
        System.out.println("Grade A");
    } else if (grade >= 70) {
        System.out.println("Grade B");
    }
    else if (grade >= 50) {
        System.out.println("Grade C");
    }
    else if (grade >= 35) {
        System.out.println("Grade D");
    }
    else  {
        System.out.println("Fail");
    }

    scanner.close();
}
}