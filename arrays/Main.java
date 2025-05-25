package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. remove element
        int[] nums = {-2,1,-2,4,-1,2,1,-5,4};
        System.out.println("New Length : "+ removeElement(nums, 1));

        // 2. min max
        int[] nums2 = {5,3,8,1,6,9};
        int[] minMax = findMaxMin(nums2);
        System.out.println("min and max : "+ Arrays.toString(minMax));

        // 3. longest String
        String[] names = {"apple", "banana", "kiwi", "pear"};
        System.out.println("Longest String : "+ findLongestString(names));

        // 4. remove duplicates 2
        int[] nums3 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Remove duplicates 2 : "+removeDuplicate2(nums3));
        System.out.println(Arrays.toString(nums3));

        // 5. max profit
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit : "+maxProfit(stockPrices));

        // 6. rotate array
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));

        // 7. maxSubArray
        int[] nums4 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums4));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void rotateArray(int[] arr, int k) {
        for(int start = 0, end = arr.length - k - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for(int start = arr.length - k, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static int removeDuplicate2(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int writePointer = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[writePointer] = nums[i];
                writePointer++;
            }
        }
        return writePointer;
    }

    public static String findLongestString(String[] names) {
        String longestString = "";

        for(String name: names) {
            if(name.length() > longestString.length()) {
                longestString = name;
            }
        }
        return longestString;
    }

    public static int[] findMaxMin(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            } else {
                max = nums[i];
            }
        }

        return new int[]{min, max};
    }

    public static int removeElement(int[] nums, int val) {
        // nums = [-2,1,-2,4,-1,2,1,-5,4]
        // val = 1
        // output

        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
