import java.util.ArrayList;
import java.util.Date;

public class AssignmentOne {
    public static void main(String[] args) {
        // Create sample data
        HealthProfessional surgeon = new HealthProfessional("Dr. Smith", "Surgery", "Hospital A");
        HealthProfessional surgeon2 = new HealthProfessional("Dr. Lee", "Surgery", "Hospital B");
        GeneralPractitioner gp = new GeneralPractitioner("Dr. Johnson", "GP", "Clinic B");

        Patient patient1 = new Patient(1, "John Doe", "123-456-7890");
        Patient patient2 = new Patient(2, "Jane Doe", "098-765-4321");
        Patient patient3 = new Patient(3, "Alice Johnson", "555-555-5555");

        Illness illness1 = new Illness("Flu");
        Illness illness2 = new Illness("Cold");
        Illness illness3 = new Illness("Allergy");

        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create appointments
        appointments.add(new Appointment(surgeon, patient1, illness1, new Date()));
        appointments.add(new Appointment(surgeon2, patient2, illness2, new Date()));
        appointments.add(new Appointment(gp, patient3, illness3, new Date()));

        // Print all appointments
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println();
        }

        // Cancel an appointment for patient with ID 1
        CancelAppointment.cancelAppointment(appointments, 1);

        // Print all appointments after cancellation
        System.out.println("Appointments after cancellation:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println();
        }
    }
}
