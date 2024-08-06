package codingNinja.SearchingAndSorting;

public class SearchingAndSorting {
    public static void main(String[] args) {
        int []n = {1,3,4,7,8,9,10};
        int index = binaryseach(n,2);
        System.out.println("Index is "+ index);
    }
    public static int binaryseach(int[]nums, int target){
        int s = 0;
        int e = nums.length;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]>target){
                e = mid-1;
            } else if (nums[mid] < target) {
                s = mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
