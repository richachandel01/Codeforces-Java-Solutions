# Codeforces 677A - Vanya and Fence

## Problem

There are n friends walking along a fence of height h.

- If a person's height is less than or equal to h, they can walk normally.
  Their width is 1.
- If a person's height is greater than h, they must bend down.
  Their width is 2.

Find the minimum total width of the road.

## Approach

For every person:

- If `height <= h`, add 1 to the width.
- Otherwise, add 2 to the width.

Finally, print the total width.

## Example

Input:
```text
3 7
4 5 14