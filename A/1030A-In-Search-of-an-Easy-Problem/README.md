# Codeforces 1030A - In Search of an Easy Problem

## Problem

Given the opinions of n people about a problem:

- `0` means the problem is easy.
- `1` means the problem is hard.

Print `HARD` if at least one person thinks the problem is hard.
Otherwise, print `EASY`.

## Approach

1. Read the number of people.
2. Read each response.
3. If any response is `1`, mark the problem as hard.
4. After checking all responses:
   - Print `HARD` if at least one response was `1`.
   - Otherwise, print `EASY`.

## Example

### Input
3
0 0 1

### Output
HARD

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)