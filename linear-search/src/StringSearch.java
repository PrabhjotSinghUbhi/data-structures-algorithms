import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String Fem = "r ";
        char target = 'v';

        searchString(Fem , target);
    }

    private static void searchString(String fem, char target) {
        if(fem.isEmpty()){
            System.out.println("invalid");
            return;
        }
        for (int element: fem.toCharArray()){
            if(target == element) {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}
