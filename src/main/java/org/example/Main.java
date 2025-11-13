package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while(true) {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                System.out.print("Enter Fees: ");
                double fees = sc.nextDouble();

                dao.saveStudent(new Student(name, course, fees));
                System.out.println("Student Saved!");
            }
            else if(choice == 2) {
                List<Student> list = dao.getAllStudents();
                list.forEach(s -> {
                    System.out.println(s.getId()+" | "+s.getName()+" | "+s.getCourse()+" | "+s.getFees());
                });
            }
            else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
