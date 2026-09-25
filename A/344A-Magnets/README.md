# Codeforces 344A - Magnets

## Problem
Given n magnets, each magnet is either `01` or `10`.
We need to find the number of groups of consecutive magnets having the same orientation.

## Approach
- Start with one group.
- Compare each magnet with the previous magnet.
- If their orientations are different, a new group starts.
- Increment the group count.

## Complexity
- Time: O(n)
- Space: O(1)

## Example

Input:
```text
6
10
10
10
01
10
10