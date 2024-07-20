import java.util.ArrayList;
import java.util.Date;

public class AssignmentOne {
    public static void main(String[] args) {
        // Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Creating data
        HealthProfessional surgeon1 = new HealthProfessional(1, "Dr. AKASH THIN", "Neuro Surgery", "Austin Hospital");
        HealthProfessional surgeon2 = new HealthProfessional(2, "Dr. MOGOL ML", "Heart Surgery", "Austin Hospital");
        GeneralPractitioner gp = new GeneralPractitioner(3, "Dr. Maken louf", "GP", "Austin Hospital");
        SpecialistDoctor therapist = new SpecialistDoctor(4, "Dr. kalo manik", "Therapist", "Austin Hospital");

        Patient patient1 = new Patient(1, "Rahim", "+6122221111", "Brain Tumor");
        Patient patient2 = new Patient(2, "Karim", "+6122221123", "Heart Attack");
        Patient patient3 = new Patient(3, "Lamin", "+6122221454", "Asthma");
        Patient patient4 = new Patient(4, "Sallah", "+612222544", "Therapy");

        ArrayList<Appointment> appointments = new ArrayList<>();

        // appointments
        appointments.add(new Appointment(patient1, surgeon1, new Date()));
        appointments.add(new Appointment(patient2, surgeon2, new Date()));
        appointments.add(new Appointment(patient3, gp, new Date()));
        appointments.add(new Appointment(patient4, therapist, new Date()));

        // Printing all appointments
        System.out.println("All Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println();
        }

        // Cancel an appointment for patient with ID 2
        CancelAppointment.cancelAppointment(appointments, 2);

        // Appointments after cancellation
        System.out.println("Appointments after cancellation:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
            System.out.println();
        }

        // Part 5 – Collection of appointments
        System.out.println("//Part 5 – Collection of appointments");
        System.out.println("------------------------------");
    }
}
