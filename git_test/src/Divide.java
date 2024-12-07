public class Divide {
    public static void main(String[] args) {
        //TODO:  Csinálj egy Divide osztályt, és bele egy div függvényt, ami oszt két számot egymásból.

        double a = 15;
        double b = 2;
        double div = divide(a, b);
        System.out.println(div);
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
