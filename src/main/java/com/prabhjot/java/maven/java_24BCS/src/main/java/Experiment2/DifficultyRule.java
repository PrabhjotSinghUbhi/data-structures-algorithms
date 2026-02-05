package Experiment2;

class DifficultyRule implements ModerationRule {
    public void apply(Student s) {
        s.lab += 3;
    }
}