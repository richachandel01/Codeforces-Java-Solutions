# Codeforces 110A - Nearly Lucky Number

## Problem

A lucky number contains only the digits `4` and `7`.

A number is called nearly lucky if the number of lucky digits in it
is itself a lucky number.

## Approach

1. Read the given number as a String.
2. Count how many digits are `4` or `7`.
3. The count can only be from 0 to 19 because n <= 10^18.
4. Check whether the count is a lucky number.
5. Print `YES` if it is lucky, otherwise print `NO`.

For this problem, the possible lucky counts are:
- 4
- 7

## Example

### Input
7747774

### Output
YES

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)