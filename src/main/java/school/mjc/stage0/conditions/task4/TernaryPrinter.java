package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        String result = first > second ? "first" : "second";

        //String print = result == first ? "first" : "second";

        System.out.println(result);
    }
}
