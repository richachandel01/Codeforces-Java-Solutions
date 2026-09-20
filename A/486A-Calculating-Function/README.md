# Codeforces 486A - Calculating Function

## Problem

For a positive integer n, calculate:

f(n) = -1 + 2 - 3 + 4 - 5 + ... + (-1)^n * n

## Approach

Instead of calculating every term, observe the pattern.

If n is even:

f(n) = n / 2

If n is odd:

f(n) = -(n + 1) / 2

Since n can be as large as 10^15, we use `long` in Java.

## Example

### Input
4

### Output
2

### Input
5

### Output
-3

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)