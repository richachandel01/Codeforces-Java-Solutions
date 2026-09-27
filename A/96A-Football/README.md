# Codeforces 96A - Football

## Problem

A football situation is dangerous if there are at least 7 consecutive
players belonging to the same team.

`0` and `1` represent players from two different teams.

We need to print `YES` if there are 7 consecutive same characters.
Otherwise, print `NO`.

## Approach

- Keep track of consecutive equal characters.
- If the current character is the same as the previous character,
  increment the count.
- Otherwise, reset the count to 1.
- If the count reaches 7, the situation is dangerous.

## Complexity

- Time: O(n)
- Space: O(1)