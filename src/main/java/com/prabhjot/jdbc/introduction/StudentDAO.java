package com.prabhjot.jdbc.introduction;

import java.sql.*;

class StudentDAO {

    private static final String url = System.getenv("DB_URL");
    private static final String password = System.getenv("DB_PASSWORD");
    private static final String user = System.getenv("DB_USER");
    private static final String addStatement = "INSERT INTO students(name,section,marks) VALUES (?,?,?)";
    private static final String selectStudents = "SELECT * FROM students";
    private static final String updateStudentName = "UPDATE students SET name=? WHERE id=?";
    private static final String updateStudentMarks = "UPDATE students SET marks=? WHERE id=?";
    private static final String deleteStudent = "DELETE FROM students WHERE id=?";
    private static final String viewWithCondition = "SELECT * FROM students WHERE id=?";

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

    public void addStudent(StudentPOJO s) {
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(addStatement)
        ) {
            ps.setString(1, s.name);
            ps.setString(2, s.section);
            ps.setInt(3, s.marks);

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
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}