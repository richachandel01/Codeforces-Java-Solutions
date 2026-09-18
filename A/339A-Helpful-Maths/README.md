# Codeforces 339A - Helpful Maths

## Problem
Given a sum containing numbers 1, 2, and 3 separated by plus signs, rearrange the numbers in non-decreasing order.

## Approach
1. Read the input string.
2. Remove all plus signs.
3. Convert the remaining digits into a character array.
4. Sort the character array.
5. Add plus signs between the sorted digits.
6. Print the result.

## Example

### Input
3+2+1

### Output
1+2+3

## Complexity
- Time Complexity: O(n log n)
- Space Complexity: O(n)