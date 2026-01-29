package com.prabhjot.jdbc.introduction;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO ms = new StudentDAO();
        boolean playing = true;
        while (playing) {
            int input;
            System.out.println(
                    "\n\n\n" +
                            "1 Add Student\n" +
                            "2 View Students\n" +
                            "3. Update Name\n" +
                            "4. Update Marks\n" +
                            "5. Delete Students\n" +
                            "6. View By Id\n" +
                            "0. exit\n"
            );

            input = Integer.parseInt(sc.nextLine());

            switch (input) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Section: ");
                    String section = sc.nextLine();

                    StudentPOJO s = new StudentPOJO(name, marks, section);
                    ms.addStudent(s);
                    break;

                case 2:
                    ms.selectAllStudents();
                    break;

                case 3:
                    System.out.print("Enter id of the student: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("\nEnter new name: ");
                    String newName = sc.nextLine();

                    ms.setUpdateStudentName(id, newName);
                    break;

                case 4:
                    System.out.print("Enter id of the student: ");
                    int id2 = Integer.parseInt(sc.nextLine());

                    System.out.print("\nEnter new Marks: ");
                    int newMarks = Integer.parseInt(sc.nextLine());

                    ms.setUpdateStudentMarks(id2, newMarks);
                    break;

                case 5:
                    System.out.print("Enter id of the student: ");
                    int id3 = Integer.parseInt(sc.nextLine());

                    ms.deleteStudent(id3);
                    break;

                case 6:
                    System.out.print("Enter id of the student: ");
                    int id4 = Integer.parseInt(sc.nextLine());
                    ms.selectStudentById(id4);
                    break;

                case 0:
                    playing = false;
                    break;

                default:
                    System.out.println("Enter Valid Input");
            }
        }

    }
}