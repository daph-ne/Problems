# PROBLEMS

## Leetcode
| Problem number | Problem | Category | Remarks |
|:-----:|:-----:|:-----:|:----:|
|1480|[Running Sum of 1d Array](./Leetcode/RunningSumOf1dArray.java)|Easy|Loop through array; add summation of previous|
|1672|[Richest Customer Wealth](./Leetcode/RichestCustomerWealth.java)|Easy|Find sum of individual wealth; Max of summed array is richest|
|11|[Container With Most Water](./Leetcode/ContainerWithMostWater.java)|Medium|Measure water between initial to final value; Max value is area of container|
|1|[Two Sum](./Leetcode/TwoSum.java)|Easy|Create new array with size 2 since only one valid answer exists; Loop through the array; Check if sum is target and return the indeces|
|34|[Find First and Last Position of Element in Sorted Array](./Leetcode/FindFirstAndLastPositionOfElementInSortedArray.java)|Medium|Preset output values to -1, -1; Use binary search; Replace output with index if target is found| 
|42|[Trapping Rain Water](./Leetcode/TrappingRainWater.java)|Hard|Initialize rainWater as 0; Compare the max on each side of the value; Take the minimum of the maximums and minus the height|
|4|[Median of Two Sorted Arrays](./Leetcode/MedianOfTwoSortedArrays.java)|Hard|merge the two arrays; check to see what elements are leftover; if the length is even, take the two middle elements and divide by 2|
|74|[Search a 2D Matrix](./Leetcode/SearchA2DMatrix.java )|Medium|Loop nested for loops; Return true if target is found; Otherwise return false|
|21|[Merge Two Sorted Lists](./Leetcode/ListNode.java)| Easy | Choose smaller value; Append to list; Move pointer forward; Append the remaining when one list is empty.|
|771|[Jewels and Stones](./Leetcode/JewelsAndStones.java)|Easy| Iterate using inner for loop; add count when same element is found. |
|1108|[Defanging an IP Address](./Leetcode/DefangingAnIPAddress.java) | Easy | Method 1 <br> Using replace keyword <br> <br> Method 2 <br> Create new string; replace the required characters|
|31| [Next Permutation](./Leetcode/NextPermutation.java)| Medium | Solved from the last index <br> 'i' is the first small number after a large number. <br> 'j' is the first number larger than 'i'. <br> Swap i and j. <br> Reverse the remaining indexes after i. |



## Others
| Problem number | Problem | Remarks | 
|:-----:|:-----:|:-----:|
|1| [Print the word with odd letters as X](./Others/WordWithOddLetters.java)|Loop from beginning and the end; Set value in required index; Fill the other indeces with spaces; Print new line| 
|2| [Save the string in a two dimensional array and search for substring](./Others/StringToTwoDimensional.java)|Save the string as a grid; Look for target string horizontally and vertically; If present, print the start and end index|
|3| [Print rupee in different currencies](./Others/DifferentCurrencies.java)|Create separate methods for calculating and printing each currency|
|4| [Find sum of weights based on the following conditions](./Others/SumOfWeights.java)|Create new array and insert total weight of each number(same index); Sort weights array and reposition values in input array accordingly; Print as required|
|5| [Find number of grandchildren](./Others/Grandchildren.java)|Split 2d array into child and father arrays; Find child and replace father with that child; Increment the value of grandchildren for the number of time the father is present;|
|6| [Alternate sorting](./Others/AlternateMaxMin.java)|Create new array; Insert last element and first element of input array into the new array alternatively.| 
|7| [Sort the elements in odd positions in descending order and elements in ascending order](./Others/SortOddEvenPositions.java)|Sort odd positions of input separately; Sort even positions of input separately; Print the sorted input|
|8| [Remove unbalanced parentheses in a given expression](./Others/UnbalancedParentheses.java)| Change the given string to array; Count number of open and closed brackets; Find number of extra brackets; Remove the extra brackets by copying the remaining to a new string.|
|9| [Repeating alphabet given number of times](./Others/NumbersAndFrequency.java)| |
|10| [Merge arrays without repeating the elements](./Others/MergeSortedArrays.java) | |
|11| [Star Printing](./Others/StarPrinting.java) | Count spaces and stars and program accordingly|
|12| [Find the extra element and its index](./Others/FindingExtraElement.java) | Sort both arrays; Compare index of both arrays; If different it is extra.|
|13| [Pattern Printing (Pyramid numbers)](./Others/PatternPrinting.java)| 3 for loops: <br> 1. for Spaces <br> 2. for Numbers in ascending order <br> 3. for Numbers in descending order | 
|14| [Number to be added to get the total](./Others/NumToBeAdded.java)| Use scanner to get input of 1 value and total; total - given value to get the required value. |
|15| [Find the least prime number that can be added with first array element that makes them divisible by second array](./Others/AddPrimeNumber.java)| Find remainder when divided; Find what should be added to the reminder |
|16| [Sort the array elements in descending order according to their frequency of occurrence](./Others/SortByFrequency.java) | Sort the given input; Count different numbers; Create 2 new arrays for numbers and its frequency; Sort frequency array in descending order and numbers array accordingly; Sort in ascending when frequency is same; Print each number frequency number of times.|
|17| [Print true if second string is a substring of first string, else print false](./Others/SubString.java) | re-running the same function until there are no remaining characters in substring. If it becomes 0, true, else false. |



