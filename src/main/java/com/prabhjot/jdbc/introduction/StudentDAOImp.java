package com.prabhjot.jdbc.introduction;

interface StudentDAO {
    void selectAllStudents();

    void addStudent(StudentPOJO s);

    void updateStudentName(int id, String name);

    void updateStudentMarks(int id, int marks);

    void deleteStudent(int id);

    void selectStudentById(int id);
}
