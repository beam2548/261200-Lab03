public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    // Constructor
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getAge(int currentYear) {
        if (currentYear >= birthYear)
            return currentYear - birthYear;
        return 0;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBMI() {
        if (height <= 0) return -1; // กันค่าผิดปกติ
        double heightInMeter = height / 100.0;
        return weight / (heightInMeter * heightInMeter);
    }

    public void displayDetails(int currentYear) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + (currentYear - birthYear));
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Phone: " + phoneNumber);

        double bmi = getBMI();
        if (bmi != -1)
            System.out.printf("BMI: %.2f\n", bmi);
        else
            System.out.println("BMI: Invalid data");
    }
}
