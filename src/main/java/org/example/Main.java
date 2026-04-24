package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                System.out.print("Enter Fees: ");
                double fees = sc.nextDouble();

                dao.saveStudent(new Student(name, course, fees));
                System.out.println("Student Saved!");
            } else if (choice == 2) {
                List<Student> list = dao.getAllStudents();
                list.forEach(s -> {
                    System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse() + " | " + s.getFees());
                });
            } else if (choice == 3) {
                System.out.print("Enter Student ID to update: ");
                int id = sc.nextInt();
                Student existing = dao.getStudentById(id);
                if (existing != null) {
                    System.out.println("Current Name: " + existing.getName());
                    System.out.print("Enter New Name (or press Enter to skip): ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    if (!name.trim().isEmpty()) {
                        existing.setName(name);
                    }

                    System.out.println("Current Course: " + existing.getCourse());
                    System.out.print("Enter New Course (or press Enter to skip): ");
                    String course = sc.nextLine();
                    if (!course.trim().isEmpty()) {
                        existing.setCourse(course);
                    }

                    System.out.println("Current Fees: " + existing.getFees());
                    System.out.print("Enter New Fees (or 0 to skip): ");
                    double fees = sc.nextDouble();
                    if (fees > 0) {
                        existing.setFees(fees);
                    }

                    dao.updateStudent(existing);
                    System.out.println("Student Updated Successfully!");
                } else {
                    System.out.println("Student not found!");
                }
            } else if (choice == 4) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();
                Student existing = dao.getStudentById(id);
                if (existing != null) {
                    dao.deleteStudent(id);
                    System.out.println("Student Deleted Successfully!");
                } else {
                    System.out.println("Student not found!");
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
