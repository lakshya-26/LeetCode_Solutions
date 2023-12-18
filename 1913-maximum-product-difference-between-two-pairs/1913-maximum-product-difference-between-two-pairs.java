class Solution {
    public int maxProductDifference(int[] nums) {
        int[] sortednums=quickSort(nums);
        int n= sortednums.length;
        int maxdiff = (sortednums[n-1]*sortednums[n-2])-(sortednums[0]*sortednums[1]);
        return maxdiff;
    }
    public static int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        sort(array, 0, array.length - 1);
        return array;
    }

    private static void sort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(array, low, j);
        }
        if (i < high) {
            sort(array, i, high);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}