package Experiment2;

class AttendanceRule implements ModerationRule {
    public void apply(Student s) {
        s.theory += 5;
    }
}