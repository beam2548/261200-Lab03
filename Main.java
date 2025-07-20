public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "123-456-7890");
        patient.displayDetails(currentYear);
        System.out.printf("Patient BMI: %.2f\n", patient.getBMI());

    }
}
