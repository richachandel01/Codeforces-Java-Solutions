# Codeforces 263A - Beautiful Matrix

## Problem
Given a 5x5 matrix containing exactly one `1` and all other elements as `0`, find the minimum number of moves needed to bring `1` to the center of the matrix.

The center position is `(3, 3)`.

## Approach
1. Read the 5x5 matrix.
2. Find the position of `1`.
3. Calculate the Manhattan distance from `(row, col)` to `(3, 3)`.

Formula:

moves = |row - 3| + |col - 3|

## Complexity
- Time: O(1)
- Space: O(1)
