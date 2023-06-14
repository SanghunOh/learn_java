public class LoopNestedLoops {
    public static void main(String[] args) {

        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("for " + first);
            for (int second = 1; second <= 4; second = second + 1) {
                if (first >= second) {
                    System.out.print("_?");
                }
            }
            System.out.println();
        }
        System.out.println("end");
        // return 0;
    }
}
