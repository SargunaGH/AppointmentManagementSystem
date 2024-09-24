package com.appointmentmanagementsystem;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private String description;
    private LocalDateTime dateTime;

    public Appointment(String appointmentId, String description, LocalDateTime dateTime) {
        this.appointmentId = appointmentId;
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Description: " + description + ", Date and Time: " + dateTime;
    }
}
