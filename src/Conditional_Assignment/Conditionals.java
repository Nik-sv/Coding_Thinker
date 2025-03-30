package Conditional_Assignment;

import java.util.Scanner;

public class Conditionals {

    // 1. Library Late Fees
    public static void libraryLateFees() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days overdue: ");
        int days = sc.nextInt();
        System.out.print("Enter the book type (regular, fiction, reference): ");
        String type = sc.next();
        double fee = 0;

        if (type.equalsIgnoreCase("regular")) {
            fee = days * 0.50;
        } else if (type.equalsIgnoreCase("fiction")) {
            fee = days * 0.75;
        } else if (type.equalsIgnoreCase("reference")) {
            fee = 0;
        }

        System.out.println("Total Late Fee: $" + fee);
    }

    // 2. Grading System
    public static void gradingSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three subject scores: ");
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt();
        double avg = (s1 + s2 + s3) / 3.0;
        char grade;

        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Grade: " + grade);
    }

    // 3. Shop Discount Calculator
    public static void shopDiscount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int items = sc.nextInt();
        System.out.print("Enter total price: ");
        double price = sc.nextDouble();

        if (price > 100 && items >= 5) price *= 0.90;
        else if (price >= 50 && price <= 100) price *= 0.95;

        System.out.println("Total Price after Discount: $" + price);
    }

    // 4. Mobile Plan Selector
    public static void mobilePlan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes used: ");
        int minutes = sc.nextInt();
        System.out.print("Enter messages sent: ");
        int messages = sc.nextInt();
        double cost;

        if (minutes <= 100 && messages <= 100) {
            cost = 25 + Math.max(0, (minutes - 100) * 0.10) + Math.max(0, (messages - 100) * 0.05);
        } else if (minutes <= 200 && messages <= 200) {
            cost = 40 + Math.max(0, (minutes - 200) * 0.08) + Math.max(0, (messages - 200) * 0.03);
        } else {
            cost = 60;
        }

        System.out.println("Total Mobile Plan Cost: $" + cost);
    }

    // 5. Shipping Cost Calculator
    public static void shippingCost() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter package weight (lbs): ");
        int weight = sc.nextInt();
        System.out.print("Enter shipping distance (miles): ");
        int distance = sc.nextInt();
        int cost;

        if (weight <= 10 && distance <= 100) cost = 5;
        else if (weight <= 20 || distance <= 500) cost = 10;
        else cost = 20;

        System.out.println("Total Shipping Cost: $" + cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a program:");
            System.out.println("1. Library Late Fees");
            System.out.println("2. Grading System");
            System.out.println("3. Shop Discount Calculator");
            System.out.println("4. Mobile Plan Selector");
            System.out.println("5. Shipping Cost Calculator");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> libraryLateFees();
                case 2 -> gradingSystem();
                case 3 -> shopDiscount();
                case 4 -> mobilePlan();
                case 5 -> shippingCost();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

