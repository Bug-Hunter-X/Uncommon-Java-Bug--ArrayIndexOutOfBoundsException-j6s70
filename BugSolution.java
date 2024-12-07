public class BugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // Check the index before accessing
        if (0 <= 4 && 4 < arr.length) {
            arr[4] = 10; // Corrected index
            System.out.println(arr[4]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}