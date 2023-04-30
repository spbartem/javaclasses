package level1.javacore.collection.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
//        int[] arrForBinarySearch = {1, 3, 7, 8, 9, 123, 124, 225, 1000, 1500};
//        System.out.println(binarySearch(arrForBinarySearch, 124));

//        System.out.println(fib1(17));
        System.out.println(fib2(3));
    }

    // сложность алгоритма O(n) - линейная
    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length -1;

        while (low < high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid - 1;
            }
        }
        return -1;
    }

    // поиск числа Фибоначчи - вариат 1 сложность алгоритма O(2^n);
    public static long fib1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    // поиск числа Фибоначчи - вариант 2 сложность O(n);
    public static long fib2(int n) {
        long f1 = 1;
        long f2 = 1;
        long i = 0;
        while (i < n - 2) {
            long sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            i = i + 1;
        }
        return f2;
    }
}
