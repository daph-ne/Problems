/**
* 34. Find First and Last Position of Element in Sorted Array
* 
* Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
* If target is not found in the array, return [-1, -1].
* Follow up: Could you write an algorithm with O(log n) runtime complexity?
*
* Example 1:
* Input: nums = [5,7,7,8,8,10], target = 8
* Output: [3,4]
*
* Example 2:
* Input: nums = [5,7,7,8,8,10], target = 6
* Output: [-1,-1]
*
* Example 3:
* Input: nums = [], target = 0
* Output: [-1,-1]
*
* Constraints:
*      0 <= nums.length <= 105
*     -109 <= nums[i] <= 109
*     nums is a non-decreasing array.
*     -109 <= target <= 109
*/

class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[2];
        //Preset output values
        output[0] = -1;
        output[1] = -1;
        final int length = nums.length;
        //If it is an empty array
        if(length == 0) {
            output[0] = -1;
            output[1] = -1;
        }
        //If it has only one value
        if(length == 1 && nums[0] == target) {
            output[0] = 0;
            output[1] = 0;
        }
        //If it has two values
        if(length == 2){
            if(nums[0] == target && nums[1] == target) {
                output[0] = 0;
                output[1] = 1;
            } else if(nums[0] == target && nums[1] != target) {
                output[0] = 0;
                output[1] = 0;
            } else if(nums[0] != target && nums[1] == target) {
                output[0] = 1;
                output[1] = 1;
            }
        }
        //Using binary search when length is > 2
        final int mid = length/2;
        int left = mid;
        int right = mid + 1;
        //Replace output with index if target is found
        while(left >=0 && right < length){
            if(nums[left] == target) {
                output[0] = left;
                if(output[1] == -1) {
                    output[1] = left;
                }
            }
            if(nums[right] == target) {
                output[1] = right;
                if(output[0] == -1){
                    output[0] = right;
                }
            }
            left --;
            right++;
        }
            
        return output;
    }
}


class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        //Preset valuews of output to -1, -1
        int[] output = {-1,-1};
        final int length = nums.length;
        //Replace output with index if target is found
        for(int i = 0; i < length; i++) {
            if(nums[i] == target) {
                if(output[0] == -1) {
                    output[0] = i;
                }
                if(nums[i] == target) {
                    output[1] = i;
                }
            }
        }
        return output;
    }
}
