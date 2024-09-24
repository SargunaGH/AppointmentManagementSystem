package com.appointmentmanagementsystem;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class AppointmentManager {
    private Map<String, Appointment> appointments;

    public AppointmentManager() {
        appointments = new HashMap<>();
    }

    // Add new appointment
    public void addAppointment(String appointmentId, String description, LocalDateTime dateTime) {
        if (!appointments.containsKey(appointmentId)) {
            Appointment newAppointment = new Appointment(appointmentId, description, dateTime);
            appointments.put(appointmentId, newAppointment);
            System.out.println("Appointment added successfully!");
        } else {
            System.out.println("Appointment ID already exists.");
        }
    }

    // View all appointments
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments.values()) {
                System.out.println(appointment);
            }
        }
    }

    // Update appointment details
    public void updateAppointment(String appointmentId, LocalDateTime newDateTime) {
        Appointment appointment = appointments.get(appointmentId);
        if (appointment != null) {
            appointment.setDateTime(newDateTime);
            System.out.println("Appointment updated successfully.");
        } else {
            System.out.println("Appointment not found.");
        }
    }

    // Delete appointment
    public void deleteAppointment(String appointmentId) {
        if (appointments.containsKey(appointmentId)) {
            appointments.remove(appointmentId);
            System.out.println("Appointment deleted successfully.");
        } else {
            System.out.println("Appointment not found.");
        }
    }
}
