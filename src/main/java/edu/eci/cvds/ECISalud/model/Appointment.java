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

    public Appointment(User user, String dateAppointment, Speciality speciality, String nameDoctor, String ubication, Status appointmentStatus) {
        this.user = user;
        this.dateAppointment = dateAppointment;
        this.speciality = speciality;
        this.nameDoctor = nameDoctor;
        this.ubication = ubication;
        this.appointmentStatus = appointmentStatus;
    }

    private Speciality speciality;
    private String nameDoctor;
    private String ubication;
    private Status appointmentStatus;
}
