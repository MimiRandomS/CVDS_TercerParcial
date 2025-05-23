package edu.eci.cvds.ECISalud.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@NotNull
@Data
@AllArgsConstructor
public class User {
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



    public User(String namePatient, String CCPatient, String mailPatient) {
        this.namePatient = namePatient;
        this.CCPatient = CCPatient;
        this.mailPatient = mailPatient;
    }

    private String namePatient;
    private String CCPatient;

    public User() {
    }

    private String mailPatient;
}
