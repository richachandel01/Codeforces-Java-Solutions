# Codeforces 807A - Is it rated?

## Problem

We are given the ratings of participants before and after a round.

We need to determine whether the round was rated, unrated, or impossible to determine.

## Approach

There are three cases:

1. If any participant's rating changed:
   - The round is definitely rated.
   - Print `rated`.

2. If no rating changed, check the original ratings order:
   - If ratings are not in non-increasing order, print `unrated`.

3. If no rating changed and ratings are in non-increasing order:
   - It is impossible to determine.
   - Print `maybe`.

## Complexity

- Time: O(n)
- Space: O(n)