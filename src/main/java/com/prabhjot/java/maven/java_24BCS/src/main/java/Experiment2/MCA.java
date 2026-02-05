package Experiment2;

class MCA implements Program{

    public int finalMarks(Student s){
        return (s.theory*60 + s.lab*40)/100;
    }

    public String grade(int m){
        if(m>=70) return "A";
        if(m>=55) return "B";
        return "F";
    }
}