public class DivideandConquer {
    // MergeSort
    // public static void mergeSort(int arr[], int si, int ei) {
    // if (si >= ei)
    // return;

    // int mid = si + (ei - si) / 2;
    // mergeSort(arr, si, mid);
    // mergeSort(arr, mid + 1, ei);
    // merge(arr, si, mid, ei);

    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    // int temp[] = new int[ei - si + 1];
    // int i = si;
    // int j = mid + 1;
    // int k = 0;
    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }
    // for (k = 0, i = si; k < temp.length; i++, k++) {
    // arr[i] = temp[k];
    // }
    // }

    // public static void prntArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }

    // public static void main(String args[]) {
    // int arr[] = { 6, 3, 9, 5, 2, 8 };
    // mergeSort(arr, 0, arr.length - 1);
    // prntArr(arr);
    // }

    // Quick Sort
    // public static void prntArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }

    // public static int partition(int arr[], int si, int ei) {
    // int pivot = arr[ei];
    // int i = si - 1;
    // for (int j = si; j < ei; j++) {
    // if (arr[j] <= pivot) {
    // i++;
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // }
    // }
    // i++;
    // int temp = pivot;
    // arr[ei] = arr[i];
    // arr[i] = temp;
    // return i;
    // }

    // public static void quickSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // int pIdx = partition(arr, si, ei);
    // quickSort(arr, si, pIdx - 1);
    // quickSort(arr, pIdx + 1, ei);
    // }

    // public static void main(String[] args) {
    // int arr[] = { 6, 3, 9, 5, 2, 8 };
    // quickSort(arr, 0, arr.length - 1);
    // prntArr(arr);
    // }

    // sorted and rotated array search

    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        // Line 1
        if (arr[si] <= arr[mid]) {
            // Left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } // Right
            else {
                return search(arr, tar, mid + 1, ei);
            }
            // Line 2
        } else {
            // Right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // Left
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target=0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }

    // Assignment 1

    // public static void strSort(String arr[], int si, int ei) {
    // if (si >= ei)
    // return;

    // int mid = si + (ei - si) / 2;
    // strSort(arr, si, mid);
    // strSort(arr, mid + 1, ei);
    // merge(arr, si, mid, ei);

    // }

    // public static boolean isAlphabeticallySmaller(String str1, String str2) {
    // if (str1.compareTo(str2) < 0) {
    // return true;

    // }
    // return false;

    // }

    // public static void merge(String arr[], int si, int mid, int ei) {
    // String temp[] = new String[ei - si + 1];
    // int i = si;
    // int j = mid + 1;
    // int k = 0;
    // while (i <= mid && j <= ei) {
    // if (isAlphabeticallySmaller(arr[i], arr[j])) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }
    // for (k = 0, i = si; k < temp.length; i++, k++) {
    // arr[i] = temp[k];
    // }
    // }

    // public static void prntArr(String arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // }

    // public static void main(String args[]) {
    // String arr[] = { "sun", "earth", "mars", "mercury" };
    // strSort(arr, 0, arr.length - 1);
    // prntArr(arr);
    // }
}