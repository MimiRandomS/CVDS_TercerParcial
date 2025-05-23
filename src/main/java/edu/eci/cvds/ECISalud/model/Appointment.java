package edu.eci.cvds.ECISalud.model;

import edu.eci.cvds.ECISalud.model.enums.Speciality;
import edu.eci.cvds.ECISalud.model.enums.Status;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NotNull
@Data
@AllArgsConstructor
@Document(collection = "Appointment")
public class Appointment {
    @Id
    private String idAppointment;
    private User user;
    private String dateAppointment;
    private Speciality speciality;
    private String nameDoctor;
    private String ubication;

    public String getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(String idAppointment) {
        this.idAppointment = idAppointment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Status getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(Status appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    private Status appointmentStatus;

    public Appointment(User user, String dateAppointment, Speciality speciality, String nameDoctor, String ubication, Status appointmentStatus) {
        this.user = user;
        this.dateAppointment = dateAppointment;
        this.speciality = speciality;
        this.nameDoctor = nameDoctor;
        this.ubication = ubication;
        this.appointmentStatus = appointmentStatus;
    }
}
