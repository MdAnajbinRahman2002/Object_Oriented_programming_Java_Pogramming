public class Patient {
    private int id;
    private String name;
    private String phoneNumber;

    public Patient(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public void printDetails() {
        System.out.println("Patient ID: " + id + ", Name: " + name + ", Phone Number: " + phoneNumber);
    }
}
