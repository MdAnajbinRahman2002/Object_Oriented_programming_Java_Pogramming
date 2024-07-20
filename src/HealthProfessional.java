public class HealthProfessional {
    private String name;
    private String specialization;
    private String practiceLocation;

    public HealthProfessional() {
        // default constructor
    }

    public HealthProfessional(String name, String specialization, String practiceLocation) {
        this.name = name;
        this.specialization = specialization;
        this.practiceLocation = practiceLocation;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Specialization: " + specialization + ", Practice Location: " + practiceLocation);
    }
}
