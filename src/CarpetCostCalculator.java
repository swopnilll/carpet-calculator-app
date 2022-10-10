import java.util.Scanner;

public class CarpetCostCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the width of your room");
        double room1Width = sc.nextDouble();

        System.out.println("Please enter the length of your room");
        double room1Length = sc.nextDouble();

        Carpet carpet1 = new Carpet(4);

        Floor floor1 = new Floor(room1Width, room1Length);

        Calculator calculator = new Calculator(floor1, carpet1);

        System.out.println(calculator.getTotalCost());
    }
}
