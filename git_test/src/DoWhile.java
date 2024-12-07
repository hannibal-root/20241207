public class DoWhile {
    public static void main(String[] args) {
        int maxIterations = 5;
        int threshold = 3;
        int counter = 0;

        do {
            System.out.println("Iteration " + counter);
            counter++;
        } while (counter < maxIterations && counter < threshold);

        System.out.println("Ciklus vége!");
    }
}