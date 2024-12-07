public class AddInt {
    public static void main(String[] args) {
        int sum = add(5, 6, 10); // Should be 21

        System.out.println(sum);
    }

    public static int add(int a, int b, int c) {
        return a + b - c;
    }
}