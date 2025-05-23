package edu.eci.cvds.ECISalud.repository;

import edu.eci.cvds.ECISalud.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
