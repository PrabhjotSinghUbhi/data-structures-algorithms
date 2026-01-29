package com.prabhjot.jdbc.introduction;

public class StudentPOJO {
    String name;
    String section;
    int marks;

    public StudentPOJO(String name, int marks, String section) {
        this.name = name;
        this.marks = marks;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
