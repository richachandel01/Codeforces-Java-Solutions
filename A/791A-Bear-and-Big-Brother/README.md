# Codeforces 791A - Bear and Big Brother

## Problem
Limak and Bob have weights `a` and `b`.

Every year:
- Limak's weight is tripled.
- Bob's weight is doubled.

Find the number of full years after which Limak becomes strictly heavier than Bob.

## Approach
1. Read Limak's weight `a` and Bob's weight `b`.
2. While `a` is less than or equal to `b`:
   - Multiply `a` by 3.
   - Multiply `b` by 2.
   - Increment the year count.
3. When `a > b`, print the number of years.

## Example

### Input
4 7

### Output
2

## Complexity
- Time Complexity: O(log b)
- Space Complexity: O(1)