# 282A - Bit++

## Problem

Bit++ is a programming language that has only one variable `x`.

There are two operations:

- `++` increases `x` by 1.
- `--` decreases `x` by 1.

The initial value of `x` is `0`.

Given `n` statements, execute all of them and print the final value of `x`.

## Approach

1. Initialize `x = 0`.
2. Read the number of statements.
3. For every statement:
   - If it contains `++`, increase `x` by 1.
   - Otherwise, decrease `x` by 1.
4. Print the final value of `x`.

## Example

### Input

```text
2
X++
--X