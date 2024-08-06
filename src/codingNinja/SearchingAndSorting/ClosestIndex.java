package codingNinja.SearchingAndSorting;

import java.util.Scanner;

public class ClosestIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int left = 0;
        int right = n-1;
        int x = s.nextInt();
        int result = binarySearchClosest(arr,left,right,x);
        System.out.print(result);
    }
    public static int binarySearchClosest(int[] arr, int left, int right, int x){
        right = arr.length - 1;
        left = 0;
        while(left <= right){

            int mid = left+(right-left)/2;

            if (arr[mid] == x){
                return mid;
            } else if (arr[mid]<x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
            return left;
        } else {
            return right;
        }
    }
}
