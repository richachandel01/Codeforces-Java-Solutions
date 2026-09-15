# 158A - Next Round

## Problem

A total of `n` participants took part in a contest.

A participant advances to the next round if:

1. Their score is greater than or equal to the score of the participant who finished in the `k`-th position.
2. Their score is positive.

Given the scores of all participants, find the number of participants who advance to the next round.

## Approach

1. Read `n` and `k`.
2. Store the scores of all participants in an array.
3. Find the score of the `k`-th participant using `scores[k - 1]`.
4. Traverse all participants.
5. Count a participant if:
   - Their score is greater than or equal to the `k`-th score.
   - Their score is greater than `0`.
6. Print the count.

## Example

### Input

```text
8 5
10 9 8 7 7 7 5 5