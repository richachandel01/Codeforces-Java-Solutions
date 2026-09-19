# Codeforces 734A - Anton and Danik

## Problem
Anton and Danik played n chess games. Each game was won by either Anton (`A`) or Danik (`D`).

Determine who won more games.

## Approach
1. Read the number of games and the result string.
2. Count the number of `A` characters.
3. Count the number of `D` characters.
4. Compare both counts:
   - If Anton has more wins, print `Anton`.
   - If Danik has more wins, print `Danik`.
   - Otherwise, print `Friendship`.

## Example

### Input
6
ADAAAA

### Output
Anton

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)