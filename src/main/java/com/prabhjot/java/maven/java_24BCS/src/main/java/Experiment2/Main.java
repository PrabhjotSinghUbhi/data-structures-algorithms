package Experiment2;

public class Main{
    public static void main(String[] args){

        Student a=new Student("Rahul",70,60);
        Student b=new Student("Meena",80,75);
        Student c=new Student("Arjun",65,85);

        EvaluationSoftware btech=new Software(new BTech());
        btech.addRule(new AttendanceRule());
        btech.addRule(new DifficultyRule());

        EvaluationSoftware mca=new Software(new MCA());
        mca.addRule(new ManualRule());

        EvaluationSoftware phd=new Software(new PhD());

        btech.evaluate(a);
        mca.evaluate(b);
        phd.evaluate(c);
    }
}