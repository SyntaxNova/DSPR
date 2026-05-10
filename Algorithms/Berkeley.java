import java.util.Scanner;

public class Berkeley {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of clocks: ");
        int n = sc.nextInt();

        int[] clocks = new int[n];

        int sum = 0;

        System.out.println("Enter clock times:");

        for (int i = 0; i < n; i++) {

            System.out.print(
                    "Clock " + (i + 1) + ": ");

            clocks[i] = sc.nextInt();

            sum += clocks[i];
        }

        int average = sum / n;

        System.out.println(
                "\nAverage Time = " + average);

        System.out.println(
                "\nTime Adjustments:");

        for (int i = 0; i < n; i++) {

            int adjustment =
                    average - clocks[i];

            System.out.println(
                    "Clock " + (i + 1)
                            + " adjustment = "
                            + adjustment);
        }

        System.out.println(
                "\nSynchronized Clock Times:");

        for (int i = 0; i < n; i++) {

            clocks[i] = average;

            System.out.println(
                    "Clock " + (i + 1)
                            + " = "
                            + clocks[i]);
        }

        sc.close();
    }
}