# Codeforces 469A - I Wanna Be the Guy

## Problem

There are n levels in a game.

Little X can pass some levels and Little Y can pass some levels.
They cooperate with each other.

We need to check whether together they can pass all n levels.

## Approach

- Create a boolean array `levels`.
- Mark every level that Little X can pass as `true`.
- Mark every level that Little Y can pass as `true`.
- Check levels from 1 to n.
- If any level is still `false`, they cannot pass the whole game.
- Otherwise, they can pass all levels.

## Output

If all levels are covered:

```text
I become the guy.