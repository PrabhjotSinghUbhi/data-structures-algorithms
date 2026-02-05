package com.prabhjot.java.core.classes.experiment_2.problems_1;

import com.prabhjot.java.core.classes.experiment_2.problems_1.department.Department;

public class Student {
    Department department;
    private double theoryMarks;
    private double labMarks;

    public Student(double theoryMarks, double labMarks, Department department) {
        this.theoryMarks = theoryMarks;
        this.labMarks = labMarks;
        this.department = department;
    }

    public double getTheoryMarks() {
        return theoryMarks;
    }

    public void setTheoryMarks(double theoryMarks) {
        this.theoryMarks = theoryMarks;
    }

    public double getLabMarks() {
        return labMarks;
    }

    public void setLabMarks(double labMarks) {
        this.labMarks = labMarks;
    }

    public void calculateGrade() {
        System.out.println(GRADE.A);
    }


}
