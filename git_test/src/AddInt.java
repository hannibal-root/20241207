public class AddInt {
    public static void main(String[] args) {
        int sum = add(5, 6, 10); // Should be 21

        System.out.println(sum);
 
  
  
        System.out.println(neg(5, 6, 10));

        System.out.println(neg(5,6,10));
        System.out.println(power (5, 4));

    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int neg(int a, int b, int c) {
        return a + (b * -1) + c;

        public static int  ( int a, int b){
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
            return a / b;
        }
    }

    public static int power(int a, int b){
        return a * b;
    }
}