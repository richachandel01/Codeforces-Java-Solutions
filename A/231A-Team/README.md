# 231A - Team

## Problem

Three friends decide to solve a programming problem if at least two of them are sure about the solution.

For each problem, three values are given:
- `1` means the friend is sure about the solution.
- `0` means the friend is not sure.

We need to count how many problems will be solved.

## Approach

For every problem:

1. Read three values.
2. Calculate their sum.
3. If the sum is at least `2`, at least two friends are sure.
4. Increase the answer by `1`.

## Example

### Input

```text
3
1 1 0
1 1 1
1 0 0