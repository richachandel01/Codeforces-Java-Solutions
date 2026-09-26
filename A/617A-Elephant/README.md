# Codeforces 617A - Elephant

## Problem

An elephant is at point 0 and needs to reach point x.

In one step, the elephant can move 1, 2, 3, 4, or 5 positions.

We need to find the minimum number of steps required.

## Approach

The elephant can move at most 5 positions in one step.

Therefore:

minimum steps = ceil(x / 5)

In integer arithmetic, we can calculate this as:

(x + 4) / 5

## Example

Input:
```text
12