import java.util.ArrayList;
import java.util.Date;

public class AssignmentOne {
    public static void main(String[] args) {
        // Create sample data
        HealthProfessional surgeon1 = new HealthProfessional(1, "MR KARAM", "Surgery", "EPWORTH HOSPITAL");
        HealthProfessional surgeon2 = new HealthProfessional(2, "JOHN WICK", "Surgery", "EPWORTH HOSPITAL");
        GeneralPractitioner gp = new GeneralPractitioner(3, "JOHN CHENA", "GP", "EPWORTH HOSPITAL");

        Patient patient1 = new Patient(1, "ALEX PATEL", "+612000054");
        Patient patient2 = new Patient(2, "MOIN AKASH", "+619999822");
        Patient patient3 = new Patient(3, "KALO MANIK", "+644221111");

        Illness illness1 = new Illness("Brain Tumor");
        Illness illness2 = new Illness("Heart Bulb");
        Illness illness3 = new Illness("Allergy");

        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create appointments
        appointments.add(new Appointment(surgeon1, patient1, illness1, new Date()));
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
