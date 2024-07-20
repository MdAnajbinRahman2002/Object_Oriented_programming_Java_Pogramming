public class SpecialistDoctor extends HealthProfessional {
    public SpecialistDoctor() {
        // default constructor
    }

    public SpecialistDoctor(int ID, String name, String specialization, String practiceLocation) {
        super(ID, name, specialization, practiceLocation);
    }

    @Override
    public void printDetails() {
        System.out.println("The doctor details are (Specialist Doctor):");
        super.printDetails();
    }
}
