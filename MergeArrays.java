public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Index for the last element of merged array
        int mergedIndex = m - 1;

        // Index for last non-vacant element in array X
        int xIndex = n - 1;

        // Index for last element in array Y
        int yIndex = n - 1;

        // Iterate through the merged array from the end
        while (xIndex >= 0 && yIndex >= 0) {
            if (X[xIndex] > Y[yIndex]) {
                X[mergedIndex] = X[xIndex];
                xIndex--;
            } else {
                X[mergedIndex] = Y[yIndex];
                yIndex--;
            }
            mergedIndex--;
        }

        // If there are elements remaining in array Y, add them to array X
        while (yIndex >= 0) {
            X[mergedIndex] = Y[yIndex];
            yIndex--;
            mergedIndex--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        mergeArrays(X, Y);
        
        // Printing the merged array
        for (int num : X) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 5 6 8 9 10 15
    }
}