package edu.eci.cvds.ECISalud.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@NotNull
@Data
@AllArgsConstructor
public class User {
    private String namePatient;
    private String CCPatient;
    private String mailPatient;
}
