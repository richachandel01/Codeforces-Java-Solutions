# 266A - Stones on the Table

## Problem

There are `n` stones in a row. Each stone can be red (`R`), green (`G`), or blue (`B`).

We need to find the minimum number of stones to remove so that no two neighboring stones have the same color.

## Approach

1. Read the number of stones `n`.
2. Read the string representing the colors.
3. Compare each stone with the previous stone.
4. If two neighboring stones have the same color, increment the removal count.
5. Print the total number of removals.

## Example

### Input

```text
3
RRG
```

### Output

```text
1
```

## Dry Run

Initial string:

```text
RRG
```

Comparisons:

* `R` and `R` are the same → Remove one stone.
* `R` and `G` are different → No removal.

Total removals:

```text
1
```

## Complexity

* Time Complexity: `O(n)`
* Space Complexity: `O(1)` auxiliary space.

## Language

Java
