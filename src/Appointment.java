import java.util.Date;

public class Appointment {
    private Patient patient;
    private HealthProfessional doctor;
    private Date date;

    public Appointment(Patient patient, HealthProfessional doctor, Date date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public Date getDate() {
        return date;
    }

    public void printDetails() {
        System.out.println("Appointment Details:");
        patient.printDetails();
        doctor.printDetails();
        System.out.println("Date: " + date);
    }
}
