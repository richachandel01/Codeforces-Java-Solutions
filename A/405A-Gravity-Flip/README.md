# Codeforces 405A - Gravity Flip

## Problem
There are n columns of cubes. When gravity is switched, all cubes move towards the right side.

Therefore, the final heights of the columns are the heights sorted in ascending order.

## Approach
1. Read the n column heights.
2. Sort the array in ascending order.
3. Print the sorted array.

## Example

Input:
4
3 2 1 2

Output:
1 2 2 3

## Complexity
- Time: O(n log n)
- Space: O(1) auxiliary space