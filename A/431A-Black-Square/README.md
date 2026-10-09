# Codeforces 431A - Black Square

## Problem

Four integers represent the calories burned on each of four strips. Given a string describing the strips stepped on, calculate the total calories burned.

## Approach

1. Store the four calorie values in an array.
2. Read the string.
3. For every character, find the corresponding array index using `s.charAt(i) - '1'`.
4. Add the calorie value to the total.
5. Print the total.

## Complexity

* Time: O(n)
* Auxiliary Space: O(1)
