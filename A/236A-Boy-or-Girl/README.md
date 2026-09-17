# Codeforces 236A - Boy or Girl

## Problem
Given a username, determine the user's gender based on the number of distinct characters.

- Even number of distinct characters: `CHAT WITH HER!`
- Odd number of distinct characters: `IGNORE HIM!`

## Approach
1. Read the username.
2. Store each character in a HashSet.
3. HashSet automatically removes duplicate characters.
4. Check whether the size of the HashSet is even or odd.
5. Print the required message.

## Example

### Input
wjmzbmr

### Output
CHAT WITH HER!

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)