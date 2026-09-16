# 112A - Petya and Strings

## Problem

Petya has two strings of the same length containing uppercase and lowercase Latin letters.

He wants to compare the strings lexicographically.

The comparison is case-insensitive, meaning uppercase and lowercase versions of the same letter are considered equal.

## Approach

1. Read the two strings.
2. Convert both strings to lowercase.
3. Compare them lexicographically using Java's `compareTo()` method.
4. Print:
   - `-1` if the first string is smaller.
   - `1` if the first string is greater.
   - `0` if both strings are equal.

## Example

### Input

```text
abs
Abz