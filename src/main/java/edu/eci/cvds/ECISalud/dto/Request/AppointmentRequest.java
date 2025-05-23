package edu.eci.cvds.ECISalud.dto.Request;

import edu.eci.cvds.ECISalud.model.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class AppointmentRequest {
    private String namePatient;
    private String CCPatient;
    private String mailPatient;
    private String dateAppointment;
    private Speciality speciality;
    private String nameDoctor;
    private String ubication;
}
