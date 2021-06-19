# PROBLEMS

## Leetcode
| Problem number |Language| Problem | Category | Remarks |
|:-----:|:-----:|:-----:|:-----:|:----:|
|1480|Java|[Running Sum of 1d Array](./Leetcode/RunningSumOf1dArray.java)|Easy|Loop through array; add summation of previous|
|1672|Java|[Richest Customer Wealth](./Leetcode/RichestCustomerWealth.java)|Easy|Find sum of individual wealth; Max of summed array is richest|
|11|Java|[Container With Most Water](./Leetcode/ContainerWithMostWater.java)|Medium|Measure water between initial to final value; Max value is area of container|
|1|Java|[Two Sum](./Leetcode/TwoSum.java)|Easy|Create new array with size 2 since only one valid answer exists; Loop through the array; Check if sum is target and return the indeces|
|34|Java|[Find First and Last Position of Element in Sorted Array](./Leetcode/FindFirstAndLastPositionOfElementInSortedArray.java)|Medium|Preset output values to -1, -1; Use binary search; Replace output with index if target is found| 
|42|Java|[Trapping Rain Water](./Leetcode/TrappingRainWater.java)|Hard|Initialize rainWater as 0; Compare the max on each side of the value; Take the minimum of the maximums and minus the height|
|4|Java|[Median of Two Sorted Arrays](./Leetcode/MedianOfTwoSortedArrays.java)|Hard|merge the two arrays; check to see what elements are leftover; if the length is even, take the two middle elements and divide by 2|
|74|Java|[Search a 2D Matrix](./Leetcode/SearchA2DMatrix.java )|Medium|Loop nested for loops; Return true if target is found; Otherwise return false|
|21|Java|[Merge Two Sorted Lists](./Leetcode/ListNode.java)| Easy | Choose smaller value; Append to list; Move pointer forward; Append the remaining when one list is empty.|
|771|Java|[Jewels and Stones](./Leetcode/JewelsAndStones.java)|Easy| Iterate using inner for loop; add count when same element is found. |
|771|JavaScript|[Jewels and Stones](./Leetcode/JewelsAndStones.js)|Easy| Iterate using inner for loop; add count when same element is found. |
|1108|Java|[Defanging an IP Address](./Leetcode/DefangingAnIPAddress.java) | Easy | Method 1 <br> Using replace keyword <br> <br> Method 2 <br> Create new string; replace the required characters|
|31|Java|[Next Permutation](./Leetcode/NextPermutation.java)| Medium | Solved from the last index <br> 'i' is the first small number after a large number. <br> 'j' is the first number larger than 'i'. <br> Swap i and j. <br> Reverse the remaining indexes after i. |
|1773|Java| [Count Items Matching a Rule](./Leetcode/CountItemsMatchingARule.java) | Easy | Iterate through the list; <br> Find matching using switch case|
|1528|Java| [Shuffle String](./Leetcode/ShuffleString.java) | Easy | Create new char array; <br> Loop; <br> Place each character in the given index of new array.|
|1678|Java| [Goal Parser Interpretation](./Leetcode/GoalParserInterpretation.java) | Easy | Replace each character with given and move the index accordingly. |
|1281|Java| [Subtract the Product and Sum of Digits of an Integer](./Leetcode/SubtractProductSum.java) | Easy | Use modulus and remove last digit after each calculation |
|650| Java|[2 Keys Keyboard](./Leetcode/TwoKeysKeyboard.java) |Medium |  loop until it becomes 1; make it even if odd and divide by 2 |
|71|Java| [Simplify Path](./Leetcode/SimplifyPath.java) |Medium| Create new stack <br> Split the path <br> Push each level and pop when .. is present|
|2| Java|[Add Two Numbers](./Leetcode/AddTwoNumbers.java) | Medium | Add each number from both list <br> if sum > 9, carry 1 to the next next sum <br> Current number is sum % 10 |
|948|Java| [Bag of Tokens](./Leetcode/BagOfTokens.java) |Medium| Sort the array <br> If power is less, consider gaining power from the last element and continue the same process |
|200|Java| [Number of Islands](,/Leetcode/NumberOfIslands.java) |Medium| Run through the aray, if '1', check all 4 sides to find 1 and increase the ount of islands|
| 5|Java| [Longest Palindromic Substring](./Leetcode/LongestPalindromicSubstring.java) | Medium | Take substring from first to last and check palindrome <br> if not, shrink the substring and keep checking |
|238|Java| [Product of Array Except Self](./Leetcode/ProductOfArrayExceptSelf.java) | Medium | Mulifply each from the first element and then from the last element |
|20|Java| [Valid Parentheses](./Leetcode/ValidParentheses.java) | Easy | Push and pop in a stack if perfect pair or else return false. If stack is empty at the end, it is a valid parentheses|
|1603|JavaScript| [Design Parking System](./Leetcode/DesignParkingSystem.js) | Easy | |
|1342|JavaScript| [Number of Steps to Reduce a Number to Zero](./Leetcode/ReduceNumToZero.js)|Easy|Used recursion |
|1662|JavaScript| [Check If Two String Arrays are Equivalent](./Leetcode/CheckIfArraysAreEquivalent.js)|Easy| Join both strings and check if equivalent |
|1450|JavaScript| [Number of Students Doing Homework at a Given Time](./Leetcode/StudentsDoingHomeworkAtGivenTime.js)|Easy||
|1859|JavaScript| [ Sorting the Sentence](./Leetcode/SortingtheSentence.js)|Easy|Split; <br> Place the word on the last number - 1th index of the new array |
|33|JavaScript| [Search in Rotated Sorted Array](./Leetcode/SearchinRotatedSortedArray.js) |Medium| Run through the array and return the i-th index if true, else return -1.|


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



