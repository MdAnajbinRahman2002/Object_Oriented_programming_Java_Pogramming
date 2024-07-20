import java.util.ArrayList;

public class CancelAppointment {
    public static void cancelAppointment(ArrayList<Appointment> appointments, int patientId) {
        Appointment appointmentToRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getId() == patientId) {
                appointmentToRemove = appointment;
                break;
            }
        }

        if (appointmentToRemove != null) {
            appointments.remove(appointmentToRemove);
            System.out.println("Appointment cancelled successfully for Patient ID: " + patientId);
        } else {
            System.out.println("No appointment found for the given Patient ID: " + patientId);
        }
    }
}
