public class GeneralPractitioner extends HealthProfessional {
    public GeneralPractitioner() {
        // default constructor
    }

    public GeneralPractitioner(int ID, String name, String specialization, String practiceLocation) {
        super(ID, name, specialization, practiceLocation);
    }

    @Override
    public void printDetails() {
        System.out.println("The doctor details are (General Practitioner):");
        super.printDetails();
    }
}
