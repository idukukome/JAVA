//Main2.java
import java.util.Scanner;

public class Main2 {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        // we are creating a hiring tool where the HR can register candidates based oon eligibility to the database
        //databaase connnection is not done in this program to avoid complexity at this point of time
        //this could be completed using simple if else too but when systems become complex and big using the standard approach becomes the best solution
        System.out.println("Enter the candidate Details");

        System.out.println("Name:");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Enter Percentage in 10th");
        int percentage = scanner.nextInt();
        if (percentage)
    }
}