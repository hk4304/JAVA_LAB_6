package ASS_6_part_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Result res = new Result(); // Create an empty Result object

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Information");
            System.out.println("3. Display Result");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    res.enterStudentDetails(scanner);
                    break;
                case 2:
                    System.out.println(res.displayStudentInfo());
                    break;
                case 3:
                    System.out.println(res.displayResult());
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

