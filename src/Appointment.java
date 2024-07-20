import java.util.Date;

public class Appointment {
    private HealthProfessional doctor;
    private Patient patient;
    private Illness illness;
    private Date date;

    public Appointment(HealthProfessional doctor, Patient patient, Illness illness, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.illness = illness;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void printDetails() {
        System.out.println("Appointment Details:");
        doctor.printDetails();
        patient.printDetails();
        illness.printDetails();
        System.out.println("Date: " + date);
    }
}
