


import java.util.Scanner;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the transaction array
        System.out.print("Enter the size of transaction array: ");
        int size = scanner.nextInt();

        // Read the values of the transaction array
        System.out.print("Enter the values of array: ");
        int[] transactions = new int[size];
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        // Read the total number of targets that need to be achieved
        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();

        // Process each target
        for (int i = 0; i < numTargets; i++) {
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();

            int sum = 0;
            int transactionsNeeded = 0;

            // Calculate the sum of transactions until the target is reached
            for (int j = 0; j < size; j++) {
                sum += transactions[j];
                transactionsNeeded++;

                if (sum >= target) {
                    break;
                }
            }

            // Check if the target is achieved
            if (sum >= target) {
                System.out.println("Target achieved after " + transactionsNeeded + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }

        scanner.close();
    }
}