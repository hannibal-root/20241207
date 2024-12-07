public class PrintArray {
    public static void main(String[] args) {
        int[] numberArray = {4, 5, 2, 3, 4};

        prntArr(numberArray);
    }

    private static void prntArr(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }
}
