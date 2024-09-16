package ImperativeVsDeclarative.Example1;

import java.util.Arrays;
import java.util.List;

public class Declarative {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 5, 1, 7, 8, 4, 9);
        find(ints, 8);
    }
    static void find(List<Integer> ints, int num) {
        if(ints.contains(num))
            System.out.println(num+" Found");
        else
            System.out.println(num+" Not Found");
    }
}
