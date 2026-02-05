package com.prabhjot.java.core.classes.experiment_2.problems_1.moderation;

import com.prabhjot.java.core.classes.experiment_2.problems_1.Student;

public class DifficultyModeration extends Moderation {

    public DifficultyModeration(Student student) {
        super(student);
    }

    @Override
    public void applyModeration() {
        System.out.println("Applying Difficulty Moderation");
    }

}

