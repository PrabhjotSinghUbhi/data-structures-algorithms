package Experiment2;

class ManualRule implements ModerationRule{
    public void apply(Student s){
        s.theory += 2;
        s.lab += 2;
    }
}