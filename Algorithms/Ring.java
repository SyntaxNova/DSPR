import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of processes: ");

        int n = sc.nextInt();

        int[] processes = new int[n];

        for (int i = 0; i < n; i++) {

            processes[i] = i + 1;
        }

        System.out.println("\nProcesses are:");

        for (int i = 0; i < n; i++) {

            System.out.print(
                    processes[i] + " ");
        }

        System.out.print(
                "\n\nEnter process initiating election: ");

        int initiator = sc.nextInt();

        int coordinator = initiator;

        System.out.println(
                "\nElection Message Passing:");

        int current = initiator;

        do {

            int next = (current % n) + 1;

            System.out.println(
                    "Process "
                            + current
                            + " sends message to Process "
                            + next);

            if (next > coordinator) {

                coordinator = next;
            }

            current = next;

        } while (current != initiator);

        System.out.println(
                "\nProcess "
                        + coordinator
                        + " becomes Coordinator.");

        System.out.println(
                "\nCoordinator Message Passing:");

        current = coordinator;

        do {

            int next = (current % n) + 1;

            System.out.println(
                    "Coordinator message from Process "
                            + current
                            + " to Process "
                            + next);

            current = next;

        } while (current != coordinator);

        sc.close();
    }
}