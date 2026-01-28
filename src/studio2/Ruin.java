import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Starting money?");
        int startAmount = in.nextInt();

        System.out.print("Win Chance");
        double winChance = in.nextDouble();

        System.out.print ("Win limit");
        double winLimit = in.nextDouble();

        System.out.print("Enter the number of days to simulate: ");
        int totaldays = in.nextInt();

        int ruinDays = 0;

        for (int day = 0; day < totaldays; day++) {
            int money = startAmount;
            int plays = 0;

            while (money>0 && money < winLimit) {
            plays++;

            double r = Math.random();
            if (r < winChance) {
                money++;
                System.out.println("You won!! Your money is: " + money);
                System.out.println("Play is: " + plays);   
            } else {
                money--;
                System.out.println("You lost. Your money is: " + money);
                System.out.println("Play is: " + plays); 
            }
        }
    }
}
}
