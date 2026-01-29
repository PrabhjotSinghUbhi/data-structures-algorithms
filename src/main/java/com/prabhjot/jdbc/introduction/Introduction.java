package com.prabhjot.jdbc.introduction;

import java.sql.*;
import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageStudentDB ms = new ManageStudentDB();
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

                    ms.addStudent(name, section, marks);
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

class ManageStudentDB {

    private static String url = System.getenv("DB_URL");
    private static String password = System.getenv("DB_PASSWORD");
    private static String user = System.getenv("DB_USER");
    private static String addStatement = "INSERT INTO students(name,section,marks) VALUES (?,?,?)";
    private static String selectStudents = "SELECT * FROM students";
    private static String updateStudentName = "UPDATE students SET name=? WHERE id=?";
    private static String updateStudentMarks = "UPDATE students SET marks=? WHERE id=?";
    private static String deleteStudent = "DELETE FROM students WHERE id=?";
    private static String viewWithCondition = "SELECT * FROM students WHERE id=?";

    public void selectAllStudents() {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();
                ResultSet re = st.executeQuery(selectStudents)
        ) {

            while (re.next()) {
                System.out.println(STR."\{re.getInt("id")} \{re.getString("name")} \{re.getInt("marks")}");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(String name, String section, int marks) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(addStatement)
        ) {
            ps.setString(1, name);
            ps.setString(2, section);
            ps.setInt(3, marks);

            ps.executeUpdate();
            System.out.println("Student added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUpdateStudentName(int id, String name) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(updateStudentName)
        ) {
            ps.setInt(2, id);
            ps.setString(1, name);

            ps.executeUpdate();
            System.out.println("Updated Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUpdateStudentMarks(int id, int marks) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(updateStudentMarks)
        ) {
            ps.setInt(2, id);
            ps.setInt(1, marks);

            ps.executeUpdate();
            System.out.println("Updated Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(deleteStudent);
        ) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Deleted Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStudentById(int id) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(viewWithCondition);
        ) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        STR."\{rs.getInt("id")} \{rs.getString("name")} \{rs.getString("Section")} \{rs.getInt("marks")}"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}