/**
* 42. Trapping Rain Water
* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*
* Example 1:
* Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
* Output: 6
* Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
*
* Example 2:
* Input: height = [4,2,0,3,2,5]
* Output: 9
*
* Constraints:
*   n == height.length
*   0 <= n <= 3 * 104
*   0 <= height[i] <= 105
*/

class TrappingRainWater {
    public int trap(int[] height) {
     //Initialize rainWater as 0
        int rainWater = 0;
        int left = 0;
        int right = 0;
        //Compare the max on each side of the value
        for(int i = 1; i < height.length; i++) {
            left = height[i];
            for(int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }
            right = height[i];
            for(int j = i+1; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }
            //Take the minimum of the maximums and minus the height of the value
            rainWater += Math.min(left, right) - height[i];
        }
        return rainWater;
    }
}
