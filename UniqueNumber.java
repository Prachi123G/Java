public class UniqueNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 2, 3, 6, 5};

        int uniqueNumber = findUnique(numbers);

        System.out.println("The unique number is: " + uniqueNumber);
    }

    public static int findUnique(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        return result;
    }


}
