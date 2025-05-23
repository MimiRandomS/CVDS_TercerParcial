package edu.eci.cvds.ECISalud.service.impl;

import edu.eci.cvds.ECISalud.dto.Request.AppointmentRequest;
import edu.eci.cvds.ECISalud.model.Appointment;
import edu.eci.cvds.ECISalud.model.User;
import edu.eci.cvds.ECISalud.model.enums.Speciality;
import edu.eci.cvds.ECISalud.model.enums.Status;
import edu.eci.cvds.ECISalud.repository.AppointmentRepository;
import edu.eci.cvds.ECISalud.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Override
    public List<Appointment> getAllByAppointmentStatus(Status appointmentStatus) {
        ArrayList<Appointment> result = new ArrayList<>();
        List<Appointment> appointments = appointmentRepository.findAll();
        for (Appointment appointment : appointments) {
            if (Objects.equals(appointment.getAppointmentStatus(), appointmentStatus)) {
                result.add(appointment);
            }
        }
        return result;
    }

    @Override
    public Appointment createAppointent(AppointmentRequest appointmentRequest) {
        User user = new User(appointmentRequest.getNamePatient(), appointmentRequest.getMailPatient(), appointmentRequest.getCCPatient());
        Status appointmentStatus = Status.APPROVED;
        Appointment appointment = new Appointment(user, appointmentRequest.getDateAppointment(), appointmentRequest.getSpeciality(), appointmentRequest.getNameDoctor(), appointmentRequest.getUbication(), appointmentStatus);
        appointmentRepository.save(appointment);
        return appointment;
    }

    @Override
    public List<Speciality> getAllSpecialitys() {
        List<Speciality> specialities = new ArrayList<>();
        specialities.add(Speciality.MEDICINE);
        specialities.add(Speciality.PSYCHOLOGY);
        specialities.add(Speciality.ORTHOPEDICS);
        specialities.add(Speciality.DENTISTRY);
        return specialities;
    }

    @Override
    public Boolean cancellAppointent(String idAppointment) {
        List<Appointment> appointments = appointmentRepository.findAll();
        for (Appointment appointment : appointments) {
            if (Objects.equals(appointment.getIdAppointment(), idAppointment)) {
                appointment.setAppointmentStatus(Status.DECLINED);
                return true;
            }
        }
        return false;
    }
}
