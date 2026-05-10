import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");

        int n = sc.nextInt();

        int token = 0;

        int choice;

        do {

            System.out.println(
                    "\nProcess " + token
                            + " has the token.");

            System.out.print(
                    "Does Process "
                            + token
                            + " want to enter critical section? (1/0): ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println(
                        "Process "
                                + token
                                + " entering Critical Section.");

                System.out.println(
                        "Process "
                                + token
                                + " exiting Critical Section.");
            }

            token = (token + 1) % n;

            System.out.print(
                    "\nContinue? (1/0): ");

            choice = sc.nextInt();

        } while (choice == 1);

        sc.close();
    }
}