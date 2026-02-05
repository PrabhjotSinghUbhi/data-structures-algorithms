package Experiment2;

class PhD implements Program{

    public int finalMarks(Student s){
        return (s.theory+s.lab)/2;
    }

    public String grade(int m){
        return m>=70 ? "PASS":"REVISE";
    }
}