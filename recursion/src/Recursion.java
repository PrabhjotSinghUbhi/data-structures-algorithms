public class Recursion {
    public static void main(String[] args) {
        int n = 1;
        printf(n);
    }
    static void printf(int n){
        System.out.println(n);
        if (n == 5){
            return;
        }
        printf(n+1);
    }
}