import java.util.Scanner;

public class VehicleSpeed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter current gear (1 - 5): ");
        int gear = input.nextInt();

        System.out.print("Are brakes applied? (yes/no): ");
        String brakes = input.next().toLowerCase();

        int speed = 0;

        // Speed based on gear
        switch (gear) {
            case 1: speed = 20; break;
            case 2: speed = 40; break;
            case 3: speed = 60; break;
            case 4: speed = 80; break;
            case 5: speed = 100; break;
            default:
                System.out.println("Invalid gear selected");
                return;
        }

        // Reduce speed if brakes applied
        if (brakes.equals("yes")) {
            speed -= 20;
            if (speed < 0) speed = 0;
        }

        System.out.println("Vehicle speed: " + speed + " km/h");
    }
}