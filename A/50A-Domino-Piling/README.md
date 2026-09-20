# Codeforces 50A - Domino Piling

## Problem

Given a rectangular board of M × N squares and unlimited 2 × 1 dominoes,
find the maximum number of dominoes that can be placed on the board.

Each domino covers exactly two squares.

## Approach

1. Calculate the total number of squares: M × N.
2. Each domino covers 2 squares.
3. Therefore, the maximum number of dominoes is:

   answer = (M × N) / 2

Integer division automatically handles odd-sized boards.

## Example

### Input
3 3

### Output
4

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)