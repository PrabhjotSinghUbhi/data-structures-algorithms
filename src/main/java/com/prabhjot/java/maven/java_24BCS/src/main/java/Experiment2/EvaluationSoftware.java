package Experiment2;

import Experiment2.Program;
import Experiment2.Student;

import java.util.ArrayList;
import java.util.List;

abstract class EvaluationSoftware {

    Program program;
    List<ModerationRule> rules = new ArrayList<>();

    EvaluationSoftware(Program p) {
        program = p;
    }

    void addRule(ModerationRule r) {
        rules.add(r);
    }

    void evaluate(Student s) {

        for (ModerationRule r : rules)
            r.apply(s);

        int marks = program.finalMarks(s);
        String g = program.grade(marks);

        System.out.println(s.name + " -> " + marks + " -> " + g);
    }
}