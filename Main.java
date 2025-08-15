import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Registering person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Height (in meters): ");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.print("Weight (in kg): ");
            double weight = Double.parseDouble(scanner.nextLine());

            people[i] = new Person(name, age, height, weight);
            System.out.println();
        }

        System.out.println("Registered data:");
        for (Person p : people) {
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age + (p.checkIfAdult() ? " (Adult)" : " (Minor)"));
            System.out.printf("BMI: %.2f\n", p.calculateBMI());
            System.out.println("----------------------");
        }

        scanner.close();
    }
}
