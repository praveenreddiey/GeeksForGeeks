package org.geeksforgeeks.easy.binarysearch;

public class CountOf1s {
    public static void main(String[] args) {
        System.out.println(countOnes(new int[]{1, 1, 1, 1, 0, 0, 0}, 7));
    }
    public static int countOnes(int arr[], int N) {
        int low = 0;
        int high = N - 1;
        int mid;
        int count = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == 0) {
                high = mid - 1;
            } else if (arr[mid] == 1) {
                count = count + (mid - low + 1);
                low = mid + 1;
            }
        }
        return count;
    }
}