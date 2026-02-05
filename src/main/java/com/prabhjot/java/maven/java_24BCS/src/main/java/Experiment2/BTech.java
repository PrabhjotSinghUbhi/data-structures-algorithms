package Experiment2;

class BTech implements Program{

    public int finalMarks(Student s){
        return (s.theory*70 + s.lab*30)/100;
    }

    public String grade(int m){
        if(m>=75) return "A";
        if(m>=60) return "B";
        if(m>=50) return "C";
        return "F";
    }
}