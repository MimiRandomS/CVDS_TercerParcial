package edu.eci.cvds.ECISalud.controller;

import edu.eci.cvds.ECISalud.dto.Request.AppointmentRequest;
import edu.eci.cvds.ECISalud.model.Appointment;
import edu.eci.cvds.ECISalud.model.enums.Speciality;
import edu.eci.cvds.ECISalud.model.enums.Status;
import edu.eci.cvds.ECISalud.service.AppointmentService;
import edu.eci.cvds.ECISalud.service.impl.AppointmentServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/ECISalud/Appointment")
@Tag(name = "Appointment", description = "Operaciones relacionadas con reservas")
public class AppointmentController {
    @Autowired
    private AppointmentServiceImpl appointmentServiceImpl;

    @Operation(summary = "Obtener todos las reservas medicas de un ususario a partir de su cedula", description = "Devuelve una lista con todas las reservas relacionadas")
    @GetMapping("/getAll/{CCPatient}")
    public ResponseEntity<List<Appointment>> getAllByUser(@PathVariable Status appointmentStatus){
        List<Appointment> appointments = appointmentServiceImpl.getAllByAppointmentStatus(appointmentStatus);
        if (appointments.isEmpty()) return new ResponseEntity<>(appointments, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(appointments, HttpStatus.ACCEPTED);
    }

    @Operation(summary = "Obtener todos las reservas medicas de un ususario a partir de su cedula", description = "Devuelve una lista con todas las reservas relacionadas")
    @PutMapping("/createAppointment")
    public ResponseEntity<?> createAppointent(@RequestBody AppointmentRequest appointmentRequest){
        return new ResponseEntity<>(appointmentServiceImpl.createAppointent(appointmentRequest), HttpStatus.CREATED);
    }

    @Operation(summary = "Obtener todas las especialidades medicas", description = "Devuelve una lista con todas las especialidades")
    @GetMapping("/getAllSpecialities")
    public ResponseEntity<List<Speciality>> getAllSpecialitys(){
        return new ResponseEntity<>(appointmentServiceImpl.getAllSpecialitys(), HttpStatus.ACCEPTED);
    }

    @Operation(summary = "Obtener todas las especialidades medicas", description = "Devuelve una lista con todas las especialidades")
    @PostMapping("/CancellAppointment/{idAppointment}")
    public ResponseEntity<?> cancellAppointent(@RequestBody String idAppointment){
        Boolean b = appointmentServiceImpl.cancellAppointent(idAppointment);
        if (b) return new ResponseEntity<>(HttpStatus.ACCEPTED);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
