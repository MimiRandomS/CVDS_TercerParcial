package edu.eci.cvds.ECISalud.service;

import edu.eci.cvds.ECISalud.dto.Request.AppointmentRequest;
import edu.eci.cvds.ECISalud.model.Appointment;
import edu.eci.cvds.ECISalud.model.enums.Speciality;
import edu.eci.cvds.ECISalud.model.enums.Status;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllByAppointmentStatus(Status appointmentStatus);
    Appointment createAppointent(AppointmentRequest appointmentRequest);
    List<Speciality> getAllSpecialitys();
    Boolean cancellAppointent(String idAppointment);

}
