package edu.eci.cvds.ECISalud.dto.Request;

import edu.eci.cvds.ECISalud.model.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AppointmentRequest {
    private String namePatient;
    private String CCPatient;

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getCCPatient() {
        return CCPatient;
    }

    public void setCCPatient(String CCPatient) {
        this.CCPatient = CCPatient;
    }

    public String getMailPatient() {
        return mailPatient;
    }

    public void setMailPatient(String mailPatient) {
        this.mailPatient = mailPatient;
    }

    public String getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(String dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    private String mailPatient;
    private String dateAppointment;
    private Speciality speciality;
    private String nameDoctor;
    private String ubication;
}
