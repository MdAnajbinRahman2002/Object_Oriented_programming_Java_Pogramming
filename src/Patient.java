public class Patient {
    private int id;
    private String name;
    private String phoneNumber;
    private String illness;

    public Patient(int id, String name, String phoneNumber, String illness) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.illness = illness;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIllness() {
        return illness;
    }

    public void printDetails() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Phone Number: " + phoneNumber + ", Illness: " + illness);
    }
}
