public class Main {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 5, 7, 8, 2, 4, 73, 8, 3, 446, 9, 1, 3, 45, 75 };

        SortMethods.mergeSort(arr, 0, arr.length - 1);
        int want = 446;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        System.out.println();
        
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        //int midIdx = arr.length / 2;
        int midIdx = 0;
        boolean found = false;
        while (upperBound >= lowerBound) {
            midIdx = (lowerBound + upperBound) / 2;

            if (arr[midIdx] > want) {
                upperBound = midIdx - 1;
            } else if (arr[midIdx] < want) {
                lowerBound = midIdx + 1;
            } else {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(midIdx);
        } else {
            System.out.println("not found");
        }
    }
}
