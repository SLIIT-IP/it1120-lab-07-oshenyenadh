import java.util.Scanner;

public class IT24101268Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;

        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            System.out.println("Enter the total bill amount for customer " + i + ": ");
            double totalBill = scanner.nextDouble();
            System.out.println("Enter the mode of payment (C/c for cash, O/o for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * DISCOUNT_RATE;
                double amountToBePaid = totalBill - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applied.");
                System.out.println("Amount to be paid: " + totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
