import java.util.Scanner;

public class Bully {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of processes: ");

        int n = sc.nextInt();

        int[] processes = new int[n];

        for (int i = 0; i < n; i++) {

            processes[i] = i + 1;
        }

        int coordinator = processes[n - 1];

        System.out.println(
                "\nProcess "
                        + coordinator
                        + " is Coordinator.");

        System.out.print(
                "\nEnter process to fail: ");

        int fail = sc.nextInt();

        if (fail == coordinator) {

            System.out.println(
                    "\nCoordinator failed.");

            System.out.print(
                    "Enter process initiating election: ");

            int initiator = sc.nextInt();

            System.out.println(
                    "\nElection started by Process "
                            + initiator);

            for (int i = initiator; i < n; i++) {

                System.out.println(
                        "Election message sent from Process "
                                + initiator
                                + " to Process "
                                + processes[i]);
            }

            coordinator = processes[n - 2];

            System.out.println(
                    "\nProcess "
                            + coordinator
                            + " becomes new Coordinator.");
        }

        else {

            System.out.println(
                    "\nProcess "
                            + fail
                            + " failed.");

            System.out.println(
                    "Coordinator remains Process "
                            + coordinator);
        }

        sc.close();
    }
}