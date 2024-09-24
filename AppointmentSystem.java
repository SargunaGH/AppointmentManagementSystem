package com.appointmentmanagementsystem;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppointmentSystem {
    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        while (true) {
            System.out.println("\n--- Appointment Management System ---");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Update Appointment");
            System.out.println("4. Delete Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter appointment ID: ");
                    String appointmentId = sc.nextLine();
                    System.out.print("Enter description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter date and time (yyyy-MM-dd HH:mm): ");
                    String dateTimeStr = sc.nextLine();
                    LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
                    manager.addAppointment(appointmentId, description, dateTime);
                    break;

                case 2:
                    System.out.println("\nAll Appointments:");
                    manager.viewAppointments();
                    break;

                case 3:
                    System.out.print("Enter appointment ID: ");
                    String appointmentIdToUpdate = sc.nextLine();
                    System.out.print("Enter new date and time (yyyy-MM-dd HH:mm): ");
                    String newDateTimeStr = sc.nextLine();
                    LocalDateTime newDateTime = LocalDateTime.parse(newDateTimeStr, formatter);
                    manager.updateAppointment(appointmentIdToUpdate, newDateTime);
                    break;

                case 4:
                    System.out.print("Enter appointment ID to delete: ");
                    String appointmentIdToDelete = sc.nextLine();
                    manager.deleteAppointment(appointmentIdToDelete);
                    break;

                case 5:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
