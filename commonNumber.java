import java.util.HashSet;

public class commonNumber {



        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {3, 4, 5, 6, 7};

            findCommonNumbers(array1, array2);
        }

        public static void findCommonNumbers(int[] arr1, int[] arr2) {
            HashSet<Integer> set = new HashSet<>();

            // Add elements from the first array to the HashSet
            for (int num : arr1) {
                set.add(num);
            }

            System.out.println("Common numbers:");

            // Check if elements in the second array are present in the HashSet
            for (int num : arr2) {
                if (set.contains(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }

