public class HealthProfessional {
    private int ID;
    private String name;
    private String specialization;
    private String practiceLocation;

    public HealthProfessional() {
        // default constructor
    }

    public HealthProfessional(int ID, String name, String specialization, String practiceLocation) {
        this.ID = ID;
        this.name = name;
        this.specialization = specialization;
        this.practiceLocation = practiceLocation;
    }

    public int getID() {
        return ID;
    }

    public void printDetails() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Specialization: " + specialization + ", Practice Location: " + practiceLocation);
    }
}
