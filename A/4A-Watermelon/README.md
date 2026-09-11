# Codeforces 4A - Watermelon

## Problem

Given the weight of a watermelon, determine whether it can be divided into two positive parts such that both parts have even weights.

## Approach

A valid division is possible when:

* The weight is even.
* The weight is greater than 2.

Therefore:

```text
w > 2 && w % 2 == 0
```

## Example

Input:

```text
8
```

Output:

```text
YES
```

Because:

```text
8 = 2 + 6
```

Both parts are positive and even.

## Complexity

* Time: O(1)
* Space: O(1)

## Language

Java
