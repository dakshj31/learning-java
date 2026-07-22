import java.util.Scanner;
public class conditionalstatements {

    public static void main(String[] args) {
    
        // ***************If else statement***************** //

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

    // ****************Else If********************* //

    // Scanner scanner = new Scanner(System.in);

    // int grade = scanner.nextInt();

    // if (grade  >= 90) {
    //     System.out.println("Grade A");
    // } else if (grade >= 70) {
    //     System.out.println("Grade B");
    // }
    // else if (grade >= 50) {
    //     System.out.println("Grade C");
    // }
    // else if (grade >= 35) {
    //     System.out.println("Grade D");
    // }
    // else  {
    //     System.out.println("Fail");
    // }

    // scanner.close();

    // ********** Nested If Else*************** //

    // Scanner scanner = new Scanner(System.in);
    // int num1 = scanner.nextInt();
    // int num2 = scanner.nextInt();
    // int num3 = scanner.nextInt();

    // if(num1 > num2) {
    //     if (num1 > num3) {
    //         System.out.println("num1 is greatest" + num1);
    //     }
    //     else if (num3 > num1) {
    //         System.out.println("num3 is greatest" + num3);
    //     }
    // } else {
    //     if (num2 > num3) {
    //         System.out.println("num2 is greatest " + num2);
    //     } else {
    //         System.out.println("num3 is greatest " + num3);
    //     }
    // }
    // scanner.close();

    // *************** Switch Statement*************************** //

    Scanner scanner = new Scanner(System.in);
    int dayNumb = scanner.nextInt();

    switch (dayNumb) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;    
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;                
        default:
            System.out.println("Invalid Number");
            break;
            
    }
    scanner.close();
}
}