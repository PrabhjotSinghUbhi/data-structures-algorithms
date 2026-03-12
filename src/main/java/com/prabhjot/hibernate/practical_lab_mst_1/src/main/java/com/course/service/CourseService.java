package com.course.service;

import com.course.exception.CourseFullException;
import com.course.exception.CourseNotFoundException;
import com.course.exception.DuplicateEnrollmentException;
import com.course.model.Course;
import com.course.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService {

    List<Course> courses = new ArrayList<>();
    Map<Integer, List<Integer>> enrollments = new HashMap<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void enrollStudent(int courseId, Student s)
            throws CourseFullException,
            CourseNotFoundException,
            DuplicateEnrollmentException, IOException {

        Course found = null;

        for (Course c : courses) {
            if (c.getCourseId() == courseId) {
                found = c;
                break;
            }
        }

        if (found == null) {
            throw new CourseNotFoundException("Course not found");
        }

        if (found.getEnrolledStudents() >= found.getMaxSeats()) {
            throw new CourseFullException("Course is full");
        }

        enrollments.putIfAbsent(courseId, new ArrayList<>());

        if (enrollments.get(courseId).contains(s.getStudentId())) {
            throw new DuplicateEnrollmentException("Already enrolled");
        }

        enrollments.get(courseId).add(s.getStudentId());

        found.setEnrolledStudents(found.getEnrolledStudents() + 1);

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("courses.txt", true));

        bw.write(courseId + "," + s.getStudentId() + "," + s.getStudentName());
        bw.newLine();
        bw.close();
    }

    public void viewCourses() {

        for (Course c : courses) {
            c.display();
        }

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("courses.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("File read error");
        }

    }
}