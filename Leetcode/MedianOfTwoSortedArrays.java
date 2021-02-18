/**
* 4. Median of Two Sorted Arrays
* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
* Follow up: The overall run time complexity should be O(log (m+n)).

* Example 1:
* Input: nums1 = [1,3], nums2 = [2]
* Output: 2.00000
* Explanation: merged array = [1,2,3] and median is 2.
*
* Example 2:
* Input: nums1 = [1,2], nums2 = [3,4]
* Output: 2.50000
* Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*
* Example 3:
* Input: nums1 = [0,0], nums2 = [0,0]
* Output: 0.00000
*
* Example 4:
* Input: nums1 = [], nums2 = [1]
* Output: 1.00000
*
* Example 5:
* Input: nums1 = [2], nums2 = []
* Output: 2.00000
*
* Constraints:
*    nums1.length == m
*    nums2.length == n
*    0 <= m <= 1000
*    0 <= n <= 1000
*    1 <= m + n <= 2000
*    -106 <= nums1[i], nums2[i] <= 106
*/
class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArr[] = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0; // pointers
        // merge the two arrays
        while(i < nums1.length & j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                mergedArr[k] = nums1[i];
                i++;
            } else {
                mergedArr[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        // check to see what elements are leftover
        while(i < nums1.length) {
            mergedArr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length) {
            mergedArr[k] = nums2[j];
            j++;
            k++; 
        }
        // if the length is even, take the two middle elements and divide by 2
        if(mergedArr.length % 2 == 0) {
            int a1 = mergedArr[mergedArr.length / 2];
            int a2 = mergedArr[(mergedArr.length / 2) - 1];
            double median = ((double)a1 + (double)a2) / 2;
            return median;
        } else {
            int medianIndex = mergedArr.length / 2;
            return mergedArr[medianIndex];
        }
    }
}
